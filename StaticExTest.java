class StaticEx{

	int x;
	static int y;

	// static �ʱ�ȭ ����.
	static{
		y = 10;
	}

	// Static Ŭ���� �ȿ����� getter, setter�޼���� ���� static�� �������� �ʾƵ� static������ ��� �����ϴ�.
	public void aaa(){
		System.out.println(y);// static Ŭ������ ��� �޼���� ����.
	}
}
public class StaticExTest{
	public static void main(String[] args){
		System.out.println("StaticEx.y : " + StaticEx.y); // static���� �ʱ�ȭ�� 10�� ��µȴ�.
		StaticEx.y = 100; // y�� ���� 100�� ����.
		StaticEx se = new StaticEx(); // ��ü ����.
		System.out.println("se.x : " + se.x); // ����. (��ü�� �߻����Ѿ� �Ѵ�.) -> ��ü�� �����ϸ� 0�� ��µȴ�.
		System.out.println("StaticEx.y : " + StaticEx.y); // 100 ���.
		se.x = 50; // x�� �� 50���� ����.
		StaticEx se1 = new StaticEx(); // ���ο� ��ü ����1 : x = 0, y = 0 ���� �ʱ�ȭ.
		System.out.println(se1.x); // 0 ���
		System.out.println(se1.y); // 100 ���
		se.y = 150; // y�� �� 50���� ����.
		StaticEx se2 = new StaticEx(); // ���ο� ��ü ����2 : x = 0, y = 0 ���� �ʱ�ȭ.
		System.out.println(se2.x); // 0 ���
		System.out.println(se2.y); // 150 ���
		se2.aaa(); // 150 ���
		System.out.println("se1.y : " + se1.y); // 150
		System.out.println("se2.y : " + se2.y); // 150
		System.out.println("StaticEx.y : " + StaticEx.y); // 150
	}
}