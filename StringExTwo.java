public class StringExTwo {
	public static void main(String[] args) {
		String str = new String();
		str += "Hello";
		str += " Java";
		System.out.println("str�� ���� : " + str);
		System.gc(); // ������ �÷����� �����Ѵ�. �޸� ����.
		/*
		* String ��ü�� �Һ���
		- String ��ü�� �������� �ʴ´�.
		- ������ String ��ü�� ���ο� String���� ���ϸ� ������ ��ü�� �����Ǵ� ���� �ƴϰ�, ���ο� ��ü�� �����ϰ� �ȴ�.
		- �� �ڵ忡�� String ��ü str�� �ϳ��� ��ü�� ��������, �����δ� 5���� String ��ü�� ������ ���̴�.
		
		* String ���� �޼���.
		- String str = "java";
		- char ch = str.charAt(int); // int�� 2���, ch = 'v';��� �ǹ�.
		- int I = str.length(); // i = 4
		- String so = str.toLowerCase(); // �ҹ��� ��ȯ.
		- String SO = str.toUpperCase(); // �빮�� ��ȯ.
		- String imsi = String.valueOf(��ġ); // ���ڸ� ���ڿ��� ��ȯ.
		- String imsi = str.trim(); // �����̳� ȭ��Ʈ �ڵ带 ����. �� ���ڿ� ���̿� �ִ� ������ ���� �Ұ�.
		- String imsi = str.substring(1, 3); // ���ڿ����� 1���� 3������ �ش�Ǵ� ���ڿ� ����.
		- indexOf(), lastIndexOf()...���.
		
		*/
	}
}
