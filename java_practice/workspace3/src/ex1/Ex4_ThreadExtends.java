package ex1;
/* Ex2_MyThread */
public class Ex4_ThreadExtends extends Thread{
//    private int value;
    Ex4_MyData ref;
    @Override
    public void run() {
    	ref = new Ex4_MyData();
         int i = 0;
        // ���� �������� �̸� 
        String name = getName();
        while(i < 3){
            System.out.println(name+",�������� i �� :"+(++i));
            System.out.println(name+",����ʵ� value �� :"+(ref.getValue()));
//            System.out.println(name+",����ʵ� value �� :"+(++value));
            System.out.println("Thread Active Cnt :"+Thread.activeCount());
        }
    }
    public static void main(String[] args) {
    	Ex4_ThreadExtends t1 = new Ex4_ThreadExtends();
    	Ex4_ThreadExtends t2 = new Ex4_ThreadExtends();
        t1.start();
        t2.start();
    }
}