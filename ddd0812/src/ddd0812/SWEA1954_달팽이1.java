package ddd0812;

import java.util.Scanner;

public class SWEA1954_달팽이1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		for (int tc = 1; tc <= testCase; tc++) {
			int N = sc.nextInt();
			int[][] snail = new int[N][N];
			
			//x,y좌표의 시작
			int x = 0;
			int y = 0;
			
			//이동방향 우0,하1,좌2,상3
			int direction = 0;
			//이동좌표
			int[] dx = {0,1,0,-1};
			int[] dy = {1,0,-1,0};
			
			//n*n숫자로 반복
			for(int i = 1; i <= N * N; i++) {
				//좌표값은 이프문을 통해 이동 i는 계속 증가
				snail[x][y] = i;
				
				
				int nx = x + dx[direction];
				int ny = y + dy[direction];
					
				if(nx < 0|| nx >= N || ny < 0 || ny >= N || snail[nx][ny] != 0) {
						direction = (direction+1)%4;
				}
				//효석아 제발 플러스 못찾아서 해매지 말자
				x += dx[direction];
				y += dy[direction];
				
				
				
			}
			
			System.out.println("#" + tc + " " );
			for(int i = 0; i < snail.length; i++) {
				for(int j = 0; j < snail[i].length; j++) {
					System.out.print(snail[i][j] + " ");
				}
				System.out.println();
			}
			
			
			
			
			
			
		}//테스트케이스 종료
sc.close();
	}

}
