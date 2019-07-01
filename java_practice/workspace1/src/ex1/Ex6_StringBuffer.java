package ex1;

public class Ex6_StringBuffer {
	public static void main(String[] args) {
		String str = "AB";
		str += "CD";
		str += "EF";
		System.out.println(str);
		System.out.println("-----------------");
		// 이것처럼 하면 가비지 콜렉션을 너무 자주 불러, 자원을 낭비함
		
		StringBuffer sb = new StringBuffer();
		sb.append("ABC").append("DEF").append("ZZZ");
		System.out.println(sb);
	}
}
