package ex5;
/* Ex2_MethoCall */
public class Ex2_MethoCall {
    //C메서드의 인자로 일반 자료형을 전달 할때
    //값을 복사해서 전달 하는 개념
    public static void main(String[] args) {
        int n = 10;
        test(n);
        System.out.println("Value1:"+n);
    }
    private static void test(int n) {
        n += 20;
        System.out.println("Value2:"+n);
    }
}
