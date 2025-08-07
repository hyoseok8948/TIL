package self;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) throws Exception {
		File file = new File("./src/self/input.txt");
		Scanner sc = new Scanner(file);
		
		
		//T test
		//N
		//N*N만큼 반복문을 돌린다.
		
		int T = sc.nextInt();
		int N = sc.nextInt();
		int cnt = 0;
		int[][] arr = new int[N][N];
		//1번째
		for(int r=0; r<N; r++ ) {
			
			//2번째
			for(int c = 0; c<N;c++) {
				//System.out.printf("#%d - %d%n", ++cnt, sc.nextInt() );
				arr[r][c] = sc.nextInt();//rc를 바꾸면 돌려서 가져옴
			//	System.out.println(Arrays.toString(arr[r]));
			}
				System.out.println(Arrays.toString(arr[r]));
			}
		
		for (int i = 0 ; i < N; i++) {
			System.out.println(Arrays.toString(arr[i]));
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
