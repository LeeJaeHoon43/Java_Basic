public class StringBufferExOne {
	public static void main(String[] args) {
		/*
		* StringBuffer Ŭ����.
		- ���������� ���� ������ ������ Ŭ����.
		- ���ڿ��� ������ ���� ���Ǵ� ��ü�ϼ��� �� Ŭ������ ����Ѵ�.
		
		* ����.
		- �����͸� �� ������ �ٸ� �� ������ �����ϴ� ���� �Ͻ������� �� �����͸� �����ϴ� �޸� �����̴�.
		- ���۸��̶� ���۸� Ȱ���ϴ� ��� �Ǵ� ���۸� ä��� ������ ���Ѵ�.
		
		* StringBuffer �޼���.
		- capacity() : ���� �뷮(������ ����)�� ing������ ��ȯ�Ѵ�.
		- append(String str) : ���� StringBuffer ��ü�� ���ڷ� ���޵� str�� ������.
		- delete(int start, int end) : ���۰� �� �ε��� ������ ���ڿ��� �����Ѵ�.
		- insert(int offset, String str) : ���ϴ� �ε����� ���ڿ��� �����Ѵ�.
		- replace(int start, int end, String str) : ���� �ε����� �� �ε��� ������ ���ڿ��� �ٸ� ���ڿ��� ��ȯ�Ѵ�.
		- setLength(int newLength) : �� ���̸�ŭ ���ڿ��� ���̸� �ٽ� �����Ѵ�.
		- toString() : StringBuffer��ü�� ������ �ִ� ���ڿ��� String������ ��ȯ�Ѵ�.
		*/
		StringBuffer sb = new StringBuffer("JAVA");
		sb.append("1.6");
		System.out.println(sb); // JAVA1.6
		sb.delete(3,5); 
		System.out.println(sb); // JAV.6
		sb.insert(3,"A1");
		System.out.println(sb); // JAVA1.6
		sb.replace(4,7,"������");
		System.out.println(sb); // JAVA������
		sb.reverse();
		System.out.println(sb); // ������AVAJ
	}
}
