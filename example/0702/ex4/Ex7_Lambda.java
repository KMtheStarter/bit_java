package ex4;
/* Ex7_Lambda */
public class Ex7_Lambda {
    public static void main(String[] args) {
        System.out.println("Result:"+new MyInter2() {
            @Override
            public int myMethod(int x, int y) {
                return x * y;
            }
        }.myMethod(10, 20));
        MyInter2 myInter2 = (x,y) ->{
               return x * y;
        };
        System.out.println("Result1:"+myInter2.myMethod(100, 2));
        // return ¹®¸¸ ÀÖÀ» ¶© 
        MyInter2 myinter3 = (x,y)->x*y;
        System.out.println("Result2:"+myinter3.myMethod(10, 10));
    }
}
