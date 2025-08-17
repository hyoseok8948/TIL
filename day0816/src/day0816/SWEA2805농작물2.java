package day0816;

import java.util.Scanner;

public class SWEA2805농작물2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int tc = 1; tc <= testCase; tc++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			
			
			for(int i  = 0; i < N; i++) {
				String numbers = sc.next();
				for(int j = 0; j < N; j++) {
					//아니 이건 왜 값입력하는거부터 어렵냐 
					arr[i][j] = numbers.charAt(j) - '0';
				}
			}
			
			//
			int center = N/2; //중심 좌표(2,2) 5일때
			int sum = 0;
			for(int r = 0; r < N; r++) {
				for(int c = 0; c < N; c++) {
					//중심과의 거리 구하기
					//찐거리
					int diffX= r - center;
					int diffY = c -center;
					
					//절대값거리
					int absDiffX = Math.abs(diffX);
					int absDiffY = Math.abs(diffY);
					
					//각 좌표 ~ 중심까지의 반지름의 거리 구하기
					int wholeDistance = absDiffX + absDiffY;
					
					if(wholeDistance <= center) {
					sum += arr[r][c];	
					}
					
					
					
				}
			}//합계 구하기 종료
			
			
			
			
			//최종 계산 합
			System.out.println("#" + tc + " " + sum);
			
			
			
			
			
			
			
			
			
			
			
			
			
		}//테케종료
		
		
		
		
		
		
		
	}

}
