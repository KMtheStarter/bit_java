package ex2;

public class Ex9_IfElseIf {
    public static void main(String[] args) {

        String val = "사과";
        String col = "";
        if(val.equals("사과")){
            col = "Red";
        }else if(val.equals("�ٳ���")){
            col = "Yellow";
        }else if(val.equals("������")){
            col = "Orange";
        }else{
            col = "White";
        }
        System.out.println(val+"��(��) "+ col+"�� �Դϴ�.");
        
    }
}
