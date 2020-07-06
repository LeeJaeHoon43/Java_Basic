import java.util.*;
import static java.lang.System.out;
public class StackEx{
	public static void main(String[] args) {
		String[] groupA = {"독일", "프랑스", "영국","이탈리아"}; // 배열 생성.
		Stack<String> stack = new Stack<String>(); // String만 받는 스택 생성.
		for(String n : groupA){
			stack.push(n); // push() : Stack의 가장 위쪽에서 객체를 추가한다.
		}
		while(!stack.isEmpty()){ // isEmpty() : Stack이 비었는지 비교하여 비어 있으면 true를 반환한다.
			out.println(stack.pop()); // pop : Stack의 가장 위 쪽에 있는 객체를 삭제하고 그 객체를 반환한다.
		}
	}
}
