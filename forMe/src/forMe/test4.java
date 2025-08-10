package forMe;

public class test4 {

	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}
				
		};
		//배열의 크기 범위 구할 때 필요
		int N = 5;
		//주변을 둘러싼 것의 크기
		int surround = 0;
		
		//확인좌표
		int x =0;
		int y =0;
		
		//8방탐색
		//12시방향
		int[] dx = {-1,-1,0,1,1,1,0,-1};
		int[] dy = {0,1,1,1,0,-1,-1,-1};
		
		for(int i = 0 ; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && nx < N && ny >=0 && ny <N ) {
				surround++;
				System.out.print(arr[nx][ny]);
			}
			
			
			
		}
		System.out.println();
		System.out.println(surround);
		

	}

}
