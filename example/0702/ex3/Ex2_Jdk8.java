
package ex3;

public interface Ex2_Jdk8 {
    public int num2 = 20; // 상수
    public void num1(); // 추상메서드
    //jdk8부터 지원 ,static메서드
    public static void test(){
        System.out.println("static Test");
    }
    // default 메서드!
    default public String test2(){
        return "본사 비법으로 만들어진 조미료";
        //System.out.println("기본 값");
    }
}
