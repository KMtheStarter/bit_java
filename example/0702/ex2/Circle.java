package ex2;
/* Circle */
public class Circle extends Draw{
    // 자식의 자원을 초기화 
    private String resource;

    public Circle() {
        resource ="자식의 자원";
    }
    
    // resource 적용 
    @Override
    public void draw() {
        System.out.println("A팀이 원을 그린다."+resource);
    }

}
