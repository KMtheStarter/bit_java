package ex3;

public class Ex3_SwitchLabel {

    public static void main(String[] args) {
        ext: for (int i = 0; i < 5; i++) {
            //다중 for문처럼  바깥의 for문으로 탈출하고 싶을 때
            //나갈 곳에 라벨을 붙여서 break문에 표시 해 두면 된다.
            // (JDK 5부터 지원)
           
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    break ext;
                }
                System.out.println(j + "," + i);
            }
        }
    }
}
