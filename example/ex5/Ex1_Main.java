package ex5;

import java.util.Scanner;

/*ATeam! Ex1_Main */
public class Ex1_Main {
    public static void main(String[] args) {
        // 지역변수,참조자료형 변수를 선언
           Ex1_Access ref;
        // 생성자를 호출한 후 참조변수 ref에 힙영역에 생성된  
        // Ex1_Access 객체의 주소값을 저장한다.
        ref = new Ex1_Access();
        //UI ----------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.print("입금할 금액을 입력하세요:");
        int pay= Integer.parseInt(sc.nextLine());
        System.out.print("비밀번호를 입력하세요!");
        String pwd = sc.nextLine();
        //-------------------------------------------------
        ref.setPay(pay, pwd);
        System.out.println("현재 금액 :"+ref.getPay());
        //ref.
    }
}
