package ex3;
/* Ex1_Imple : 인터페이스를 구현하기 위해서는 implements 키워드를 사용
해서 재정의해서 사용한다.
   인터페이스는 다중 구현이 된다.
*/
public class Ex1_Imple implements Ex1_Inter{
    @Override
    public void test() {
        System.out.println("인터페이스 상수 값:"+num1);
    }
    @Override
    public void test2() {
         System.out.println("인터페이스 상수 값:"+num2);
    }
    public static void main(String[] args) {
        // 인터페이스를 참조 자료형으로 구현 클래스를 객체로 생성!
        // interface에서 제공한 추상메서드만 사용한다.
        Ex1_Inter ref = new Ex1_Imple();
        ref.test();
        ref.test2();
    }
}
