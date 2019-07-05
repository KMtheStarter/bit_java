/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;

import java.awt.Color;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author bit
 */
public class Server {
    // ���ۼ���
    // 1. ServerSocket�� �����ϰ� �����Ѵ�.

    private ServerSocket ss;
    // 2-1 �� ���� ����
    private ArrayList<ServerThread> cList;

    public Server() {

        try {
            // ������ ������ �� �ֵ��� port�� ����
            ss = new ServerSocket(9999);
            System.out.println("Server Start!");
            cList = new ArrayList<ServerThread>();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("�̹� ������� ��Ʈ�Դϴ�.");
        }

    }

    public void execute() {
		// �����ؼ� Socket�� �޴� ���񽺸� �ؾ� �Ѵ�.
        // 2. accept()�� ȣ���ؼ� ���ӵ� Socket�� ��ȯ�Ѵ�.
        while (true) {
            try {
				// Socket�� �ϳ��� ���Ӹ��� ����Ѵ�.
                // ����ڿ��� ������ ������ Thread�� ���� �����ؼ�
                // start()�ϸ鼭, ������� ������ �ּҰ��� ArrayList�� �����Ѵ�.
                Socket s = ss.accept(); // server start�ϸ� �� ����. Ŭ���̾�Ʈ�� ������ ��� �Ѵ�.
                ServerThread ct = new ServerThread(s, this);
                cList.add(ct);
                ct.start();
                System.out.println("Current number of Clients: " + cList.size());
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
            {

            }
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.execute();
    }

    public void sendMessage(String clientMsg, int x, int y, Color color) throws IOException {
        // ���ӵ� ����ڴ� ArrayList�� ����Ǿ� �ֱ� ������
        // �� ����ڿ��� ��Ʈ���� ����ؼ� �ؼ� �޽����� ���� �����Ѵ�.
        for (ServerThread e : cList) {
            Data d = new Data();
            d.setChatting(clientMsg);
            d.setX(x);
            d.setY(y);
            d.setColor(color);
            e.getOos().writeObject(d);
        }

    }
}
