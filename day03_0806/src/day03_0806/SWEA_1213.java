package day03_0806;

import java.util.Scanner;

public class SWEA_1213 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		//tc만큼 반복하기
		for(int tc = 1; tc <= 10; tc++) {
			//입력도 반복입력해야되나.
			int testCase = sc.nextInt();
			//문장입력 입력위치땜에 바꿈
			String pattern = sc.next();
			String sentence = sc.next();
			//문장길이
			int N = sentence.length();
			int M = pattern.length();
			
			//합칠 sum 선언해두기 !
			int sum = 0;
			//브루트포스로 처음부터 뒤지기
			for(int i = 0; i < N-M+1; i++) {
				//찾으면 참을 배출하는 불리언
				boolean isOk = true;
				for(int j = 0; j < M; j++ ) {
					//값이 나오지 않을 경우 오케이는 폴스고 브레이크
					if(sentence.charAt(i+j) != pattern.charAt(j)) {
						isOk = false;
						break;
					}
				}//j문 빠져나오기 만약 값이 나올 경우 더하기
				if(isOk) {
					sum = sum + 1;
				}
				
			}
			System.out.println("#" + tc + " " +sum);
			
			
			
			
		}

	}
}
