public class OperEx2{
	public static void main(String[] args) {
		short a, b;
		a = b = 10; // a = 10; b = 10;
		short c = (short)(a + b);
		// �ڹٿ����� ����(byte, short, int)���� ��Ģ������ ����� 
		// �ݵ�� ����(int)�� ���´�
		// byte b = 127; b++; b = b+1;
		System.out.println("c�� �� : " + c);
	}
}