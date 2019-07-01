
package ex1;
// 문자 2byte 유니코드 체계 ***
public class Ex2_Char {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println("ch1:"+ch1);
        // 저장된 값이 65라면 66 이 자식 글 
        // 댓글 연산 알고리즘에 사용
        // A - 부모글, B - 댓글
        char ch2 = 65; // 유니코드로 A 
        System.out.println("ch2:"+ch2);
        // 리터럴을 사용
        char ch3 = '\n'; // 개행
        char ch4 ='\t'; // Tab
        char ch5 ='\b'; // back 스페이스
        System.out.println("ch3 :"+ch3);
        System.out.println("hi :"+ch4+"ok");
        System.out.println("abc"+ch5);
        // 유니코드값, 초기값 \u0000
        char ch6 = '\u0042'; // 0000 0000 0100 0010 = 64 + 2 = 66 => B
        System.out.println("ch6:"+ch6);
    }
}
