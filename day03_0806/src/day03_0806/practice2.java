package day03_0806;

public class practice2 {

	public static void main(String[] args) {
		String text = "appleapple";
		String pattern = "pp";
		
		int N = text.length();
		int M = pattern.length();
		
		int num = 0;
		for(int i = 0; i < N-M+1; i++) {
			boolean isOk = true;
			for(int j = 0; j < M; j++) {
				if(text.charAt(i+j) != pattern.charAt(j)) {
					isOk = false;
					break;
				}
			}
			if(isOk) {
				num = num + 1;
				
			}
			
		}
		System.out.println(num);
		
	}
}
	
		