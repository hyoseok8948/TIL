package day0816;

import java.util.Scanner;

public class SWEA_1926_간단한369 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] Arr = new int[N];
		StringBuilder sb = new StringBuilder();
		for(int n =1; n <= N; n++) {
			Arr[n-1] = n;
		}
		//System.out.println(Arrays.toString(Arr));
		for(int i = 0; i < N; i++) {
			String threeCheck = String.valueOf(Arr[i]);
		int count = 0;
		for(int j = 0; j < threeCheck.length();j++) {
			char check = threeCheck.charAt(j);
			
			if(check == '3' || check == '6' || check =='9') {
				count++;
			}
		}
		if(count > 0) {
			for(int k = 0; k < count; k++) {
				sb.append("-");
			}
		} else {
			sb.append(Arr[i]);
		}
		sb.append(" ");
		}
	System.out.println(sb.toString().trim());	
	}
		
	}


