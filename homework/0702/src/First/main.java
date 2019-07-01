package First;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Gugudan gugu = new Gugudan();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int range = 0;
        System.out.print("수 입력: ");
        n = Integer.parseInt(sc.nextLine());
        System.out.print("범위 입력(홀수): ");
        range = Integer.parseInt(sc.nextLine());
        gugu.gugudan(n, range);
    }
}
