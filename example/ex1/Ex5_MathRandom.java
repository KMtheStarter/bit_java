package ex1;

import java.util.Scanner;

/* Ex5_MathRandom */
public class Ex5_MathRandom {
    public static void main(String[] args) {
       // int comNum = (int) (Math.random()*10); // 0 ~ 9까지의 임의의 수를 발생
        //System.out.println(comNum);
        // 도구 : if else , Scanner , Integer.parseInt(), sout .... random
        //사용자 UI : 
        // 1 ~ 10 까지의 수자중에서 하나를 입력하세요: 5
        // CPU의 값 : 5 / 입력한 값 : 5 / 결과 : 정답입니다.
        // 비교연산  : A == B 가 같으면 true
        // 1 ~ 10 까지의 수자중에서 하나를 입력하세요: 5
        // CPU의 값 : 8 / 입력한 값 : 5 / 결과 : 틀렸습니다.
        
         // 1. Scanner 객체를 생성한다.
        Scanner sc = new Scanner(System.in);
        // 2. Scanner 객체에서 nextLine메서드를 사용해서 사용자에게 받은 
        // 입력값을 정수로 변환한다.
        System.out.print("1~10까지의 숫자중 하나를 입력하세요:");
        int userNum = Integer.parseInt(sc.nextLine());
        // 3. 입력값을 받은 후 Math.random()를 호출하여 난수를 1~10 발생한다.
        int cpuNum = (int) (Math.random()*10 + 1); 
        System.out.println("---------------------------------------------");
        // 4. 입력받은 userNum값과 랜덤값 cpuNum을 비교연산으로 결과를 출력한다.
        System.out.println("CPU의 값 : "+cpuNum+" / 입력한 값 : "
                    +userNum+" / ");
        String msg ="";
        if(userNum == cpuNum){
            msg ="정답입니다.";
        }else{
            msg ="틀린 답 입니다.";
        }
         System.out.println("결과 : "+msg);
    }  
         
}
