package day0815;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA1225_암호생성기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		for(int tc = 1; tc <= 10; tc++) {
			int testCase = sc.nextInt();
			int[] Arr = new int[8];
			
			for(int i = 0; i < 8; i++) {
				Arr[i] = sc.nextInt();
			}
			//System.out.println(Arrays.toString(Arr));
			
			//이거 바깥에 적어두는거 맞음 안에 두면 계속 초기화 
			int minus = 1;
			//조건이 항상 참이기 때문에 계속 진행 if break를 통해 종료
			while(true) {
				//1. 1번칸에 minus만큼 빼기
				int tmp = Arr[0] - minus;
				//2. 한칸씩 앞당기기
				for(int i = 1; i < 8; i++) {
					Arr[i-1] = Arr[i];
				}
				//1번칸에 minus에의해 0 또는 그 이하가 됐다면, minus값을 안나오게 하기 위해
				//그냥 0값을 마지막 칸에 넣는다. 이후 wjhile문을 종료
				if(tmp <= 0) {
					Arr[7] = 0;
					break;
				}
				//그게 아니라면 그냥 뺀값을 맨뒤에 넣고 minus를 1증가
				Arr[7] = tmp;
				//minus = (minus%5)+1;
				minus++;
				//5번 반복하면 다시 1로 초기화
				if(minus > 5) {
					minus = 1;
				}
			}
			System.out.print("#" + tc + " ");
			for(int i =0; i < 8; i++) {
				System.out.print(Arr[i] + " ");
			}
			System.out.println();
			
			
			
			
			
			
			
			
			
		}//테스트케이스 종료
	sc.close();	
	}

}
