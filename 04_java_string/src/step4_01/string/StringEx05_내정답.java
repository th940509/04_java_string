package step4_01.string;
//2021/04/05 17:03 ~ 17:15

public class StringEx05_내정답 {

	public static void main(String[] args) {

		String jumin = "890101-2012932";
		// 문제 1) 나이 출력
		// 정답 1) 33세
		
		String strAge = jumin.substring(0,2);
		int intAge = Integer.parseInt(strAge);
		int age = 2021 - (1900 + intAge) + 1;
		System.out.println(age + "세");
		
		// 문제 2) 성별 출력
		// 정답 2) 여성

		
		char gender = jumin.charAt(7);
		if(gender == '1' || gender == '3') {
			System.out.println("남성");
		}
		if(gender == '2' || gender == '4' ) {
			System.out.println("여성");
		}
			
	}

}
