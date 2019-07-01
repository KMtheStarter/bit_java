
package ex1;

public class Ex3_Demotion {
    public static void main(String[] args) {
        // 4byte 이하의 연산은 JVM이 연산시 자동으로 4byte로 승격시켜서 연산한다.
        // 디모션 : 큰 자료형의 값을 작은 자료형으로 연산시 반드시 캐스팅을 명시적으로 해야 한다.
        // 프로모션 : 반대고, 캐스팅은 묵시적으로 일어난다.
        byte n1 = 10;
        byte n2 = 20;
        // 캐스팅!
        byte n3 = (byte) (n1 + n2);
        int res = n1 + n2;
        //short 로도 해보기 
        short sh1 = 100;
        short sh2 = 200;
        short sh3 = (short) (sh1 + sh2);
        System.out.println("Sh3 :"+sh3);
        int resOper = (100 * 2 / 3 % 5);
        System.out.println(resOper);
    }
}
