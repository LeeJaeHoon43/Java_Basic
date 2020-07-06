import java.util.*;
class AData{

	int x;
	int y;

	public AData(int x, int y){
		this.x = x;
		this.y = y;
	}
	public void disp(){
		System.out.println("x = " + x + ", y = " + y);
	}
}
public class HashSetEx{
	public static void main(String[] args) {
		AData ap = new AData(10,20);
		AData bp = new AData(20,30);
		AData cp = new AData(30,40);
		HashSet<AData> hs = new HashSet<AData>(); // HashSet ����.
		hs.add(ap); // add() : ���׸� Ÿ������ �Ѿ�� ��ü�� Set������ ���ٸ� �߰��ϰ� true�� ��ȯ�Ѵ�.
		hs.add(bp);
		hs.add(cp);
		System.out.println("�ؽ��ڵ� : " + hs.hashCode()); 
		System.out.println("�� ������ ũ�� : " + hs.size());
		// Iterator : Collection���� ����ϸ� �����͸� �о��ִ� ����.
		Iterator<AData> it = hs.iterator(); // iterator() : �� Set������ ��ҵ��� ������� ó���ϱ� ���� Iterator��ü�� ��ȯ�Ѵ�.
		while(it.hasNext()){ // hasNext() : ���� ��ġ���� ������ �����Ͱ� ������ true, ������ false ��ȯ.
			it.next().disp(); // next() : ������ �ִ� �����͸� �������� �޼���.
		}
	}
}
