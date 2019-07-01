package ex6;

//오버로딩: 메소드를 만들 때의 규칙
//인자의 타입이나 개수가 달라야 한다.
public class Ex1_Overload {
  public void drawCircle(int r){
      System.out.println("지름이"+r+"인 원을 그린다.");
  }
  public void drawRec(int w, int h){
      System.out.println("너비: "+w+", 높이: "+h+"인 사각형을 그린다.");
  }
  public void lineDraw(int x, int y,int len){
      System.out.println("좌표 x: "+x+"좌표 y:"+y);
      System.out.println("길이가 "+len+"인 선을 그린다.");
  }
  public static void main(String[] args) {
      Ex1_Overload ref = new Ex1_Overload();
     // ref.d
     // ref.d
  }
  
  //메소드 오버로딩: 메소드의 이름을 같게 해둠으로써
  //메소드의 가독성과 일관성을 보장한다.
  public void draw(int r){
      System.out.println("지름이"+r+"인 원을 그린다.");
  }
  public void draw(int w,String h){
      System.out.println("너비: "+w+", 높이: "+h+"인 사각형을 그린다.");
  }
  public void draw(String h,int w){
      System.out.println("너비: "+w+", 높이: "+h+"인 사각형을 그린다.");
  }
  public void draw(int x, int y, int len){
      System.out.println("좌표 x: "+x+"좌표 y:"+y);
      System.out.println("길이가 "+len+"인 선을 그린다.");
  }
}

