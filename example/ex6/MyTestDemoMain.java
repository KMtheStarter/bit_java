package ex6;
/* MyTestDemoMain */
public class MyTestDemoMain {
    public static void main(String[] args) {
        //1. static 메서드인 getMto()메서드를 호출한다.
        //2. Heap영역에 오직 객체가 하나만 생성된다.
        // 이미 객체의 주소값을 static에 저장해 두었기 때문에
        MyTestDemo ref = MyTestDemo.getMto();
        ref.useResource("hi");
            MyTestDemo ref2 = MyTestDemo.getMto();
        ref2.useResource("hi2");
        System.out.println("주소값:"+(ref==ref2));
    }
}
