import java.io.*;
public class Ex22{
	public static void main(String[] args)throws IOException{
		/*
		22. �ݾ��� �Է¹޾Ƽ� ȭ���� ������ ���ϴ� �Ʒ��� ���� ���α׷��� �ۼ��ϼ���.
		��! �ݾ��� 10�� �̻� 10���� �̸��� �ݾ׸� �Է��Ѵ�.

	   [����]
	   �ݾ� = 57620
	   ���� = 5��
	   õ�� = 7��
	   ��� = 6��
	   �ʿ� = 2��
	   */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�ݾ� = ");
		int money = Integer.parseInt(br.readLine());
		
		System.out.println("���� = " +(money / 10000)+ "��");
		System.out.println("õ�� = " +((money % 10000) / 1000)+ "��");
		System.out.println("��� = " +((money % 1000) / 100)+ "��");
		System.out.println("�ʿ� = " +((money % 100) / 10)+ "��");

		/*
		# 1��° ���.
		int tent;
		int thousand;
		int hund;
		int ten;
		int money;
		System.out.print("�ݾ� : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		money = Integer.parseInt(br.readLine());

		tent = money/10000;
		money %= 10000;
		thousand = money/1000;
		money %= 1000;
		hund  = money/100;
		money %= 100;
		ten = money/10;

		System.out.println("���� = " + tent + "��");
		System.out.println("õ�� = " + thousand + "��");
		System.out.println("��� = " + hund + "��");
		System.out.println("�ʿ� = " + ten + "��");

		# 2��° ���.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�ݾ� = ");
		int money = Integer.parseInt(br.readLine());

		System.out.println("���� = " + (money / 10000) + "��");
		System.out.println("õ�� = " + ((money % 10000) / 1000) + "��");
		System.out.println("��� = " + (((money % 10000) % 1000) / 100) + "��");
		System.out.println("�ʿ� = " + ((((money % 10000) % 1000) % 100) / 10) + "��");

		# 3��° ���.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�ݾ� = "); 
		String sMoney = br.readLine(); 
		
		String man = sMoney.substring(0,1);
		String chon = sMoney.substring(1,2);
		String baek = sMoney.substring(2,3);
		String sip = sMoney.substring(3,4);

		System.out.println("���� = "  + man + "��");
		System.out.println("õ�� = "  + chon + "��");
		System.out.println("��� = "  + baek + "��");
		System.out.println("�ʿ� = "  + sip + "��");
		*/
	}
}
