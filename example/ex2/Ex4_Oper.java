package ex2;

public class Ex4_Oper {
    public static void main(String[] args) {
        /* bit 단위로 연산하는 비트 연산자
            &, |, ^
        */
        int a = 10;      // 1 0 1 0
        int b = 7;       // 0 1 1 1
        int c = a & b;   // 0 0 1 0
        
        System.out.println("변수 c의 값:"+c);
        c = a ^ b;       // 1 1 0 1
        System.out.println("c"); //13
    }
}
