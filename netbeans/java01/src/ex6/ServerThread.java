/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;

import java.awt.Color;
import java.net.Socket;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author bit
 */
public class ServerThread extends Thread {

    private Socket socket;
    private Server server;
    private ObjectInputStream ois;
    private ObjectOutputStream oos;

    public ServerThread(Socket socket, Server server) {
        this.socket = socket;
        this.server = server;
        System.out.println("������ IP: " + socket.getInetAddress().getHostAddress());
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            ois = new ObjectInputStream(socket.getInputStream());
            // readLine()�� ���
            oos = new ObjectOutputStream(socket.getOutputStream());
            // ����� �������κ��� �޼����� ��� �޾ƾ� �Ѵ�.
            while (true) {
                Data d = (Data) ois.readObject();
                String clientMsg = d.getChatting();
                int x = d.getX();
                int y = d.getY();
                Color color = d.getColor();
                System.out.println("Log: " + clientMsg + " / x: " + x + " / y: " + y);
                server.sendMessage(clientMsg, x, y, color);
            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    // �������� ��ε�ĳ������ �ϱ� ���ؼ�
    // Ŭ���̾�Ʈ�� ����� ��Ʈ������ ����ϱ� ����
    // PrintWriter�� �ּҸ� �����Ѵ�.
    public ObjectOutputStream getOos() {
        return oos;
    }
}
