package forMe;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class SWEA1209_sum {

	public static void main(String[] args) throws FileNotFoundException {
		//File file = new File("sum.txt");
	//Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
	
	//배열선언 입력 먼저
	for(int tc =1; tc <= 10; tc++) {
		int[][] arr = new int[100][100];
		
		for(int i = 0; i < 100; i++) {
			for(int j =0;j < 100; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		//비교위한 max값 대각선값들은 2개 뿐이므로 반복문 바깥에 위치한다. 
		int max = 0;
		int diag1 = 0;
		int diag2 = 0;
		
		//반복문 내부에 각줄의 항에 해당하는 r 와 c 의 합계를 선언
		for(int i = 0; i<100;i++) {
			int rowSum = 0;
			int colSum = 0;
			//한계구하기
			for(int j = 0; j <100;j++) {
				rowSum += arr[i][j];
				colSum += arr[j][i];
					
				}
			//비교후 max값에 넣기 행먼저 열다음 어차피 제일 큰수만 입력되면 되기 때문에 따로 정리X
			if(rowSum > max) {
				max = rowSum;
			}
			if(colSum > max) {
				max = colSum;
			}
			//대각선의 특징에 맞춰 합을 구한다.
			diag1 += arr[i][i];
			diag2 += arr[i][99-i];
			
			
			}
		//기존 맥스값과 비교
		if(diag1 > max) {
			max = diag1;
		
		}
		if(diag2 > max) {
			max = diag2;
		}
		System.out.println("#" + tc + " " + max);
		
		
		
		
		
	}
	
	
	
	
	
	}
}