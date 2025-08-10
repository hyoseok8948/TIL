package forMe;

import java.util.Scanner;

public class SWEA1208_Flatten2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			int dump = sc.nextInt();

			
			//배열을 미리 구성해둔다
			int arr[] = new int[100];
			for (int i = 0; i < 100; i++) {
				arr[i] = sc.nextInt();
			}
			
			//덤프횟수만큼 반복 맥스값 계속 갱신위해 반복문 안에 선언
			for (int d = 1; d <= dump; d++) {
				int max = 0;
				int min = 101;
				int maxIndex = 0;
				int minIndex = 0;
				//반복문을 통해 최대값과 인덱스를 구한다.이후 arr값을 1줄이고(최대 늘인다(최소.
				for (int i = 0; i < 100; i++) {

					if (arr[i] > max) {
						max = arr[i];
						maxIndex = i;
					}
					if (arr[i] < min) {
						min = arr[i];
						minIndex = i;
					}
				}
				arr[maxIndex]--;
				arr[minIndex]++;

			}
			
			//다시한번 반복문을 통해 정리된 배열의 최대 최소를 구한다.
			int finalMax = 0;
			int finalMin = 101;
			for (int i = 0; i < 100; i++) {
				if (arr[i] > finalMax) {
					finalMax = arr[i];
				}
				if (arr[i] < finalMin) {
					finalMin = arr[i];
				}
			}
			int result = finalMax - finalMin;
			System.out.println("#" + tc + " " + result);
		}

	}

}
