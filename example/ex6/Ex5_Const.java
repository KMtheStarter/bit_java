package ex6;

public class Ex5_Const {
  public Ex5_Const(){
      this("test");   
      System.out.println("♡");
  }
  public Ex5_Const(String str){ 
      this(true);
      System.out.println("☆");
  }
  public Ex5_Const(float f){    
      this(10);
      System.out.println("♣");
  }
  public Ex5_Const(int n){ 
      System.out.println("△");
  }
  public Ex5_Const(boolean b){  
      this(3.14f);
      System.out.println("■");
  }
    public static void main(String[] args) {
        new Ex5_Const();    //기본 생성자 호출
    }
}
