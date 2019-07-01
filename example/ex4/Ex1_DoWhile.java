package ex4;

public class Ex1_DoWhile {
// do문을 while의 조건식과 관련없이
// 무조건 한번은 실행을 한 후 while 의 조건에 따라
// 반복하는 문법
    public static void main(String[] args) {
        int i = 0;
        do {
            if(i % 2 == 0){
            System.out.println("짝:"+i);
            }else{
             System.out.println("홀:"+i);    
            }
            i++;
        } while (i <= 10);
        System.out.println("--------");
    }
}
