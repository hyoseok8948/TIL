package forMe;

import java.util.Scanner;

public class SWEA1206_view {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 1차원 배열에 건물 높이 입력
		for(int tc = 1; tc <= 10;tc++) {
			int N = sc.nextInt();
			int[] buildingNum = new int[N];
			for(int i = 0; i < buildingNum.length; i++) {
				int tmp = sc.nextInt();
				buildingNum[i] = tmp;
			}
				
			//조망권의 합 선언 tc아래
			int sum = 0;
				//2번째 맥스값 구하기 범위는 앞에 0 2개 뒤에 0두개 지우고 계산
			//max저장 선언 현재값 저장 선언후 왼쪽먼저 차례로 비교 이후 오른쪽 비교해서 최댓값 구함 
				for(int j = 2; j < N-2; j++) {
					int max = 0;
					int center = buildingNum[j];
					
					if(buildingNum[j-2] < buildingNum[j-1]) {
						max = buildingNum[j-1];
					} else {
						max = buildingNum[j-2];
					}
					if(buildingNum[j+1]> max) {
						max =buildingNum[j+1];
					}
					if(buildingNum[j+2]>max) {
						max=buildingNum[j+2];
					}
					//그리고 현재값 - 최댓값이 양수일 때 조망권 확보
					if(center > max) {
						sum += center-max;
						
					}
				}//조망권 구하기 끝난후에 출력
				System.out.println("#" + tc + " " + sum);
			}
	
	
	
	
	
	}
}