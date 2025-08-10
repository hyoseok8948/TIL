package forMe;

import java.util.Scanner;

public class SWEA2068_최대수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		for(int tc =1; tc <= testCase ; tc++) {
			//값비교를 위해 배열 생성
			int[] array = new int[10];
			//최댓값을 넣을 변수 생성
			int result = 0;
			//배열에 값을 넣고 최댓값 구하기
			for(int i = 0; i < 10; i++) {
				int num = sc.nextInt();
				array[i] = num;
				//result값을 갱신해서 최댓값 저장
				if(array[i] > result) {
					result = array[i];
				}
			}
			
			System.out.println("#" + tc + " " + result);
		}

	}

}
