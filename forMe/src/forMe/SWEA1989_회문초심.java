package forMe;

import java.util.Scanner;

public class SWEA1989_회문초심 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int testCase = sc.nextInt();
	
	for(int tc = 1; tc <= testCase; tc++) {
		String word = sc.next();
		int result = 1;
		for(int i =0; i < word.length()/2; i++) {
			if(word.charAt(i) != word.charAt(word.length()-i-1)) {
				result = 0;
				break;
			} 
		}
		System.out.println("#" + tc + " " + result);
	}

	}

}
