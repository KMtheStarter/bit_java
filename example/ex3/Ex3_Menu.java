package ex3;

import java.util.Scanner;

/* Ex3_Menu */
public class Ex3_Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        out:while (true) { // 무한 반복
            System.out.print("메뉴선택:1-입력,2-출력,3-종료:");
            int menuNum = Integer.parseInt(sc.nextLine());
            //swithc문으로 변경 
            switch (menuNum) {
                case 1:
                    System.out.println("입력 처리!");
                    break;
                case 2:
                    System.out.println("출력 처리!");
                    break;
                case 3:
                    System.out.println("종료 처리!");
                    break out;
            }
            /*  if(menuNum == 1){
                System.out.println("입력 처리!");
            }else if(menuNum == 2){
                System.out.println("출력 처리!");
            }else if(menuNum == 3){
                System.out.println("종료 처리!");
                break; // 반복문을 탈출!
            }
             */
   
        }
    }
}
