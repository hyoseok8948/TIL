package day04_0807;

import java.util.Stack;

public class stack03_괄호검사연습 {

	public static void main(String[] args) {
		
		String str = "(()))()()()";
		
		Stack<Character> stack = new Stack<>();
		boolean isOk = true;
				for(int i = 0; i <str.length(); i++) {
					//1.여는괄호가 있으면 넣어
				if(str.charAt(i) == '(') {
					stack.push(str.charAt(i));
					
				}
				//2. 닫는괄호 확인 하기
				else {
					if(stack.isEmpty()) {
						isOk = false;
						break;
					}else {
						char c = stack.pop();
					}
				}
				}
		
		
		
		
		
		
		
		
		

	}

}
