import java.util.*;
import static java.lang.System.out;
public class QueueEx{
	public static void main(String[] args) {
		String[] item = {"�ҳ�Ÿ", "������", "��Ծ�"}; // �迭 ����.
		LinkedList<String> q = new LinkedList<String>(); // LinkedList ����.
		for(String n : item){
			q.offer(n); // ��� �߰�. offer() : ���޵� ��Ҹ� ������ ��ҷ� �߰��Ѵ�.
		}
		out.println("q�� ũ�� : " + q.size());
		String data = "";
		while((data = q.poll()) != null){ // poll() : ���� ù ��° ��Ҹ� ��ȯ�� �� �����Ѵ�.
			out.println(data + "����!");
			out.println("q�� ũ�� : " + q.size());
		}
	}
}
