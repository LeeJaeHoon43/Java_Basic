import java.util.*;
import static java.lang.System.out;
public class StackEx{
	public static void main(String[] args) {
		String[] groupA = {"����", "������", "����","��Ż����"}; // �迭 ����.
		Stack<String> stack = new Stack<String>(); // String�� �޴� ���� ����.
		for(String n : groupA){
			stack.push(n); // push() : Stack�� ���� ���ʿ��� ��ü�� �߰��Ѵ�.
		}
		while(!stack.isEmpty()){ // isEmpty() : Stack�� ������� ���Ͽ� ��� ������ true�� ��ȯ�Ѵ�.
			out.println(stack.pop()); // pop : Stack�� ���� �� �ʿ� �ִ� ��ü�� �����ϰ� �� ��ü�� ��ȯ�Ѵ�.
		}
	}
}
