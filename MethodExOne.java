class MethodEx{
	// ��� ���� ����.

	// ������ ����

	// �޼���
	public int sum(int i, int j){
		return i + j;
	}
	public int sub(int i, int j){
		return i - j;
	}
	public int multi(int i, int j){
		return i * j;
	}
	public int divi(int i, int j){
		return i / j;
	}
}

public class MethodExOne{
  	public static void main(String[] args) {
		MethodEx ref = new MethodEx(); // ��ü ����.
		int i = 10;
		int j = 10;
		System.out.println("���� �� : " + ref.sum(i,j));
		System.out.println("�A �� : " + ref.sub(i,j));
		System.out.println("���� �� : " + ref.multi(i,j));
		System.out.println("���� �� : " + ref.divi(i,j));
	}
}
