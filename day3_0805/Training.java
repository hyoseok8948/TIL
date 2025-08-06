
public class Training {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6 };
		int N = arr.length;

		System.out.println("정방향 순회");
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		
		
		System.out.println("역방향순회");
		
		//1 조건문을 건드리는 방법
		for(int i = N-1; i >= 0 ; i--) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	
	 	//2 인덱스를 건드리는 방법
	for(int i = 0; i < N; i++) {
		System.out.println(arr[N-1-i] + " ");
	}
	System.out.println();

}
}