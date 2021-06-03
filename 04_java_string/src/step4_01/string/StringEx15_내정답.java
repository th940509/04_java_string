package step4_01.string;
//2021/04/07 17:17 ~ 17:38

import java.util.Scanner;

/*
 * # 문자열 속 숫자검사
 * 
 * 예) adklajsiod
 * 	     문자만 있다.
 * 예) 123123
 *    숫자만 있다.
 * 예) dasd12312asd
 *    문자와 숫자가 섞여있다.
 */

public class StringEx15_내정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String text = scan.next();
		
		
		char[] num = {'1','2','3','4','5','6','7','8','9','0'};
		
		int count = 0;
		for(int i=0; i<text.length(); i++) {
			for(int j=0; j<num.length; j++) {
				if(text.charAt(i) == num[j]) {
					count ++;
				}
			}
		}
		
		if(text.length() == count) {
			System.out.println("숫자만 있다.");
		}
		else if(count == 0) {
			System.out.println("문자만 있다.");
		}
		else {
			System.out.println("문자와 숫자가 섞여있다.");
		}
		
		scan.close();
	}

}
