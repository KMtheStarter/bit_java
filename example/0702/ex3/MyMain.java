package ex3;
/* MyMain */
public class MyMain 
        /*implements MyDraw,MyColor*/{
    public static void main(String[] args) {
        MyInter[] inter = new MyInter[2];
        inter[0] = new MyTeamA();
        inter[1] = new MyTeamB();
        
        for(MyInter e : inter){
            e.draw();
            e.paint();
            System.out.println("-------------------");
        }
        
    }

}
