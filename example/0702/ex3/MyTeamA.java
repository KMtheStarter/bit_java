package ex3;
/* MyTeamA */
public class MyTeamA implements MyInter{
//MyInter 가 상속받은 모든 추상 메서드를 재정의 해야한다.
    @Override
    public void draw() {
        System.out.println("A팀이 그리다");
    }
    @Override
    public void paint() {
        System.out.println("A팀이 칠하다."+execute());
    }
    private String execute(){
        return "A팀의 데이터베이스에서 가져온 색상값 Red";
    }
}
