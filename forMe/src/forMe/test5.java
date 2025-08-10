package forMe;

public class test5 {

	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}
		};
		
		int N = arr.length;
		
		//현재좌표
		int x = 1;
		int y = 1;
		
		//8방탐색 12시방향
		int[] dx = {-1,-1,0,1,1,1,0,-1};
		int[] dy = {0,1,1,1,0,-1,-1,-1};
		
		//주변사이즈
		int surround = 0;
		
		//탐색시작
		for(int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && nx < N && ny >= 0 && ny < N) {
				surround++;
				System.out.print(arr[nx][ny]);
			}
		}
		System.out.println();
		System.out.println(surround);
		
		

	}

}
