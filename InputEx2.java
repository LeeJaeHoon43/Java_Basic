import java.io.*;
public class InputEx2{
	public static void main(String[] ar)throws IOException{
		int num1;
		int num2;
		System.out.print("���� 1 : ");
		num1 = System.in.read() -48; // �ƽ�Ű�ڵ尡 �ƴ� ���� ���� �ϳ� �Է¹ޱ� : System.in.read() - 48 or '0';
		System.in.read(); // Enter�� ó�� : \ró��.
		System.in.read(); // Enter�� ó�� : \nó��.
		System.out.print("���� 2 : ");
		num2 = System.in.read() -'0';  // �ƽ�Ű�ڵ尡 �ƴ� ���� ���� �ϳ� �Է¹ޱ� : System.in.read() - 48 or '0';
		System.out.println("����" + (num1 > num2 ? num1 : num2) + "�� �� ũ�׿�.");
	}
}