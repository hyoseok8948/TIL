package forMe;

import java.util.Scanner;

public class SWEA1954_달팽이 {

	public static void main(String[] args) {
	
		
	Scanner sc = new Scanner(System.in);
	int testCase = sc.nextInt();
	
	for(int tc = 1; tc <= testCase; tc++) {
		int num = sc.nextInt();
		int[][] snail = new int[num][num];
		
		int[] dx = {0,1,0,-1};
		int[] dy = {1,0,-1,0};
		
		int x=0, y=0;
		int moveTo = 0;//현재 방향 0오1아래2왼3위
		
		//배열에 넣을 숫자로 반복문 생성
		for(int i = 1; i <= num*num; i++) {
			//현재위치에 i를 넣는게 기본
			snail[x][y] = i;
			
			int nextX = x + dx[moveTo];
			int nextY = y + dy[moveTo];
			
			//유효하지 않은 경우 방향을 전환한다. 음수일경우 범위 벗어남//배열보다 클 경우 범위 벗어남//값이 있을 경우 넣을 수 없음
			if(nextX < 0|| nextX >= num || nextY < 0 || nextY >= num || snail[nextX][nextY] != 0) {
				moveTo = (moveTo + 1)%4;
				}
			
			x += dx[moveTo];//(1,2)(2,2)
			y += dy[moveTo];//(0,0)(0,1)(0,2)
			
		}
		
		for(int i = 0; i < snail.length; i++) {
			for(int j = 0; j < snail[i].length; j++) {
				System.out.print(snail[i][j] + " ");
			}
			System.out.println();
		}
		
		
			}
		}
		
		
		
		
		
		
	}

		
		
		
		
		
		
	