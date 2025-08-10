package forMe;

public class test6 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 26 } };

		int N = arr.length;

		int[][] pArr = new int[N + 2][N + 2];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				pArr[i + 1][j + 1] = arr[i][j];
			}
		}
		int x = 2;
		int y = 2;
		int[] dx = {-1,-1,0,1,1,1,0,-1};
		int[] dy = {0,1,1,1,0,-1,-1,-1};
		int surround = 0;
		
		for(int l = 0; l < 8;l++) {
			int nx = x + dx[l];
			int ny = y + dy[l];
			if(pArr[nx][ny]!=0) {
				surround++;
				System.out.print(pArr[nx][ny]);
			}
			
		}
		System.out.println();
			System.out.println(surround);
		}

	}


