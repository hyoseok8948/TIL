package day04_0807;

import java.util.Stack;

public class Stack01_API {

	public static void main(String[] args) {
		// 숫자를 담을 수 있는 스택이 완성!
		Stack<Integer> stack = new Stack<>();
		//문자를 담을수 있는 스택
		//Stack<String>
		
		//주요 메서드
		//1. push(item -> Integer가 들어온다.(참조자료형))
		int result = stack.push(10);//반환 결과는 item이 반환된다.
		System.out.println(result);
		
		stack.push(20);
		stack.push(30);
		
		//2.pop()
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());//없는걸 꺼내려고 하면 예외발생 컴파일 에러말고 런타임 에러
	
		//무작정빼면 안될것 같아
		//3.isEmpty()
		System.out.println(stack.isEmpty());
		//안에 있는거 전부 빼기
		stack.clear();//스택을 초기화 해버리는 것
		//while문이 참인이상 계속 돈다. 느낌표를 붙여야 빌때까지 순환
		while(!stack.isEmpty()) {
			stack.pop();
			}
		System.out.println(stack.size());//크기 stack.size()
		while(stack.size() != 0) {
			stack.pop();
		}//isEmpty와 동일한 결과를 낼 수 있다.
		
		
		
		//4.peek() 꺼내지 않고 맨위꺼 확인만 하기
		stack.push(100);
		stack.push(200);
		System.out.println(stack.peek());
		System.out.println(stack.size());//peek 은 삭제하지 않는다.
		
	}

}
