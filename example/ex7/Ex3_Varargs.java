package ex7;
import exam.BoardVO;
/* Ex3_Varargs */
public class Ex3_Varargs {
// Varargs : 가변 길이 인자 전달 방식 (배열 *)
// 장점 : 메서드 오버로딩을 한번에 해결 
// 단점 : 같은 자료형만 해당
// jdk 5.0 부터 가능
// 인자값  ... 
    public void test(BoardVO ... str){
        for(BoardVO e : str){
            System.out.println(e.getNumber());
            System.out.println(e.getWriter());
        }
    }
    public static void main(String[] args) {
        Ex3_Varargs ref = new Ex3_Varargs();
        BoardVO v1 = new BoardVO();
        v1.setWriter("김길동");
        v1.setNumber(1);
        BoardVO v2 = new BoardVO();
        v2.setWriter("김수아");
        v2.setNumber(2);
        BoardVO v3 = new BoardVO();
        v3.setWriter("김수아2");
        v3.setNumber(2);
        ref.test(v1,v2,v3);
    }
   
  
}
