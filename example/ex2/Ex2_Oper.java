package ex2;

public class Ex2_Oper {
    public static void main(String[] args) {
        //논리연산자: && 논리곱 , || 논리합, ! 부정
        //true && true -> true / false && true일때 true는 실행되지 않는다.
        // ||는 false || true가 되더라도 true까지 실행한다.
        int a = 10;
        int b = 20;
        // and는 ture ture여야 true 따라서 뒷 부분까지 연산한다. 
        boolean c = ((a += 12)> b) || (a == (b+=2)); 
        System.out.println("c=" +c);
        System.out.println("a=" +a);
        System.out.println("b=" +b);
        System.out.println("-----------");
        

    }
}
