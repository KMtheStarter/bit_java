package ex1;

import java.util.Set;

// ����: ȸ���� ������ �����ϱ� ���� Ŭ����
public class Ex14_Member {
	// �������а� ĸ��ȭ
	// ���������� ���� �ٽ����� �ڿ��� ����� �� �״�� ����ȭ �ϴ� ���̰�,
	// ĸ��ȭ�� ������ �����ϴ� ����� �����ϴ� ���� ���Ѵ�.
	// pojo ���䵵 ����.
	// �ڹ��� ����� private�� ������ ����.
	// ���� ����: setter, ���� ��ȯ: getter
	// Ŭ����, ������, �޼���, ����ʵ�
	// private: ���� Ŭ���� �������� ����, inner class�� ���� ����.
	// default: ���� ��Ű�� �������� ����
	// protected: default ����, �ٸ� ��Ű���� ��Ӱ��� ����
	// public: all
	private String name;
	private int age;
	private boolean agree;
	private int pay;
	
	// ������ �� �ִ� �޼��� ����
	// ����� �� �ִ� �޼��� ����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isAgree() { // boolean�� is~
		return agree;
	}
	public void setAgree(boolean agree) {
		this.agree = agree;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay, String pwd) {
		if (!pwd.equals("12")) {
			System.out.println("�ý��� ���� ������ �����ϴ�.");
			System.exit(0);
		}
		this.pay = pay;
	}
	
	
}
