package forMe;

import java.util.Scanner;

public class SWEA1213_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		for(int tc = 1; tc <= 10; tc++) {
			int testCase = sc.nextInt();
			String word = sc.next();
			String find = sc.next();
			
			int count = 0;
			
			for(int i = 0; i < find.length() - word.length() + 1 ; i++) {
				boolean isOk = true;
					for(int j = 0; j < word.length();j++) {
						if(find.charAt(i+j) != word.charAt(j)) {
							isOk = false;
							break;
						}
					}
								if(isOk){
							count++;
						}
					}
			 System.out.println("#" + tc + " " + count);
				
				
				
				
				
			}
			
			
		}
		
}


