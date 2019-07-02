package ex4;



/* Ex4_Anon */
// 익명은 참조 주소가 없이 객체를 생성하는 것을 의미하는데
// 인터페이스, 추상클래스는 new 연산자로 생성할 수 없고
// 익명 내부 클래스로 정의한 후 자원을 호출하는 형태이다.
// 그외에 일반 클래스도 익명 내부 클래스를 만들어서 사용할 수 있다.
public class Ex4_Anon {
    // class A => X
    MyTest test =  new MyTest() {
            @Override
            public void printData() {
                System.out.println("data:"+data);
            }  
    };
    public void mytest(){
        new MyTest() {
            @Override
            public void printData() {
                System.out.println("data:"+data);
            }
        }.printData();
    }
    public static void main(String[] args) {
        new Ex4_Anon().mytest();
    }
}
