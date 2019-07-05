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
    // 제작순서
    // 1. ServerSocket을 선언하고 생성한다.

    private ServerSocket ss;
    // 2-1 을 위한 선언
    private ArrayList<ServerThread> cList;

    public Server() {

        try {
            // 서버가 접속할 수 있도록 port를 오픈
            ss = new ServerSocket(9999);
            System.out.println("Server Start!");
            cList = new ArrayList<ServerThread>();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("이미 사용중인 포트입니다.");
        }

    }

    public void execute() {
		// 지속해서 Socket을 받는 서비스를 해야 한다.
        // 2. accept()를 호출해서 접속된 Socket을 반환한다.
        while (true) {
            try {
				// Socket은 하나의 접속만을 담당한다.
                // 사용자에게 응답을 위임한 Thread를 각각 생성해서
                // start()하면서, 사용자의 소켓의 주소값을 ArrayList에 저장한다.
                Socket s = ss.accept(); // server start하면 딱 여기. 클라이언트를 지정해 줘야 한다.
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
        // 접속된 사용자는 ArrayList에 저장되어 있기 때문에
        // 그 사용자에게 스트림을 사용해서 해서 메시지를 각각 전송한다.
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
