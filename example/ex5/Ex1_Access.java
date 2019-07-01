package ex5;
/* Ex1_Access */
//private : 오직 현재 클래스에서만 접근을 허용(내부클래스 예외)
//default : 같은 패키지 내에서만 접근을 허용
//protected : 다른 패키지에서의 상속관계만 허용
//public : 모두 허용
public class Ex1_Access {
  // 캡슐화 와 정보은닉 :
  // 필수적인 값, 메서드등을 private으로 접근하지 못하도록 한 후
  // 사용 방법을 가공해서 제공해주는 개념 
  // 자바에서는 default, public 과 같은 접근 제한자를 
  // 속성에 부여 하지 않는다.
  private int pay;
  //멤버 인스턴스 메서드를 정의하는 방법 
  //pay에 값을 저장하는 기능, A팀에게만 암호된 비밀번호
  public void setPay(int p, String pwd){
      if(pwd.equals("kosta188")){
      pay =p;
      }else{
          System.out.println("경고!");
      }
  }
  // A팀,B팀 pay값을 확인하는 기능 
  public int getPay(){
      return pay;
  }
}
