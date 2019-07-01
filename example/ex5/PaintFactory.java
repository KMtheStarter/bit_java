package ex5;


//하나의 클래스가 생성 될 때 다른 클래스를 생성한 후....
//생성 될 때 부터 다른 객체를 참조하기 위해 객체 주소를 가지고 있는것?
//has a관계
public class PaintFactory {
  //대문 가진 객체의 주소를 알고 있어야 함.
  //has a 관계: A가 B의 주소를 가지고 있는 관계
  private Ex3_Home home;
  //인자로 참조변수를 전달 받음(주입받는다) DI
  public void usesPaint(Ex3_Home home, String color){
      this.home = home; //대문을 가진 객체의 주소
      this.home.setDoorColor(color);
  }
  
}
