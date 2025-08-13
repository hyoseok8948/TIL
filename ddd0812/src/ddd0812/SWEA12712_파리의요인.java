package ddd0812;

import java.util.Scanner;

public class SWEA12712_파리의요인 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		for (int tc = 1; tc <= testCase; tc++) {
			// N은 배열의 크기 , M은 스프레이 세기(퍼져나가는강도)
			int N = sc.nextInt();
			int M = sc.nextInt();

			// 배열에 파리의 수 입력
			int[][] flies = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					flies[i][j] = sc.nextInt();

				}
			}//배열입력끝
			
			//+탐색
			int[] dx = {-1,1,0,0};//상하좌우
			int[] dy = {0,0,-1,1};
			
			//x탐색
			int[] dx2 = {-1,1,-1,1};//좌상,우상,좌하,우하
			int[] dy2 = {-1,1,1,-1};
			
			//전체 최대값
			int max = 0;
			
			//탐색하기
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					//x,y를 순회
					int x = i;
					int y = j;
					//합은 각 중심마다 다르니까 여기 선언
					int sum = flies[i][j];
					int sum2 = flies[i][j];
					//4방 탐색을 시행
					for(int k =0; k<4; k++) {
						//스프레이의 강도만큼 반복 옆으로 1칸 부터 M-1칸 까지
						for(int d = 1; d < M; d++) {
							//*d로 같은방향으로 d만큼 커질 수 있다.
							int nx = x + dx[k] * d;
							int ny = y + dy[k] * d;
							
							//십자문의합
							if(nx >= 0 && nx < N && ny >= 0 && ny < N) {
								sum += flies[nx][ny];
							}
							
							int nx2 = x + dx2[k] * d;
							int ny2 = y + dy2[k] * d;
							//x자문의 합
							if(nx2 >=0 && nx2 < N && ny2 >= 0 && ny2 < N) {
								sum2 += flies[nx2][ny2];
							}
						}
					}//4방 탐색문
					if(sum > max) {
						max = sum;
					}
					if(sum2 > max) {
						max = sum2;
					}
					
				}
			}//x,y돌리기
			System.out.println("#" + tc + " " + max);
			

		} // tc반복문 종료

		sc.close();
	}

}
