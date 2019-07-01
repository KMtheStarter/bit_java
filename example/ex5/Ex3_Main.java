package ex5;

import java.util.Scanner;

// 업데이트 : 자산 : 100000
// 페인트 가격 : 설정
// 두배가 인출이 되는 상황을 고려해서 제작 해볼것 
public class Ex3_Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Ex3_Home h = new Ex3_Home();
        String color = null;
        PaintFactory p1 = new PaintFactory();
        System.out.print("색상 주문:");
        color = s.nextLine();
        p1.usesPaint(h, color);
        //색상을 다시 주문 
        PaintFactory p2 = new PaintFactory();
        System.out.print("색상 다시 주문:");
        color = s.nextLine();
        p2.usesPaint(h, color);
        System.out.println("퇴근 후 대문 확인:" +h.getDoorColor());
    }
}
