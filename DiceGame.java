import java.io.*;
public class DiceGame{
	public static void main(String[] ar)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rn; // ���� ����. (1 ~ 6)
		int num; // �޴� ��ȣ.
		char ans; // ���.
		int coin = 1000; // ���� �Ӵ�.
		int batting = 0; // ���� �ݾ�.
		boolean status = false;

		while(true){
			System.out.println("*** �ֻ��� ���� ***");
			System.out.println("���!! ����ģ ������ �Ļ��� �ҷ��ɴϴ�.");
			System.out.println("1. Ȧ��");
			System.out.println("2. ¦��");
			System.out.println("0. ���� ����");
			System.out.print("���� ���� ���� : ");
			num = System.in.read() - 48;
			System.in.read();System.in.read();

			if (num != 1 && num != 0 && num != 2){
				System.out.println("0~2�� �޴��� ���� ��ȣ�� �Է��ϼ���");
				continue;
			}

			if (coin <= 0){
				System.out.println("�Ļ��Դϴ�.");
				System.exit(0);
			}

			switch(num){
			case 2:
				rn = (int)(Math.random()*6)+1;
				System.out.print("���� �ݾ��� �Է��ϼ��� : ");
				batting = Integer.parseInt(br.readLine());
				if (batting > coin){
					System.out.println("�ܾ��� �����մϴ�. ���� �ܾ׸�ŭ�� ������ �̷�������ϴ�.");
					System.out.println("���� �ܾ� : " + coin + "���� ���õǾ����ϴ�.");
					batting = coin;
				}
				System.out.println("�ֻ����� �������� Enter�� ġ����.");
				System.out.print("�ֻ����� �������ϴ�.");
				System.out.println();
				System.in.read();System.in.read(); // Enter�� ó��.
				if(rn % 2 == 0){
					System.out.println("�ֻ��� �� : " + rn);
					System.out.println("You Win!!");
					coin += batting;
					System.out.println("�ܾ� : " + coin);
					System.out.println();
					continue;
				}else{
					System.out.println("�ֻ��� �� : " + rn);
					System.out.println("You Loose!!");
					coin -= batting;
					System.out.println("�ܾ� : " + coin);
					System.out.println();
					continue;
				}
			case 1: 
				rn = (int)(Math.random()*6)+1;
				System.out.print("���� �ݾ��� �Է��ϼ��� : ");
				batting = Integer.parseInt(br.readLine());
				if (batting > coin){
					System.out.println("�ܾ��� �����մϴ�. ���� �ܾ׸�ŭ�� ������ �̷�������ϴ�.");
					System.out.println("���� �ܾ� : " + coin + "���� ���õǾ����ϴ�.");
					batting = coin;
				}
				System.out.println("�ֻ����� �������� Enter�� ġ����.");
				System.out.print("�ֻ����� �������ϴ�.");
				System.in.read();System.in.read(); // Enter�� ó��.
				System.out.println();
				if(rn % 2 == 1){
					System.out.println("�ֻ��� �� : " + rn);
					System.out.println("You Win!!");
					coin += batting;
					System.out.println("�ܾ� : " + coin);
					System.out.println();
					continue;
				}else{
					System.out.println("�ֻ��� �� : " + rn);
					System.out.println("You Loose!!");
					coin -= batting;
					System.out.println("�ܾ� : " + coin);
					System.out.println();
					continue;
				}
			case 0:
				System.out.print("������ �����Ͻðڽ��ϱ�?? (y/n) : ");
				ans = (char)System.in.read();
				System.in.read();System.in.read();
				if(ans == 'y' || ans == 'Y'){
					System.out.println();
					System.out.println("������ �����մϴ�.");
					System.exit(0);
				} else if(ans == 'n' || ans == 'N'){
					continue;
				} else {
					System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
					System.out.println();
					continue;
				}
			}
		}
	}
}
