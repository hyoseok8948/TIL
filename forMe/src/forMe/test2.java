package forMe;

public class test2 {

	public static void main(String[] args) {
		int[] arr = {10,1,3,5,4,5,8,9,2,7};
		
		String max = String.valueOf(arr[0]);
		
		StringBuilder upSb = new StringBuilder();
		upSb.append(arr[0]);
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > arr[i-1]) {
				upSb.append(" ").append(arr[i]);
			} else {
				if(upSb.length() > max.length()) {
					max = upSb.toString();
				}//else문이 발동되면 초기화
				upSb.setLength(0);
				upSb.append(arr[i]);
			}
			
		}//확인
		if(upSb.length() > max.length()) {
			max = upSb.toString();
		}
		System.out.println(max);

	}

}
