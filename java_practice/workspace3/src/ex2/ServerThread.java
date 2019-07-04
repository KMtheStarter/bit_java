package ex2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread extends Thread{

	private Socket socket;
	private Ex2_Server server;
	private BufferedReader br;
	private PrintWriter pw;
	
	public ServerThread(Socket socket, Ex2_Server server) {
		this.socket = socket;
		this.server = server;
		System.out.println("������ IP: " + socket.getInetAddress().getHostAddress());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			pw = new PrintWriter(socket.getOutputStream(), true);
			// readLine()�� ���
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// ����� �������κ��� �޼����� ��� �޾ƾ� �Ѵ�.
			while(true) {
				String clientMsg = br.readLine();
				System.out.println("Log" + clientMsg);
				server.sendMessage(clientMsg);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	// �������� ��ε�ĳ������ �ϱ� ���ؼ�
	// Ŭ���̾�Ʈ�� ����� ��Ʈ������ ����ϱ� ����
	// PrintWriter�� �ּҸ� �����Ѵ�.
	public PrintWriter getPw() {
		return pw;
	}
	
}
