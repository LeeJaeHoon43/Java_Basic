import java.io.*;
public class Ex18{
	public static void main(String[] args)throws IOException{

		/*
		18. �������� �������� ���������� �Է¹޾� ��÷�� ����� ������ִ� ���α׷��� �ۼ��ϼ���.

		 [����]
	     �̸� = ȫ�浿
         �������� = 99
         �������� = 88
         �������� = 79
         ȫ�浿���� ������ 266���̰� ����� 86.67���Դϴ�.
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�̸� : ");
		String name = br.readLine();
		System.out.print("���� ���� : ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("���� ���� : ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("���� ���� : ");
		int math = Integer.parseInt(br.readLine());
		
		int tot = kor + eng + math;
		double avg = (double)((int)(((double)((double)tot/3)+0.005)*100))/100;

		System.out.println(name+"���� ������ "+tot+"���̰�, ����� "+avg+"�� �Դϴ�.");

	}
}
