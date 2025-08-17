import java.util.Scanner;

public class SWEA6485_삼성시버스노선 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		
		for(int tc =1; tc <= testCase; tc++) {
			int[] stations = new int[5001];
			int N = sc.nextInt();
		//N케이스가 누적되어야함	
			for(int i = 0; i < N; i++) {
				//알아서 1 3// 그다음 따로 받음 테스트 케이스로 머리 아프지 말자
				
				int A = sc.nextInt();
				int B = sc.nextInt();
			for(int j = A; j <= B; j++) {
				//j번 정류장은 A번부터니까?
					stations[j] += 1;
				
			}
			}//a,b역할 끝
				
			int P = sc.nextInt();
			//그다음 정류장 번호를 따로 배열로 저장하지 말고 인트값이라고 생각하자;; P에 반복되는 입력값들	
			StringBuilder sb = new StringBuilder();
				for(int k = 0; k < P; k++) {
					int C = sc.nextInt();
					sb.append(stations[C]).append(" ");
				}
			System.out.println("#" + tc + " " + sb.toString().trim());
			}//N문의 종료
		sc.close();
		}//tc문의 종료
	
	}


