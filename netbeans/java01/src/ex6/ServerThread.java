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
        System.out.println("접속자 IP: " + socket.getInetAddress().getHostAddress());
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            ois = new ObjectInputStream(socket.getInputStream());
            // readLine()을 담당
            oos = new ObjectOutputStream(socket.getOutputStream());
            // 사용자 소켓으로부터 메세지를 계속 받아야 한다.
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

    // 서버에서 브로드캐스팅을 하기 위해서
    // 클라이언트와 연결된 스트림으로 통신하기 위한
    // PrintWriter의 주소를 제공한다.
    public ObjectOutputStream getOos() {
        return oos;
    }
}
