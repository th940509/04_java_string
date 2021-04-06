package step4_01.string;
//2021/04/06 16:16 ~ 16:27
/*
 * # 끝말잇기 게임
 * 
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * 제시어 : 미술
 * 입력 : quit
 * 
 * - 종료 -
 * 
 */

import java.util.Scanner;

public class StringEx10_내정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		String start = "자전거";
		
		while(true) {
			System.out.println("제시어 : " + start);
			System.out.print("입력: ");
			String input = scan.next();
			
			if(start.charAt(start.length()-1)==input.charAt(0)) {
				start = input;
			}
			if(input.equals("quit")) {
				System.out.print("종료");
				break;
			}
		}

	}

}
