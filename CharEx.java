public class CharEx{
	public static void main(String[] ar){
		char ch1 = 'A';
		char ch2 = '\u0041'; 
		/*
		- ���α׷��� ���ʿ��� ����������, ������ �Ʒ��� �����Ѵ�.
		- ����(char)�� ����� ��� ����� ������ ���� ��¥ ����� �����Ѵ�.
		- ����â�� �⺻������ �ƽ�Ű�ڵ带 ����ϹǷ� 127�� �Ѿ�� ?�� ���´�.
		*/
		System.out.println("ch1 + ch2 = " + ch1 + ch2);
		System.out.println("ch1 + ch2 = " + (ch1 + ch2)); 
		System.out.println("ch1 + ch2 = " + (char)(ch1 + ch2));
	}	
}