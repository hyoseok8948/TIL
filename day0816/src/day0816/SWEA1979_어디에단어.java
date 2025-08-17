package day0816;

import java.util.Scanner;

public class SWEA1979_어디에단어 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		for (int tc = 1; tc <= testCase; tc++) {
			int N = sc.nextInt();
			int[][] puzzle = new int[N][N];
			
			int K = sc.nextInt();
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					puzzle[i][j] = sc.nextInt();

				}
			}
			//카운트 저장할거
		int count = 0;
		
		//가로로 찾기
		for(int i = 0; i < N; i++) {
			int length = 0;//1의 길이를 증가시키고 K에 길이 충족한다면 count증가
			for(int j =0; j < N; j++) {
				if(puzzle[i][j] ==1) {
					length++;//length가 K초과이면 다음 조건에 걸리지 않는다.
				} else {//다음 단어가 0일때
					if(length == K) {
						count++;
					}
					//초기화
					length = 0;
				}
				
				}
			//다음단어가 0이 아닐때
			if(length == K) {
				count++;
			}
		}
		
		//세로로 찾기
		for(int j = 0; j < N; j++) {
			int length = 0;//1의 길이를 증가시키고 K에 길이 충족한다면 count증가
			for(int i =0; i < N; i++) {
				if(puzzle[i][j] ==1) {
					length++;
				} else {//다음 단어가 0일때
					if(length == K) {
						count++;
					}
					//초기화
					length = 0;
				}
				
				}
			//다음단어가 0이 아닐때
			if(length == K) {
				count++;
			}
		}
		
		
		
		System.out.println("#" + tc + " " + count);
		
		
		
		} // 테스트 케이스 종료
		//반복문과 조건문 ,배열의 가로 세로로 탐색하는 방법
	}

}
