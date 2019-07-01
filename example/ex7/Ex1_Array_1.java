package ex7;

public class Ex1_Array_1 {
    private int[][] test;
    public Ex1_Array_1() {
        test = new int[2][3];
        test[0][0] = 100;
        test[0][1] = 200;
        test[0][2] = 300;
        //===============================1행 초기화 끝
        test[1][0] = 500;
        test[1][1] = 600;
        test[1][2] = 700;
        //===============================2행 초기화 끝
    }

    public String getData() {
        // += 연산자를 사용하지 않고 String버퍼에 저장한다.
        StringBuffer mysb = new StringBuffer();
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                mysb.append("Test").append(test[i][j]).append("\n");
            }
        }//버퍼에 쌓아둔 내용을 모두 String으로 변환
        return mysb.toString();
    }
// 향상된 for문으로 변경해보기
    public String getData2() {
        // test는 2차원 배열의 주소이며
        
        StringBuffer mysb = new StringBuffer();
        // 2차원배열의 자료형은 1차원 배열 int[]
        for (int[] e : test) {
            // 1차원 배열이 가지고 있는 자료형!
            for (int i : e) {
                mysb.append(i).append("\n");
            }
        }
        return mysb.toString();
    }

    public static void main(String[] args) {
        Ex1_Array_1 ref = new Ex1_Array_1();
        System.out.println(ref.getData2());

    }
}

