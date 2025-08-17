package day0816;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA6190_정곤이증가수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		
		for(int tc =1; tc <= testCase; tc++) {
			//정수 N
			int N = sc.nextInt();
			
			//N개의 정수를 받는 배열
			int[] arr = new int[N];
			
			for(int i = 0; i < N;i++) {
				arr[i] = sc.nextInt();
			}
		
			//System.out.println(Arrays.toString(arr));
			
			
			//조건식을 바로 갈 수 있나?
			//최댓값의 초기화를 -1로 해야한다. 왜냐하면 없으면 -1을 내야 하기 때문
			int max = -1;
			
			
			//j는 i보다 1크고 똑같이 N보다는 작아야한다.
			for(int i = 0; i < N; i++) {
				for(int j =i + 1; j < N; j++) {
					//각 숫자에 대해 참거짓 초기화 해야 되서.
					boolean isOk = true;
				//나머지 수들과의 곱
					int goUp = arr[i] * arr[j];
				String goUpSt = String.valueOf(goUp);
				//각 자리수를 비교해서 단조 증가해야함
				for(int k = 0; k < goUpSt.length()-1; k++) {
					if(goUpSt.charAt(k) > goUpSt.charAt(k+1)) {
						isOk = false;
						break;
					}
				
			}
				if(isOk) {
					max = Math.max(max, goUp);
				}
			}
			}
			
			
			
			System.out.println("#" + tc + " " + max);
			
			
			
			
			
			
			
			
			
		}//테케 종료
		
		
		
		
		
		
		
		sc.close();

	}

}
