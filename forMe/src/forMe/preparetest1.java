package forMe;

public class preparetest1 {

	public static void main(String[] args) {
		int[] arr = { 10, 1, 3, 5, 4, 6, 8, 9, 2, 7 };

		String max = String.valueOf(arr[0]);

		StringBuilder sb = new StringBuilder();
		sb.append(arr[0]);

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i - 1]) {
				sb.append(" ").append(arr[i]);
			} else {
				if (sb.length() > max.length()) {
			
				max = sb.toString();
			}
			sb.setLength(0);
			sb.append(arr[i]);
			}
		}
		if(sb.length() > max.length()) {
			max = sb.toString();
		}
		System.out.println(max);
	}

}
