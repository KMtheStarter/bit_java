package ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Ex5_Lotto implements Ex5_LottoInter{

	private ArrayList<TreeSet<Integer>> tlist;
	public Ex5_Lotto() {
		tlist = new ArrayList<TreeSet<Integer>>();
		
	}
	@Override
	public String getLottoNum() {
		List<String> list = new ArrayList<String>();
		for (TreeSet<Integer> t: tlist) {
			String s = "";
			for (Integer num: t) {
				s = s.concat(num.toString() + " ");
			}
			list.add(s);
		}
		
		String answer="";
		
		for (String l: list) {
			answer = answer.concat(l + "\n");
		}
		return answer;
		
		
//		StringBuffer sb = new StringBuffer();
//		int i = 0;
//		for (TreeSet<Integer> e: tlist) {
//			sb.append("NO[").append(i).append("]:");
//			for (Integer f: e) {
//		}
	}
	
	private TreeSet<Integer> execute(){
		
		return null;
	}

	@Override
	public void setLottoGameNum(int num) {
		int size = num / 1000;
		
		for (int i = 0; i < size; i++) {
			TreeSet<Integer> t = new TreeSet<Integer>();
			while(t.size() < 6) {
				int randNum = (int) (Math.random() * 100) % 45 + 1;
				t.add(randNum);
			}
			tlist.add(t);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력: ");
		int money = Integer.parseInt(sc.nextLine());
		System.out.println("------------------");
		
		Ex5_Lotto ref = new Ex5_Lotto();
		ref.setLottoGameNum(money);
		System.out.println(ref.getLottoNum());
	}
}
