package ex6;

public class Ex2_Main {
    public static void main(String[] args) {
    	// ref1 객체를 생성한다.
        Ex2_Static ref1 = new Ex2_Static(); // 100번지
        Ex2_Static ref2 = new Ex2_Static(); // 200번지
        // startTest()
        ref1.startTest();   //num1 - 1 / 100번지의 num2 - 1
        ref2.startTest();   //num1 - 2 / 200번지의 num2 - 1
      
        System.out.println("static num1: "+ ref1.getNum1());
        System.out.println("non static num2: " + ref1.getNum2());
        
        System.out.println("-------------------------------------------");
        System.out.println("static num1: "+ ref2.getNum1());
        System.out.println("non static num2: " + ref2.getNum2());
        

    }
}
