import java.io.*;
public class Ex21{
	public static void main(String[] args)throws IOException{
		/*
		21. �ʸ� �Է¹޾Ƽ� ������ ����ϴ� ���α׷��� �Ʒ��� ���� �ۼ��� ������.

		[����]
		�ð�(����:��) = 250
	    250�ʴ� 4�� 10�� �Դϴ�.

	   */
	   	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�ð�(����:��) : ");
		int sec = Integer.parseInt(br.readLine());
		
		/*
		int min = 0;
		min = sec / 60;

		*/

		int min = (sec % 3600)/60; // �� = (�Է¹��� �� % 3600) / 60; (sec / 60)
		System.out.println(sec+"�ʴ� "+min+"�� "+(sec % 60)+"�� �Դϴ�.");
	}
}
