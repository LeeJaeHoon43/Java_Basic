// �θ� Ŭ����
class ParentEx{
	int foo = 5;
	public int getNumber(int a){
		return a + 1;
	}
}
// �ڽ� Ŭ����
public class SonEx extends ParentEx{
	int foo = 7;
	public int getNumber(int a){
		return a + 2;
	}
	public static void main(String[] args) {
		ParentEx pe = new SonEx(); // �������� ������ ��ü ����.
		System.out.println(pe.getNumber(0)); // ��� : 2 = �������� �޼���(���)�� �ڽ� Ŭ������ �޼��带 ����Ѵ�.
		System.out.println(pe.foo); // ��� : 5 = �������� ��� ������ �θ� Ŭ������ �ɹ� ������ ����Ѵ�.
	}
}
