package ex5;

import java.util.Scanner;

public class Ex1_VOMain {
    public static void main(String[] args) {
        Ex1_ValueObjct ref = new Ex1_ValueObjct();
        Scanner s = new Scanner(System.in);
        System.out.print("번호: ");
        int num = Integer.parseInt(s.nextLine());
        System.out.print("이름: ");
        String name = s.nextLine();
        System.out.print("직업: ");
        String jobs = s.nextLine();
        System.out.print("나이: ");
        int age = Integer.parseInt(s.nextLine());
        boolean res = true;
        while(true){
            System.out.print("수신여부(y/n): ");
            String agree = s.nextLine();
            if(agree.equalsIgnoreCase("y")){
                res = true;
                break;
            }else if(agree.equalsIgnoreCase("n")){
                res = false;
                break;
            }
        }
        //힙영역에 생성된 Ex1_ValueObject의 멤버필드에 값을 setter로 저장
        ref.setNum(num);
        ref.setName(name);
        ref.setJob(jobs);
        ref.setAge(age);
        ref.setAgree(res);
        //힙 영역에 생성되어진 Ex1_ValueObject에 setter로 기억되어진 멤버들의 값을
        //getter로 얻어와서 출력하든지 가공하든지 할 수 있다.
        System.out.println("----------------------------------------------");
        int numv = ref.getNum();
        if(numv <= 10){
            System.out.println("10명 안에 가입된 프리미엄 회원입니다.");
        }else{
            System.out.println("축하합니다. 당신은 회원입니다.");    
        }
        System.out.println("이름: "+ref.getName());
        System.out.println("직업:" +ref.getJob());
        if(ref.getAge() <= 19){
            System.out.println("나이: "+ref.getAge()+ "당신은 미성년자");
        }else{
            System.out.println("나이: "+ref.getAge()+ "당신은 성년");
        }
        if(ref.isAgree() == true){
            System.out.println("수신 여부: 동의");
        }else{
            System.out.println("수신 여부: 거절");
        }
        
        
    }
   
}
