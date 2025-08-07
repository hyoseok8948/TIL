package day02_SWEA;

import java.util.Scanner;

public class SWEA_1954_달팽이숫자 {

	public static void main(String[] args) {
		
		//입력을 받기 위한 Scanner
		Scanner sc = new Scanner(System.in);
		
		//테스트케이스 수
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt(); // N*N크기의 배열 1<=N<=10
			int[][] arr = new int[N][N]; // 채운다!			
			//이동칸에 대한 정보와 증/감에대한 정보가 필요하다.
			int K = N; //이동할 칸의 수 
			int D = 1; //증감 1 > -1 > 1
			
			//현재좌표
			int r = 0;
			int c = -1;//하나 전에서 출발
			int num = 1;
			//반복문을 수행하면서 처리하자!
			//무한루프
			while(true) {
				//수평 > 수직
				for(int i = 0 ; i < K; i ++) {
					//현재 위치의 좌표값
					c += D; //D 때로는 1 때로는 -1
					arr[r][c] = num++;
				}// 수평을 채우기 
				K--;
				if(K==0) break; //종료조건
				//1. K == 0 : 더이상 이동할 수 없어 !
				//2. (r,c) : 중앙 좌표일 때 ( 주의 필요)
				//3. num == N * N
				for(int i = 0; i <K; i++) {
					r += D;
					arr[r][c] = num++;
					
				}//수직을 채웠다...
				D = -D;
			}//달팽이 채우기
			System.out.println("#" + tc);
			for(int i =0; i<N; i++) {
				for(int j =0; j<N; j++) {
					System.out.print(arr[i][j]+ " ");
				}
				System.out.println();
			}
		}
		
		
		
		
		
		
	}

}
