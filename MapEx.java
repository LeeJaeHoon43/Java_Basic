import java.util.*;
import static java.lang.System.out;
public class MapEx{
	public static void main(String[] args) {
		String[] msg = {"������", "����ũǪ��Ʈ", "����Ʈ��Ʈ", "����", "�Ժθ�ũ"}; // �迭 ����.
		HashMap<Integer,String> map = new HashMap<Integer,String>(); // HashMap<String> ����.
		for(int i = 0; i < msg.length; i++){
			map.put(i, msg[i]); // �ʿ� ����. put()�޼��� : ���ڷ� ���޵� Key�� value�� ���� �ʿ� �����Ѵ�.
		}
		Set<Integer> keys = map.keySet(); // �ʿ� ����ǰ� �ִ� key���� Set �������̽��� ��ȯ�Ѵ�.
		for(Integer n : keys){
			out.println(map.get(n)); // �ʿ��� �о����. �ʿ� �ִ� Ű ������ ����Ѵ�. 
		}
	}
}
