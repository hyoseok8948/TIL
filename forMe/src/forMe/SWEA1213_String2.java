package forMe;

import java.util.Scanner;

public class SWEA1213_String2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	for(int tc =1; tc <= 10; tc++) {
		int testCase = sc.nextInt();
		String word = sc.next();
		String sentence = sc.next();
		
		int count = 0;
		
		for(int i =0; i < sentence.length() - word.length() +1; i++) {
			//성공실패를 기억하기 위해 불리언 선언
			boolean isOk = true;
			
			//일치하지 않는경우가 아니라면
			for(int j = 0; j< word.length(); j++) {
				if(sentence.charAt(i+j) != word.charAt(j)) {
					isOk = false;
					break;
				}
			}
			//일치하는 경우뿐이므로 카운트를 증가시킨다.
			if(isOk) {
				count++;
			}
		}
		System.out.println("#" + tc + " " + count);
	}
	}

}
