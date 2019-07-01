package First;

public class Gugudan {

    int range; // 계산을 위한 range
    int start; // 시작수

    public void gugudan(int n, int range){
        this.range = (range - 1)/2;
        start = n - this.range;
        for (int i = 0; i <= 9; i++){
            for (int j = start; j < start + range; j++){
                if (i == 0) {
                    System.out.print(j + "\t");
                } else {
                    System.out.print(j + "x" + i + "=" + (j * i) + "\t");
                }
            }
            System.out.println();
        }
    }
}
