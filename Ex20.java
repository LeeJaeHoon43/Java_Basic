import java.io.*;
public class Ex20{
	public static void main(String[] args)throws IOException{
		/*
		20. �غ��� ���̸� �Է¹޾Ƽ� �ﰢ���� ���̸� ���ϴ� ���α׷��� �ۼ��ϼ���.
			�ﰢ���� ���̸� ���ϴ� ������ [���� = �غ� * ���� / 2] �̴�.
		[����]	   
		�غ� = 5	
	    ���� = 7
	    �ﰢ�� ���� = 17.5
		*/

		int a;
		int b;
		float c;
		System.out.print("�غ� : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		a = Integer.parseInt(br.readLine());
		System.out.print("���� : ");
		b = Integer.parseInt(br.readLine());
		
		c = (float)(a * b) / 2;
		c = ((int)(c * 10.0))/(float)10.0;
		System.out.println("�ﰢ�� ���� : " + c);
	}
}
