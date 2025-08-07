package day04_0807;
//class MyStack<E> {
//	
//	int top = -1;
//	boolean push(E item) {
//		return true;
//	}
	
//}
public class stack02_Array {
	//배열을 이용한 구현 > 고민포인트 배열의 크기를 결정하는 ->싫으면 10만~100만 사이 값을 넣어라
	//문제가 푸시 팝 엔개가 주어진다고 가정 배열의 크기가 N 까지 가지 않는다. 하지만 다넣었다고 가정하고 크기를N으로 생각
	static String[] stack = new String[10];
	static int top = -1;// -1은 인덱스 밖 공백상태를 보여준다.현재 탑의 초기화 상태
	public static void main(String[] args) {
		
		}

	
	
	//pusj
	static boolean push(String item) {
		//배열이므로 1.가득 차 있는지 췤
		if(top == stack.length-1) {
			//가득차 있으므로 작업진행 불가
			//스택의 크기를 2배로 늘려서 복사를 해 두던가
			//못한다고 쳐내자
			System.out.println("더 못 들어감ㅇㅇ");
			return false;
		}
		//top을 하나 증가시키고 아이템을 삽입하겠다.
//		top += 1;
//		stack[top] = item;
		
		//위의 두줄과 동일
		stack[++top] =item;
		
		
		//냅다 집어넣기.....
		
		return true;
	}
	
	//pop
	static String pop() {
		//배열이 아니더라도 이연산은 해봐야 한다.
		if(isEmpty()) {
			//공백상태이므로 작업진행
			System.out.println("뺄게 없다.");
			return null;
		}
		// 공백이 아니면 꺼낸다
//		String result = stack[top];
//		top -= 1;
//		return result;
		
		return stack[top--];//다시 푸시하면 이전 값 덮어쓰기니까 지울핑ㄹ요없이 배
	}
	
	static boolean isEmpty() {
		return top == -1;
	}
	
	
	
	
//	//isFull()
//	static boolean isFull() {
//		if(top == stack.length-1)
//			return true;
//		else
//			return false;
//		
		//else를 안쓰면
	static boolean isFull() {
		return top == stack.length-1;
		}
	
	
	
	
	
}
