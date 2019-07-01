package ex7;
/* Ex2_RefArray */
public class Ex2_RefArray {
    //참조 자료형 배열선언
    private String[] str;
    private int[] num; // 일반 자료형 
    public Ex2_RefArray() {
        // 배열 생성 
        str = new String[5];
        str[0]="Kosta188";
        str[1]=new String("Kosta188");
        str[2]=new String("Kosta188");
        str[3]="Kosta188";
        str[4]="Test";
        for(String e : str){
            System.out.println(e);
        }
        System.out.println("Length:"+str.length);
        System.out.println("------------------");  
        System.out.println("주소값 비교1:"+(str[0]==str[3]));
        System.out.println("주소값 비교2:"+(str[1]==str[2]));
    }
    public static void main(String[] args) {
        new Ex2_RefArray();
    }
}
