package forMe;

public class test3 {

	public static void main(String[] args) {
		int[] arr = {10,1,3,5,4,6,8,9,2,7};
		//비교용 문장 초기화 0
		String max = String.valueOf(arr[0]);
		
		//스트링빌터 초기화 ㅇ
		StringBuilder sb = new StringBuilder();
		sb.append(arr[0]);
		
		//1부터 배열 길이 반복
		for(int i = 1; i < arr.length; i++) {
			//크면 입력 차례로
			if(arr[i] > arr[i-1]) {
				sb.append(" ").append(arr[i]);
				//작은값이 나온다면
			} else {
				//문장의 길이가 최대일때 값을 변경
				if(sb.length() > max.length()) {
					max = sb.toString();
				}//이후 스트링빌터 초기화
				sb.setLength(0);
				sb.append(arr[i]);
			}
		}//반복문 바깥에서 재확인
		if(sb.length() > max.length()) {
			max = sb.toString();
	}//출력
		System.out.println(max);
	}
}
