import java.io.*;
public class Ex17{
	public static void main(String[] args)throws IOException{
		/*
		17. �� �ڸ� ���� 2���� �Է¹޾Ƽ� �� �� �� ������ �������� �������� ���ϴ� ���α׷��� �ۼ��ϼ���. (System.in.read()�� �̿��� ��)
	
		[����]
		����1 = 9
        ����2 = 2
        �� ������ ���� 11 �̰� ���� 7 �̸� 
        ���� 18 ���� ���� 4 �̰� �������� �������� 1�Դϴ�.
		*/

		System.out.print("���� 1 : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("���� 2 : ");
		int num2 = Integer.parseInt(br.readLine());
		System.out.println("�� ������ ���� " + (num1+num2)+ "�̰�, ���� " + (num1-num2) + "�̸�\n\r���� " + (num1*num2) + "���� ���� " + (num1/num2)+"�̰� �������� " + (num1%num2)+"�Դϴ�.");

	}
}