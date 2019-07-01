
package ex2;

import java.util.Scanner;

public class Ex10_IfElseIf {
    public static void main(String[] args) {
        // 50 이상 고급 30이상 중급 20이상 초급 그이하 등급 없음
        int score = 50;
        String grade="";
        if(score >=50){
            grade = "고급";
        }else if(score >=30){
            grade = "중급";
        }else if(score >=20){
            grade = "초급";
        }else{
            grade = "없음";
        }
        System.out.println("점수: "+score+"\n등급: "+grade);
    }
}
