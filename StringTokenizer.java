public class StringTokenizer{
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("1234567890");
		// �⺻ buffer �뷮 16�� �Է��� ���ڿ���ŭ ���� 16 + 10 = 26�̵�.
		System.out.println("sb�� buffer�뷮��? : " + sb.capacity()); // 26
		System.out.println("sb�� ���ڿ��� ���̴�? : " + sb.length()); // 10
		sb.append("ABCDEFGHIJKLMNOPQ");
		// ������ buffer�뷮�� 26�� 2�� ���ϰ� �ٽ� ���� : 26 + (26 + 2) =54
		System.out.println("sb�� buffer�뷮��? : " + sb.capacity()); // 54 
		System.out.println("sb�� ���ڿ��� ���̴�? : " + sb.length()); // 27
		sb.delete(1,20);
		// buffer�� �뷮�� �پ���� ����.
		System.out.println("sb�� buffer �뷮��? : " + sb.capacity()); // 54
		System.out.println("sb�� ���ڿ��� ���̴�? : " + sb.length()); // 8
	}
}