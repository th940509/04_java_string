package step4_01.string;
//2021/04/05 17:16 ~ 17:41

//# 문자열 1차원

public class StringEx06_내정답 {

	public static void main(String[] args) {
		
		String str = "11/100/89";
		// 문제 1) arr 배열에 각 점수를 저장하고, 총점 출력
		// 정답 1) 200
		
		int[] arr = new int[3];
		int total = 0;
		
		String[] str2 = str.split("/");
		for(int i=0; i<3; i++) {
			arr[i] = Integer.parseInt(str2[i]);
			total += arr[i];
		}
		System.out.println(total + "점");
		
		// 문제 2) scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결
		// 정답 2) 11/100/89
		int[] scores = {11, 100, 89};
		String text = "";
		
		for(int i=0; i<3; i++) {
			text +=  Integer.toString(scores[i]);
			if( i < scores.length-1) {
				text += "/";
			}
		}
		System.out.print(text);

	}

}
