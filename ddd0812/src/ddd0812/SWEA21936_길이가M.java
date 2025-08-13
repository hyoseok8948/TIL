package ddd0812;

import java.util.Scanner;

public class SWEA21936_길이가M {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int tc = 1; tc <= testCase; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			//결과 위에
			String result = "";
			String sentence = sc.next();
			//M도 나 포함이니까 이하
			for(int i = 0 ; i <= N-M ; i++) {
				//직전값까지니까 -1ㄴㄴ
				String s = sentence.substring(i, i+M);
				if(isPalin(s) == true) {
					result = s;
					break;
				}
			}
			
			
			System.out.println("#" + tc + " " + result);
		}//테스트 케이스 종료
		
		sc.close();

	}
	public static boolean isPalin(String s) {
		int N = s.length();
		for(int i = 0; i < N/2; i++) {
			if(s.charAt(i) != s.charAt(N-1-i)) {
				return false;
			}
			//반복문이 끝나면 회문
		}
		return true;
	}

}
