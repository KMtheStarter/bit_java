package ex2;
import java.util.Scanner;
public class Ex6_If {
    public static void main(String[] args) {
   
        Scanner s = new Scanner(System.in);
        System.out.print("숫자를 입력:");
        int num = Integer.parseInt(s.nextLine());
         if (num <= 19) {
            System.out.println("미성년.");
            System.exit(0); 
        }
        System.out.println("성년!");
    }
}
