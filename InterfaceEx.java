/*
# �������̽�
- �ڹٿ��� ũ�� Ŭ������ �������̽��� ������.
* ����
[��������] interface [�������̽���]{
	// ��������� ���� �� �ִ� ������ ��� ���̴�.
	���;
	// ��� �޼���� ���� �� �ִ� �޼���� �߻� �޼��� ���̴�.
	�߻�޼���;
}
- ���� ��ü�� ���� �� ��� �������� �̿��� ��ü�� ������ �Ѵ�.
- Ŭ������ Ŭ������, �������̽��� �������̽��� ��ӹ��� ���� extends, Ŭ������ �������̽��� ��ӹ��� ���� implements��� ����.
- ���� ���� ��ӹ޴� ���� ���� ����̶�� �Ѵ�. Ŭ������ ���� ��Ӹ� ������ �������̽��� ���� ����� �����ϴ�.
- ���� ����� ���� �������̽��� �������. 
*/
interface InterEx{
	
	static final int A = 100; // ���.
	
	// �߻�޼���
	abstract int getA(); // abstract ������ ���� ����.
}

public class InterfaceEx implements InterEx{ 
	@Override
	public int getA(){
		return A;
	}
	public static void main(String[] args){
		InterfaceEx if1 = new InterfaceEx(); // ��ü ����.
		System.out.println("getA() : " + if1.getA());
	}
}
