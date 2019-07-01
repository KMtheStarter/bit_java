package ex6;
/* MyTestDemo */
public class MyTestDemo {
//2. static영역에 멤버를 선언
    private static MyTestDemo mto;
//싱글톤 패턴 : 처음으로 생성된 객체를 
// static영역에 저장하고 
// 그이후에는 이미 static영역에 생성된 객체의 주소를
// 받아서 사용하도록 설계된 패턴
// - 유효한 자원, 스레드가 공유되는 자원등에서 사용 
// 현재 클래스를 싱글톤으로 설계    
    // 1. 기본생성자를 private로 한다.
    private MyTestDemo() {
        System.out.println("생성되었습니다.");
    }
    // 3. 메서드 실행시에 객체의 주소를 반환 받도록한다.
    public static MyTestDemo getMto() {
        if(mto == null){ // 최초의 실행일 때만 객체를 생성하고
            mto = new MyTestDemo();
        }
        return mto;
    }
    // --- 인스턴스 메서드들이 정의
    public void useResource(String st){
        System.out.println("Resource값:"+st);
    }
    
}
