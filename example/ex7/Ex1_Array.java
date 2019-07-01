package ex7;

/* Ex1_Array */
public class Ex1_Array {
    // 배열을 선언과 생성과 초기화를 동시에 
    private int[] num1 = {1,2,3,4,5,6,7,8};
    public Ex1_Array() {
        System.out.println("배열의 인덱스로 접근 :"+num1[0]);
        System.out.println("------------------------------");
        for(int i=0; i< num1.length; i++){
            System.out.println(num1[i]+"♡");
        }
        // 향상된 for문
        for(int e : num1){
            System.out.println(e+"★");
        }
    }
    public static void main(String[] args) {
        // 익명으로 생성자를 호출!
        new Ex1_Array();
    }
}
