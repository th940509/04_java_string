package step4_01.string;

//문자열 관련 메서드

public class StringEx03 {

	public static void main(String[] args) {

		String str = "magait";
		System.out.println(str);
		System.out.println("======================");
		
		
		//[1] 문자열 길이: length();
		System.out.println(str.length());
		int size = str.length();
		System.out.println(size);
		System.out.println("=====================");
		
		//[2] 문자 한개 추출 ( 인덱싱 ): CharAt(index)
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		char ch = str.charAt(2); // (중요)charAt메서드의 결과는 char자료형이다.
		System.out.println(ch);
		System.out.println(str.charAt(str.length()-1)); // 마지막 글자 추출하기
		System.out.println();
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		System.out.println("=======================");
		
		//[3] 문자 여러개 추출 ( 슬라이싱 ): substring()
		// 공백(space)도 1개의 문자로 취급함.
		
		//3-1) substring(index1이상, index2 미만)
		System.out.println(str.substring(0,4));
		System.out.println(str.substring(4,6));
		String subStr = str.substring(2,4); // (중요)substring메서드의 결과는 String자료형이다.
		System.out.println(subStr);
		System.out.println();
		
		//3-2) substring(index1부터 끝까지)
		System.out.println(str.substring(2));
		System.out.println(str.substring(4));
		System.out.println("=======================");
		
		//[4] 구분자로 잘라내기: split("구분자")
		
		String str1 = "hello,java";
		String str2 = "hello java programing";
		String str3 = "hello@java@programing@megait";
		
		String[] temp = str1.split(",");
		System.out.println(temp.length);
		for(int i=0; i<temp.length; i++) {
			System.out.print(temp[i]+" ");
		}
		
		System.out.println();
		
		temp = str2.split(" ");
		System.out.println(temp.length);
		for(int i=0; i<temp.length; i++) {
			System.out.print(temp[i]+" ");
		}
		
		System.out.println();
		
		temp = str3.split("@");
		System.out.println(temp.length);
		for(int i=0; i<temp.length; i++) {
			System.out.print(temp[i]+" ");
		}
		
		System.out.println("=======================");
		
		//[5] 문자열 비교: compareTo()
		str1 = "aa";
		str2 = "ab";
		str3 = "ac";
		
		System.out.println(str1.compareTo(str2)); // 왼쪽값(기준값)이 작을 경우 음수가 반환된다.
		
		System.out.println(str2.compareTo(str1)); // 왼쪽값(기준값)이 클 경우 양수가 반환된다.
		
		System.out.println(str1.compareTo(str3)); // 왼쪽값(기준값)이 같을 경우 0이 반환된다.
		
		
		
		
		
		
		
		
	}

}
