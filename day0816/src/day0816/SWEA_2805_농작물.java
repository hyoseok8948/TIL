package day0816;

import java.util.Scanner;

public class SWEA_2805_농작물 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		for (int tc = 1; tc <= testCase; tc++) {
			int N = sc.nextInt();
			int[][] field = new int[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					field[i][j] = sc.nextInt();
				}
			}
			// 가운데
			int center = N / 2;
			// 위 삼각형의 합
			int sumUp = 0;
			// 가운데 에서 퍼져나감
			for (int r = 0; r < center; r++) {
				int start = center - r;
				int end = center + r;
				for (int c = start; c <= end; c++) {
					sumUp += field[r][c];
				}
			}

			// 아래 삼각형
			int sumDown = 0;
			for (int r = center + 1; r < N; r++) {
				int distFromCenter = r - center;
				int start = distFromCenter;
				int end = N - 1 - distFromCenter;
				for (int c = start; c <= end; c++) {
					sumDown += field[r][c];

				}
			}
			
			System.out.println("#" + tc + " " + sumDown + sumUp);

		} // 테케종료
		sc.close();
	}

}
