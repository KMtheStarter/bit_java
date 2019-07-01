package ex4;


public class Ex3_Main {
    public static void main(String[] args) {
        //Scanner를 사용한 경험을 토대로
        //클래스를 객체로 생성
        // 참조자료형 변수 = new 생성자호출();
        Ex3_Remocon r= new Ex3_Remocon();
        // 사용 "." 해당 객체의 주소로 접근해서 자원을 사용한다.!
        r.setPower(true);
        r.setChNum(5);
        String chMsg = r.viewControl();
        System.out.println("Msg: " + chMsg);
    }
}
