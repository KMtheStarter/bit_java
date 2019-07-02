package ex3;
/* MyTeamA */
public class MyTeamB implements MyInter{
//MyInter 가 상속받은 모든 추상 메서드를 재정의 해야한다.
    @Override
    public void draw() {
        System.out.println(drawNum()+"개의 그림을 B팀이 그리다");
    }
    @Override
    public void paint() {
        System.out.println("B팀이 칠하다.");
    }
    private int drawNum(){
        return 10;
    }
}
