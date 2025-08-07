package day04_0807;

import java.util.Stack;

public class Stack_연습1 {

	public static void main(String[] args) {
	// 숫자를 담을 수 있는 스택
		Stack<Integer> stack = new Stack<>();
		
		
		int result = stack.push(10);
		System.out.println(result);
		
		
		stack.push(20);
		stack.push(30);
	
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
		
		
		System.out.println();
	
	
	
	
	
	
	
	
	
	
	}
	
	
	

}
