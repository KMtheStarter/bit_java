package ex2;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

// server: socket -> [bind() -> listen()] -> accept() -> Stream() -> close()
// bind(): port socket�� ���� ������ �Ҵ�
// listen(): Ŭ���̾�Ʈ�� ���� ��û�� Ȯ��
// accept(): Ŭ���̾�Ʈ�� ������ ����

// Server class
// -1 �� ���� ����ڸ� ����� ���߷�
// 1. ServerSocket�� �����Ѵ�.
// 2. accept()�� ȣ���ؼ� ���ӵ� Socket�� ��ȯ�Ѵ�.
// 2-1. ���� �����ڸ� ó���ϱ� ���ؼ� ArrayList�� ����Ѵ�.
// 3. Socket���� �����ϴ� Stream���� ����Ѵ�.
// 3-1. readLine()�� ������� Thread�� �����Ѵ�.
// cf> Ư���� ��û�� ���� ���� gui�� ������ �������� �ʴ´�.
// ��, gui�� ���α׷��� �����ϴ� ����� ����������, �׵� Ŭ���̾�Ʈ�̴�.
public class Ex2_Server {

	// ���ۼ���
	// 1. ServerSocket�� �����ϰ� �����Ѵ�.
	private ServerSocket ss;
	// 2-1 �� ���� ����
	private ArrayList<ServerThread> cList;
	
	public Ex2_Server() {
	
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
		while(true) {
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
		// ���ӵ� ����ڴ� ArrayList�� ����Ǿ� �ֱ� ������
		// �� ����ڿ��� ��Ʈ���� ����ؼ� �ؼ� �޽����� ���� �����Ѵ�.
		for (ServerThread e: cList) {
			e.getPw().println(clientMsg);
		}
		
	}
	
	
}
