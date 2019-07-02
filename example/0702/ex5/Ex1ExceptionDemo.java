
package ex5;

import java.util.Scanner;

public class Ex1ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("숫자만 입력하세요:");
        try {
            String  n = sc.nextLine();
            /// 숫자인 아닌지를 판별하는 로직 
             int num = Integer.parseInt(n);
             System.out.println("입력값 :"+num);
        } catch (Exception e) {
            System.out.println("숫자만 입력하세요!");
        }
        
       
    }
}
