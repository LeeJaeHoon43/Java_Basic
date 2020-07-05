public class MyStatic{
	// ���
	private int x;
	private static int y; // static ����.

	// static �ʱ�ȭ ���� : static ������ �� ���� �ȿ����� �ʱ�ȭ �� �� �ִ�.
	static{
		y = 5; // 5�� �ʱ�ȭ.
	}

	// ������.
	MyStatic(){
		x = 5;
		y = 10; // ���⼭�� �ʱ�ȭ ������ �ƴ϶� ���� �ٲٴ� �����̴�.
	}

	// getter, setter �޼���� static�� �����ϰ� ����� �� �ִ�.
	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}

	public static void main(String[] args){
		System.out.println("y = " + y); // 5 ���
		MyStatic ms = new MyStatic(); // ��ü ����.
		System.out.println("x = " + ms.getX()); // 5 ���
		System.out.println("y = " + ms.getY()); // 10 ���
		// System.out.println("y = " + MyStatic.getY()); // ���� �߻� : getter, setter�� Ŭ���������� ���� �ʾƵ� �ȴ�.
	}
}
