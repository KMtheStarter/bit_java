package ex1;

public class Ex1_Boolean {
    public static void test(){
        System.out.println("test");
    }
    public static void main(String[] args) {
        test();
        // 지역변수 , 변수명이 chk 인 boolean 자료형으로 선언
        boolean chk = false; // 선언과 초기화를 동시에 
        System.out.println("boolean 값 :"+ chk);
        //재사용 
        chk = true;
        System.out.println("boolean 의 재사용된 값:"+chk);
     }
}
