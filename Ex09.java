import java.io.*;
public class Ex09{
	public static void main(String[] args)throws IOException{

		/*
		9.  �Ʒ��� ���� ���۵Ǵ� �� �ڸ� ���� ���α׷��� �ۼ��� ������.
			��, ��Ģ���길 �����ϸ� �Է��� �ݵ�� 0~9������ ���ڸ� �ִ´�. (System.in.read()�� �̿��� ��)
			���� 1 = 5
			������ = +
			���� 2 = 7
			������ : 12
		*/

		System.out.print("���� 1 : ");
		int num1 = System.in.read() - 48;

		System.in.read();System.in.read();
		System.out.print("������ : ");
		char cal = (char)System.in.read();
		System.in.read();System.in.read();
		System.out.print("���� 2 : ");
		int num2 = System.in.read() - 48;
		System.in.read();System.in.read();

		switch(cal){
			case '+':
				System.out.println("���� ��� : " + (num1 + num2));
				break;
			case '-':
				System.out.println("���� ��� : " + (num1 - num2));
				break;
			case '*':
				System.out.println("���� ��� : " + (num1 * num2));
				break;
			case '/':
				System.out.println("���� ��� : " + (num1 / num2));
				break;
			case '%':
				System.out.println("���� ��� : " + (num1 % num2));
				break;
			default:
				System.out.println("��Ģ ���� ��ȣ�� �Է��ϼ���.");
				System.exit(0);
		}
	}
}