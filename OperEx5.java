public class OperEx5{
	public static void main(String[] args) {
		boolean a;
		boolean b;
		if((a = 4 > 3) | (b = 5 > 7)){
			System.out.println("a = " + a);
			System.out.println("b = " + b);
		}
		// short circuit : &&�� ��� false���, ||�� ��� true���, ���� �ӵ��� ������.
		// &, | ����ϸ� �� ���� �� ��� ��� ���� �ӵ��� ������.
		// �׷��� |�� ��ġ�� a = true, b = fasle ���.
	}
}