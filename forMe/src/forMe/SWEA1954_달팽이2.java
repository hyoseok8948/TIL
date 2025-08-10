package forMe;

import java.util.Scanner;

public class SWEA1954_달팽이2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();

		for (int tc = 1; tc <= testCase; tc++) {
			//2차배열 생성식
			int num = sc.nextInt();
			int[][] snail = new int[num][num];
			
			//현재위치
			int x = 0;
			int y = 0;
			
			//방향설정
			int direction = 0;// 0우1하2좌3상
			int[] dx = { 0, 1, 0, -1 };
			int[] dy = { 1, 0, -1, 0 };
			
			//반복 조건문 반복문의 범위는 넣는 숫자의 최댓값을 기준으로
			for (int i = 1; i <= num * num; i++) {
				snail[x][y] = i;
				
				//다음 위치 입력식 x와 y는 서로 고정과 이동을 번갈아 한다.
				int nextX = x + dx[direction];
				int nextY = y + dy[direction];
				
				//조건식 범위를 이탈하거나 다음 위치에 수가 존재한다면 방향을 전환한다.
				if (nextX < 0 || nextX >= num || nextY < 0 || nextY >= num || snail[nextX][nextY] != 0) {
					direction = (direction + 1) % 4;
				}
				
				//행 열의 증감식 이것도 서로 반대 +=를 항상 인식할 것
				x += dx[direction];
				y += dy[direction];

			}

			System.out.println("#" + tc + " ");
			for (int i = 0; i < snail.length; i++) {
				for (int j = 0; j < snail[i].length; j++) {
					System.out.print(snail[i][j] + " ");
				}
				System.out.println();
			}

		}

	}
}
