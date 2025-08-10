package forMe;

import java.util.Scanner;

public class SWEA1289_초심자의회문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int tc =1; tc<= testCase; tc++) {
			String word = sc.next();
			
			//회문이라면 그대로 출력
			int result = 1;
			
			//한글자라도 위치에 차이가 있으면 0을 출력
			for(int i = 1; i < word.length()/2;i++) {
				if(word.charAt(i) != word.charAt(word.length()-1-i)) {
					result = 0;
					//브레이크를 통해 데이터가 덮어씌우는걸 막고 바로 빠져나온다.
					break;
				}
			}
			
			System.out.println("#" + tc + " " + result);
			
			
			
		}
		

	}

}
