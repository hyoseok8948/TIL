package forMe;

import java.util.Scanner;

public class SWEA1208_flatten {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {

			int dump = sc.nextInt();

			int[] arr = new int[100];
			//복잡하니까 배열을 입력해두자
			for (int i = 0; i < 100; i++) {
				int num = sc.nextInt();
				arr[i] = num;
			}
			
			//덤핑횟수만큼 반복
			for (int d = 1; d <= dump; d++) {
				//max값을 반복마다 초기화 + 인덱스를 찾아서 거기에 해당하는 배열을 1씩 줄이거나 늘림
				int max = 0;
				int min = 101;
				int maxIndex = 0;
				int minIndex = 0;
				
				for (int i = 0; i < 100; i++) {
					if (arr[i] > max) {
						max = arr[i];
						maxIndex = i;
					}
					if (arr[i] < min) {
						min = arr[i];
						minIndex = i;
					}

				}//맥스와 min을 줄여나간다.
				arr[maxIndex]--;
				arr[minIndex]++;
			}
			
			//평탄화된 배열에서 최대와 최소를 구하자.
			int finalMax = 0;
			int finalMin = 101;
			for(int j = 0; j< 100; j++) {
				if(arr[j] > finalMax) {
					finalMax = arr[j];
				}
				if(arr[j] < finalMin) {
					finalMin = arr[j];
				}
			}
			int result = finalMax - finalMin;
			System.out.println("#" + tc + " " + result);
		}
	}
}