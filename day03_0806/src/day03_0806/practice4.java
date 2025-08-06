package day03_0806;

public class practice4 {

	public static void main(String[] args) {
		String str = "다시합창합시다!";
		
		int N = str.length();
		
		
		//1.뒤집기(반복문)
//str 길이만큼에 배열 생성 왜? 거꾸로 집어넣을 통이 필요해서
		char[] arr = new char[N];
		for(int i = 0; i < N; i++) {
			//charAt은 인덱스위치의 글자를 불러올 수 있다.
			arr[i] = str.charAt(N-1-i);
		}
		String str2 = new String(arr);
		System.out.println(str2);
		
		//2. StringBuilder
		StringBuilder sb = new StringBuilder();
		sb.append(str).reverse();
		System.out.println(sb.toString());
		
		//3. swap
		//미리 새로운 배열에 집어넣어둔다.
		char[] arr2 = str.toCharArray();
		for(int i = 0; i <N/2; i++) {//180도 회전 느낌?
			//임시변수에 배열을 집어넣고
			char tmp = arr2[i];
			//배열의 역배열을 집어넣기
			arr2[i] = arr2[N-1-i];
			//그리고 맨뒤부터 앞에값(임시변수에 있는거?) 집어넣기
			arr2[N-1-i] = tmp;
		}
		System.out.println(new String(arr2));//배열을 문자열로 보여주기
		
				
	}

}
