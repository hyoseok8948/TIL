package ddd0812;

import java.util.Scanner;

public class test2_퐁당1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int tc = 1; tc <= testCase; tc++) {
		int N = sc.nextInt();
		int[][] pond = new int[N][N];
		
		for(int i = 0; i < pond.length;i++) {
			for(int j = 0; j < pond[i].length; j++) {
				pond[i][j] = sc.nextInt();
					//System.out.print(pond[i][j] + " ");
			}
			//System.out.println();
		}
		
		
		
		int x = 0;
		int y = 0;
		//12시부터 탐색
		int[] dx = {-1,-1,0,1,1,1,0,-1};
		int[] dy = {0,1,1,1,0,-1,-1,-1};
		
		//결과를 저장할 카운트는 반복문 바깥에 둔다.
		int upcount = 0;
		for(int i = 0; i < pond.length; i++) {
			
			
			for(int j = 0; j < pond[i].length; j++) {
				//참거짓은 반복문 위에 둬서 x,y바뀔 때마다 초기화
				boolean isOk = true;
		
		for(int z = 0; z < 8; z++) {
			int ni = i + dx[z];
			int nj = j + dy[z];
			//조건문 범위 내부이고 주변중 어떤 것이 낮으면 다음으로 넘어감
			if(ni >= 0 && ni < N && nj >= 0 && nj < N) {
			if(pond[ni][nj] < pond[i][j]) {
			isOk = false;
			break;
			}
		}
		
		}
		//이것도 반복문 안에 둬서 마치기 전에 카운트 증가(모두 높다면)
		if(isOk) {
			upcount++;
		}
		}
		}
		
		
		
		
		
		System.out.println("#" + tc + " " + upcount);
		}//테스트케이스 종료
	sc.close();
	}

}
