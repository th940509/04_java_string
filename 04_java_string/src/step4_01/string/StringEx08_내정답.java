package step4_01.string;
//2021/04/06 15:09 ~ 15:30

public class StringEx08_내정답 {

	public static void main(String[] args) {
		
		// 문제) 이름과 성적을 하나의 문자열로 연결
		// 정답) "김철수/87,이만수/42,이영희/95"
		
		String[] name = {"김철수", "이만수", "이영희"};
		int[] score = {87, 42, 95};
		
		String str = "";
				
		for(int i=0; i<name.length; i++) {
			str += name[i];
			str += "/";
			str += Integer.toString(score[i]);
			if(i<name.length-1) {
				str += ",";
			}
		}
		System.out.print(str);

	}

}
