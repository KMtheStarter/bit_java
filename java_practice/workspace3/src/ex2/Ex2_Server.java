package ex2;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

// server: socket -> [bind() -> listen()] -> accept() -> Stream() -> close()
// bind(): port socket에 대한 정보를 할당
// listen(): 클라이언트의 접속 요청을 확인
// accept(): 클라이언트의 소켓을 생성

// Server class
// -1 은 다중 사용자를 고려한 개발론
// 1. ServerSocket을 생성한다.
// 2. accept()를 호출해서 접속된 Socket을 반환한다.
// 2-1. 다중 접속자를 처리하기 위해서 ArrayList를 사용한다.
// 3. Socket에서 제공하는 Stream으로 통신한다.
// 3-1. readLine()을 담당해줄 Thread를 제작한다.
// cf> 특별한 요청이 없을 때는 gui로 서버를 제작하지 않는다.
// 즉, gui로 프로그램을 관리하는 사람이 있을지언정, 그도 클라이언트이다.
public class Ex2_Server {

	// 제작순서
	// 1. ServerSocket을 선언하고 생성한다.
	private ServerSocket ss;
	// 2-1 을 위한 선언
	private ArrayList<ServerThread> cList;
	
	public Ex2_Server() {
	
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
		while(true) {
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
			} {
				
			}
		}
	}

	public static void main(String[] args) {
		Ex2_Server server = new Ex2_Server();
		server.execute();
	}
	public void sendMessage(String clientMsg) {
		// TODO Auto-generated method stub
		// 접속된 사용자는 ArrayList에 저장되어 있기 때문에
		// 그 사용자에게 스트림을 사용해서 해서 메시지를 각각 전송한다.
		for (ServerThread e: cList) {
			e.getPw().println(clientMsg);
		}
		
	}
	
	
}
