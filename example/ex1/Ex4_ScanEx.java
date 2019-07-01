package ex1;

import java.util.Scanner;

/* Ex4_ScanEx */
public class Ex4_ScanEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
        System.out.print("이름 :"); // 개행이 없는 출력
        String name = sc.nextLine(); // 문자열을 입력받기 위한 메서드(enter)
        System.out.print("나이 :");
        // 1 ~ 100세
        //Wrapper 클래스는 일반자료형을 감싼 클래스이다. ******
        int age = Integer.parseInt(sc.nextLine()); // 문자열형 정수를 정수로 변환
        System.out.println("당신이 입력한 정보:");
        System.out.println("Name :"+name);
        if(age > 19){ //if(조건:true)
              System.out.println("성년 :"+age);
        }else{
              System.out.println("미성년 :"+age);
        }
    }
}
