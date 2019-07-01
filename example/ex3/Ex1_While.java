package ex3;

public class Ex1_While {
    public static void main(String[] args) {
        /*
            1)기본 문법
            초기식;
            while(조건식){
                실행문;
                증감식;
            }   
            2)메소드 조건
            rs.next(); //초기식과 조건식, 증감식을 함께 수행
            while(rs.next()){
        
            }
            3)무한루프
            while(true){
        
            }
        */
        //홀수와 짝수 출력하기 1 ~ 10까지 출력 
        
        
        int i = 1; //초기식
        String msg= ""; // 문자열 저장할 변수선언 
        while(i <= 10){ // 조건식
            if(i % 2 == 0){ // 홀,짝을 판별
                msg = "짝수";
            }else{
                msg = "홀수";
            }
            System.out.println(i+"는 "+msg+" 입니다.");
            i++; // 증감식
        }
    }
}
