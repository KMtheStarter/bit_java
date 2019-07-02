package ex4;
/* Ex1_MemberInner */
public class Ex1_MemberInner extends SuperA{
    // 기본접근제한자.
    int numA;
    // 클래스 내부에서만 접근이 가능
    private int numB;
    static int numC;
    public Ex1_MemberInner() {
        numA = 10; numB = 100; numC = 200;
    }
    // 멤버 영역에 클래스를 정의 : 멤버내부클래스
    public class Inner extends SuperB{
        public void printData(){
            superA();
            System.out.println("int A:"+numA);
            System.out.println("int B:"+numB);// 접근가능하다.
            System.out.println("int C:"+numC);
        }
    }
}
