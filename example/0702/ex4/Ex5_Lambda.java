package ex4;
/* Ex5_Lamba */
public class Ex5_Lambda {
    public static void main(String[] args) {
        // 익명 내부 클래스 
        MyInter myInter = new MyInter() {
            @Override
            public void myMethod() {
                System.out.println("MyTest");
            }
        };
        myInter.myMethod();
        System.out.println("--------------------------");
        // 매개변수와 리턴값이 없는void 일경우 람다식
        MyInter myInter1 =()->{
             System.out.println("MyTest1");
        };
        myInter1.myMethod();
    }
}
