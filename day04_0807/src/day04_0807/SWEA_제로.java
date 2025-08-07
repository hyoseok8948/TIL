package day04_0807;

import java.util.Scanner;
import java.util.Stack;

public class SWEA_제로 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 숫자
		int testCase = sc.nextInt();
		// 재민이 입력하는거
		Stack<Integer> minType = new Stack<>();


		for (int tc = 1; tc <= testCase; tc++) {
			int lineCase = sc.nextInt();
			for (int lc = 1; lc <= lineCase; lc++) {

				// 재현이 말하는거
				int hyunSaid = sc.nextInt();
				
				//조건문 현이 말한게 0이면 빼고 아니면 더한다.
				if (hyunSaid == 0) {
					minType.pop();
				} else {
					minType.push(hyunSaid);
				}

			}
			//스택이 빌때까지 더한다.
			int sum = 0;
			while(!minType.isEmpty()) {
				sum += minType.pop();
			}
			System.out.println("#" + tc + " " +sum);
		}
	}

}
