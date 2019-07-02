package ex4;
/* Ex1Demo */
public class Ex1Demo implements MyInter{
    public static void main(String[] args) {
        new MyInter() {
            @Override
            public void myMethod() {
                System.out.println("Test1");
            }
        }.myMethod();
        new ExAb() {
            @Override
            public void test3() {
                
            }
        }.test3();
        new Ex(){
            @Override
            public void test3() {
                System.out.println("Test3");
            }
            
        }.test3();
       // Ex1Demo e = new Ex1Demo();
       // e.myMethod();
    }

    @Override
    public void myMethod() {
        System.out.println("Test2");
    }
}
