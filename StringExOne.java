public class StringExOne {
	public static void main(String[] args) {
		/*
		# String Ŭ����.
		- ���ڿ��� �ǹ��ϴ� Ŭ����.
		- ���� ���� ���̴� Ŭ���� ���� �ϳ�.
		- ��ü �ڷ��������� �⺻ �ڷ���ó�� ����Ѵ�.
		
		 * String Ŭ���� ������.
		 -String() : ��� �ִ� 	���ڿ� ��ü�� �����ϰ� �ʱ�ȭ.
		 -String(char[] value) : ������ char�迭 value�� ������ ���������� �����Ͽ� ���ο� ���ڿ��� ����.
		 -String(String original) : String���� original�� ���ڿ��� ���Ӱ� ������ ���ڿ� ��ü�� �ʱ�ȭ.
		 
		 * ��ü ������
		 1. �Ͻ��� ��ü ���� : String s1 = "Test";
		 2. ����� ��ü ���� : String s2 = new String("Test");
		 
		 - ==�����ڴ� ��ü�� �ּҰ��� ���Ѵ�.
		 - ��ü�� �� �񱳴� .equals()�޼��带 �̿��Ѵ�.
		*/
		String s1 = "Twinkle";
		String s2 = "Twinkle";
		if(s1 == s2) // s1.equals(s2)
			System.out.println("s1�� s2�� ����.");
		else
			System.out.println("s1�� s2�� ���� �ʴ�.");
		String s3 = new String("Little Star");
		String s4 = new String("Little Star");
		if(s3 == s4) // s3.equals(s4)
			System.out.println("s1�� s2�� ����.");
		else
			System.out.println("s1�� s2�� ���� �ʴ�.");
	}
}