package ex1;
public class Ex5_Oper1 {
    public static void main(String[] args) {
        //비교 연산자 : A,B를 비교해서 결과값을 boolean으로 반환
        //산술 연산자 : + , -, *, /, % 의 산술 연산을 한다.
        int numA = 10;
        int numB = 5;
        int resNum1 = numA + numB;
        int resNum2 = numA * numB;
        int resNum3 = numA - numB;
        int resNum4 = numA / numB;
        int resNum5 = numA % numB;
        System.out.println(resNum1);
        System.out.println("결과:"+resNum1);
        //System.out.println("같다:"+(numA == numB));
        System.out.println("결과:"+resNum2);
        //System.out.println("결과:"+(numA != numB));
        System.out.println("결과:"+resNum3);
        System.out.println("크다, 크거나 같다:"
                +(numA > numB)+","+(numA >= numB));
        System.out.println("작다, 작거나 같다:"
                +(numA < numB)+","+(numA <= numB));
        System.out.println("결과"+ resNum4);
        System.out.println("결과"+ resNum5);
    }
}
