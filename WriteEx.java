public class WriteEx{
	public static void main(String[] ar){
		System.out.write(65); // write�� byte���� �ڷḦ ����Ѵ�.
		// �迭�� �ƴ� ���� ����� ���� flush()�� ���� ����ؾ� �Ѵ�.
		// write(byte b); write(byte[] b);
		// write(byte[] b, int start, int length);
		System.out.flush(); // ���ۿ� �ִ� ���� ���.
		System.out.println();
		byte[] by = {'J','A','V','A'};
		System.out.write(by, 0, 4);
		// ����Ʈ �迭 ����� ��쿡�� �����÷��� ����� �ִ�.
		System.out.println();
		// write�� ��� ����Ʈ �������� �����͸� �����ϱ� ������ �ַ� ��Ʈ��ũ���� ���� ����.
	}
}
