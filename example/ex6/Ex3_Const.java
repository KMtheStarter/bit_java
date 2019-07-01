package ex6;
public class Ex3_Const {
    private String msg;
    //1. 사용자가 정의한 생성자가 "하나도 없을 경우" 
    //컴파일러가 컴파일 시 기본 생성자를 임의로 만들어준다*******
    //2. 생성자도 오버로딩 가능!!!
    //기본 생성자 정의
    //3. 기본 생성자가 아닌 인자값이 있는 생성자 존재하는 경우엔 
    // 컴파일러가 <기본 생성자>를 만들어 주지 않음 *******
    //생성자 오버로딩. 기본 
    // 핵심포인트 : 현재 객체의 값을 초기화 할목적으로 사용한다.
    public Ex3_Const(String msg){
    	// 전처리 
    	this.msg=msg;
    	// 후처리
    }
     // 생성자를 사용하는 이유 : 객체화 할 때 자원을 초기화 하는 목적!
     public void print(){
        System.out.println(msg);
    }
    public void print(String str){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        //생성자 호출 Ex3_Const() : 기본 생성자
        Ex3_Const ref = new Ex3_Const("hi");      
    }
}

