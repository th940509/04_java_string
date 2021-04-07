package step4_01.string;
//2021/04/07 15:11 ~ 16:49

import java.util.Arrays;

// # 정렬 (사전순으로 정렬해 보시오.)

public class StringEx13_내정답 {

	public static void main(String[] args) {
		
		String[] names = {"홍길동", "김유신", "마동석", "자바킹", "서동요"};
		
		for(int i=0; i<5; i++) {
			 
			String minName = names[i];
			int minIdx = i;
				for(int j=i; j<5; j++) {
					if(minName.compareTo(names[j]) > 0) {
						minName = names[j];
						minIdx = j;
					}
				}
				
				String temp = names[i];
				names[i] = names[minIdx];
				names[minIdx] = temp;

		}
		
		System.out.println(Arrays.toString(names));
}	
}