package ex6;

public class Ex2_Static {
    // static은 공유
    //오직 하나만 생성해서 여러 객체가 공유해서 사용할 수 있는 자원
    //static 공간에 정의 되고 있기 때문에 생성 없이 접근 및 사용 된다.
    //static이 붙으면 실제 모든 자원은 JVM의 영역 중에 static영역에 
    //위치한다.
    private static int num1;    //static변수 (멤버 필드)
    private int num2;           //인스턴스 변수 (멤버 필드)
    public void startTest(){ 
        num1++;
        num2++;
    }
    public static int getNum1() {   //static 붙으면 static 메소드
        return num1;
    }
    public  int getNum2() {          //인스턴스 메소드
        return num2;
    }
    
    
    
    
    
    //static 메소드 .Ex2_Static 객체가 생성 안되었으므로 
    //Ex2_Static의 인스턴스 num2를 사용할 수 없다.
    //static 메소드는 생성되지 않은 인스턴스의 자원을 
    //참조하거나 사용할 수 없다.
   public static void test(){
       // getNum2();
       // getNum1();
       // int numv = num2;
    }
}

