import java.util.Scanner;

public class 팽이달 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase= sc.nextInt();
		
		for(int tc =1; tc <= testCase; tc++) {
		//N크기의 배열 생성
			int N = sc.nextInt();
		int[][] arr = new int[N][N];
		
		
		//탐색3형제
		//x,y좌표 생성
		int x = 0;
		int y = 0;
		//탐색 방향 생성
		int direction = 0;//0우1하2좌3상
		//4방 탐색 좌표 이동 배열
		int[] dx = {0,1,0,-1};
		int[] dy = {1,0,-1,0};
		
		for(int i = 1; i <= N*N; i++) {
			arr[x][y] = i;
			
			int nx = x + dx[direction];
			int ny = y + dy[direction];
			//범위 벗어남 && 값이 존재할 때 탐색 방향 번경
			if(nx < 0 || nx >=N ||ny <0 || ny >= N || arr[nx][ny] !=0) {
				direction = (direction+1)%4;
			}
			x += dx[direction];
			y += dy[direction];
		}
		
		
		
		
		System.out.println("#" + tc);
		for(int i =0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		}//tc종료

	}

}
