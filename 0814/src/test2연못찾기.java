import java.util.Arrays;
import java.util.Scanner;

public class test2연못찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int tc=1; tc <= testCase; tc++) {
			int N = sc.nextInt();
			
			int[][] arr = new int[N][N];
			
	for(int i = 0; i < N; i++) {
		for(int j = 0; j < N; j ++) {
			arr[i][j] = sc.nextInt();
		}
	}
		//팔방탐색
	int[] dx = {-1,-1,0,1,1,1,0,-1};
	int[] dy = {0,1,1,1,0,-1,-1,-1};
	 //카운트 얘가 답으로 나와야 하니까 tc안에
	int count = 0;
	
	//x,y,좌표를 다 돌검사할때 
	for(int x = 0; x < N ; x++) {
		for(int y =0; y < N; y++) {
			//여기에 맞춰서 참값을 낸다.
			boolean isOk = true;
			//팔방탐색문
			for(int z = 0; z < 8; z++) {
				int nx = x + dx[z];
				int ny = y + dy[z];
				//조건식 확인
				if(nx>=0 && nx < N && ny >= 0 && ny < N) {
					if(arr[nx][ny]<arr[x][y]) {
						isOk = false;
						break;
					}
				}
				
			}
			//맞춰서 참값 count를 증가
			if(isOk)
				count++;
		}
	}
		
		
		
		
		System.out.println("#" + tc + " " + count);
		
		}//tc종료
sc.close();
}
	}

