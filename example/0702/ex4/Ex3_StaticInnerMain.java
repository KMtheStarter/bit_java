package ex4;
/* Ex3_StaticInnerMain */
public class Ex3_StaticInnerMain {
    public static void main(String[] args) {
        // static 은 생성없이 사용이 가능하다.
        // 여러객체가 생성해서 참조(공유) 하더라도 static영역에 오직하나만.
        // static을 소유한외부클래스.static자원 
        Ex3_StaticInner.Inner.printData();
        System.out.println("------------------------");
        // printData2() 호출 해보기 
        new Ex3_StaticInner.Inner().printData2();
        Ex3_StaticInner.Inner ref = new Ex3_StaticInner.Inner();
        ref.printData2();
    }
}
