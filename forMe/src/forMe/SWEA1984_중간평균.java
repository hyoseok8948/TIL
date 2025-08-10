package forMe;

import java.util.Scanner;

public class SWEA1984_중간평균 {

	public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				
				int testCase = sc.nextInt();
				
				for(int tc = 1; tc <= testCase; tc++) {
					int result = 0;
					//모든수가 max보다 크게, min보다 작게 해야 갱신이 된다.
					int min = Integer.MAX_VALUE;
					int max = Integer.MIN_VALUE;
					int sum = 0;
					for(int i = 0; i < 10; i++) {
						int num = sc.nextInt();
						
						 sum += num;
						 //최대와 최소 구하기
						 if(num > max) {
							 max = num;
						 }
						 if(num < min) {
							 min = num;
						 }
						
					}
					//반올림 math를 쓰지 않고 하는 법.
					result = (int)((sum - min - max)/8.0 + 0.5);
					System.out.println("#" + tc + " " + result);
				}
				
				
				
				
				

			}

		}

	


