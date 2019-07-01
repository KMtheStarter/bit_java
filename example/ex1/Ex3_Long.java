package ex1;
/* Ex3_Long */
public class Ex3_Long {
    public static void main(String[] args) {
        long st = 100; // Long(8byte)
        long st1 = 100L; // 정수 L, l 이란 키워드를 붙여서 작성해야 해당 메모리에 데이터 들어감
        int num = (int) st1;
        // float , double
        float var1, var2;
        // 실수는 기본값이 double (8byte)
        var1 = (float) 3.14;
        var2 = 3.14f; // float 은 F,f
        double var3,var4;
        var3 = var1;// 프로모션
        var4 = 3.14; // .....
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println("-------------------------------");
        long time1 = System.currentTimeMillis();
        int time2 = (int) System.currentTimeMillis(); // 데이터 손실의 예
        System.out.println("Time1:"+time1);
        System.out.println("Time2:"+time2);
        
        float ss = (float) 3.14;
    }
}
