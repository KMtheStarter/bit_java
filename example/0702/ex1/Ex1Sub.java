package ex1;
// extends란 키워드로 부모를 확장할 수 있다. (단일상속)
public class Ex1Sub extends Ex1Super{

    public Ex1Sub() {
        super();
        System.out.println("자식 클래스의 생성자 호출!");
    }
    public void subTest(){
        superTest(); // 부모의 자원을 호출할 수 있다.
    }
    public static void main(String[] args) {
        // 1. 부모를 참조할 때는 생성된 자식 객체의 자원은 참조
        // 할수 없다.
        Ex1Super e1 = new Ex1Sub();
        //e1.
       // e1.subTest(); // 자식 메서드 호출
       // e1.mytest(); // 부모 메서드 호출
    }
}
