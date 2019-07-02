package ex4;
/* Ex3_StaticInner */
public class Ex3_StaticInner {
    int numA;
    private int numB;
    static int numC=500;
    public void test(){
        System.out.println("Test!");
    }
    public Ex3_StaticInner() {
        numA = 10; numB = 100; numC = 200;
    }
    // 내부클래스 안에서 static 자원이 있으면 
    // 무조건 static내부 클래스로 정의해야 한다. *******
    public static class Inner {
        static int d = 10000;
        public static void printData(){
          //  System.out.println("int A:"+numA);
          //  System.out.println("int B:"+numB);
            System.out.println("int C:"+numC);
            System.out.println("int D:"+d);
        }
        public void printData2(){
            System.out.println("c:"+numC);
            System.out.println("d:"+d);
        }
    }
}
