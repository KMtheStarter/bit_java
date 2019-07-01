package ex2;

public class Ex11_For {
    public static void main(String[] args) {
        String msg = "";
        for(int i = 0; i <= 10; i++){
            if(i%2 == 0){
                msg = " ¦";
                System.out.println(i+msg);
            }else{
                msg = " Ȧ";
                System.out.println(i+msg);
            }
        }
       // System.out.println(i);
    }
}
