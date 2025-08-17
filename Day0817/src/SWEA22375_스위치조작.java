import java.util.Arrays;
import java.util.Scanner;

public class SWEA22375_스위치조작 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		for (int tc = 1; tc <= testCase; tc++) {

			int N = sc.nextInt();

			int[] arr1 = new int[N];
			int[] arr2 = new int[N];
			// arr1과 arr2를 반복문을 써서 각각 따로 받는다.
			for (int i = 0; i < N; i++) {
				arr1[i] = sc.nextInt();
			}
			// System.out.println(Arrays.toString(arr1));

			for (int i = 0; i < N; i++) {
				arr2[i] = sc.nextInt();
			}
			// System.out.println(Arrays.toString(arr2));
			
			//카운트를 셀 변수를 반복문 바깥에 선언한다.
			int count = 0;
			//전체를 훑으면서 같으면 지나가고 다르면 카운트를 올리는 조건문을 선언
			for (int i = 0; i < N; i++) {
				if (arr1[i] == arr2[i]) {
					continue;
				} else {
					//이때 시작은 i번째부터 해서 2번째 배열의 i이후 문자를 바꿔준다.
					for (int j = i; j < N; j++) {
						if (arr2[j] == 1) {
							arr2[j] = 0;
						} else {
							if (arr2[j] == 0) {
								arr2[j] = 1;
							}
						}
					}
					//다르다면 이라는 조건이 나올때 올리는 카운트
					count++;
				}
			}

			System.out.println("#" + tc + " " + count);

		} // 테케 종료

	}

}
