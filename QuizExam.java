/**
   ������ �����ϸ� �ϴ� ���ӸӴϸ� 1000���� �ݴϴ�.
   �׸��� �Ʒ��� ���� �����մϴ�.

   1. �ָ�
   2. ����
   3. ���ڱ�
   0. ��������
   ����� ���� : ?

   ���ñݾ� : ???

   ����� ������ Enter�� ġ����^^.

   You : �ָ�      Computer : ����
   You Win !!!
   �ܾ� : ???
*/
import java.io.*;
public class QuizExam{
	public static void main(String[] ar)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int money = 1000;
		int rn = 0;
		int num = 0;
		int batting = 0;
		int computer = 0;
		String myFick = "";
		String comFick = "";

		while(true){
			System.out.println("*** ���ڰ� �Բ� �ϴ� ���������� ����***");
			System.out.println("1 : ����");
			System.out.println("2 : ����");
			System.out.println("3 : ���ڱ�");
			System.out.println("0 : ���� ����");
			System.out.print("����� ������ : ");
			num = System.in.read() - 48;
			System.in.read();System.in.read();

			switch(num){
			case 1:
				myFick = "����";
				System.out.println("������ �����ϼ̽��ϴ�.");
				System.out.print("���� �ݾ� : ");
				batting = Integer.parseInt(br.readLine());
				if (batting > money){
					System.out.println("�ܾ��� �����մϴ�. ���� �ܾ׸�ŭ�� ������ �̷�������ϴ�.");
					System.out.println("���� �ܾ� : " + money + "���� ���õǾ����ϴ�.");
					batting = money;
				}

				computer = (int)(Math.random() * 3) + 1;
				if(computer == 1){
					comFick = "����";
				}else if(computer == 2){
					comFick = "����";
				}else if(computer == 3){
					comFick = "���ڱ�";
				}

				System.out.print("����� ������ Enter�� ġ����.");
				System.in.read();System.in.read(); // Enter�� ó��.
				if(myFick == comFick){
					System.out.println("====���� ���===============================");
					System.out.println("User\t\tComputer");
					System.out.println(myFick + "\t\t" + comFick);
					System.out.println("���º��Դϴ�.");
					System.out.println("�ܾ� : " + money);
					System.out.println("============================================");
					continue;
				} else if (computer == 2){
					System.out.println("====���� ���===============================");
					System.out.println("User\t\tComputer");
					System.out.println(myFick + "\t\t" + comFick);
					System.out.println("Computer Win!!");
					System.out.println("�ܾ� : " + money);
					System.out.println("============================================");
					continue;
				} else{
					System.out.println("====���� ���===============================");
					System.out.println("User\t\tComputer");
					System.out.println(myFick + "\t\t" + comFick);
					System.out.println("User Win!!");
					money += batting;
					System.out.println("�ܾ� : " + money);
					System.out.println("============================================");
					continue;
				}

			case 2:
				myFick = "����";
				System.out.println("������ �����ϼ̽��ϴ�.");
				System.out.print("���� �ݾ� : ");
				batting = Integer.parseInt(br.readLine());
				if (batting > money){
					System.out.println("�ܾ��� �����մϴ�. ���� �ܾ׸�ŭ�� ������ �̷�������ϴ�.");
					System.out.println("���� �ܾ� : " + money + "���� ���õǾ����ϴ�.");
					batting = money;
				} 
				computer = (int)(Math.random() * 3) + 1;
				if(computer == 1){
					comFick = "����";
				}else if(computer == 2){
					comFick = "����";
				}else if(computer == 3){
					comFick = "���ڱ�";
				}

				System.out.print("����� ������ Enter�� ġ����.");
				System.in.read();System.in.read(); // Enter�� ó��.
				if (myFick == comFick){
					System.out.println("====���� ���===============================");
					System.out.println("User\t\tComputer");
					System.out.println(myFick + "\t\t" + comFick);
					System.out.println("���º��Դϴ�.");
					System.out.println("�ܾ� : " + money);
					System.out.println("============================================");
					continue;
				} else if (computer == 1){
					System.out.println("====���� ���===============================");
					System.out.println("User\t\tComputer");
					System.out.println(myFick + "\t\t" + comFick);
					System.out.println("User Win!!");
					money += batting;
					System.out.println("�ܾ� : " + money);
					System.out.println("============================================");
					continue;
				}else{
					System.out.println("====���� ���===============================");
					System.out.println("User\t\tComputer");
					System.out.println(myFick + "\t\t" + comFick);
					System.out.println("Computer Win!!");
					System.out.println("�ܾ� : " + money);
					System.out.println("============================================");
					continue;
				}
			case 3:
				myFick = "���ڱ�";
				System.out.println("���ڱ⸦ �����ϼ̽��ϴ�.");
				System.out.print("���� �ݾ� : ");
				batting = Integer.parseInt(br.readLine());
				if (batting > money){
					System.out.println("�ܾ��� �����մϴ�. ���� �ܾ׸�ŭ�� ������ �̷�������ϴ�.");
					System.out.println("���� �ܾ� : " + money + "���� ���õǾ����ϴ�.");
					batting = money;
				}

				computer = (int)(Math.random() * 3) + 1;
				if(computer == 1){
					comFick = "����";
				}else if(computer == 2){
					comFick = "����";
				}else if(computer == 3){
					comFick = "���ڱ�";
				}

				System.out.print("����� ������ Enter�� ġ����.");
				System.in.read();System.in.read(); // Enter�� ó��.
				if (myFick == comFick){
					System.out.println("====���� ���===============================");
					System.out.println("User\t\tComputer");
					System.out.println(myFick + "\t\t" + comFick);
					System.out.println("���º��Դϴ�.");
					System.out.println("�ܾ� : " + money);
					System.out.println("============================================");
					continue;
				} else if (computer == 1){
					System.out.println("====���� ���===============================");
					System.out.println("User\t\tComputer");
					System.out.println(myFick + "\t\t" + comFick);
					System.out.println("Computer Win!!");
					System.out.println("�ܾ� : " + money);
					System.out.println("============================================");
					continue;
				} else{
					System.out.println("====���� ���===============================");
					System.out.println("User\t\tComputer");
					System.out.println(myFick + "\t\t" + comFick);
					System.out.println("User Win!!");
					money += batting;
					System.out.println("�ܾ� : " + money);
					System.out.println("============================================");
					continue;
				}
			case 0:
				System.out.print("������ �����Ͻðڽ��ϱ�?? (y/n) : ");
				char ans = (char)System.in.read();
				System.in.read();System.in.read();
				if(ans == 'y' || ans == 'Y'){
					System.out.println("������ �����մϴ�.");
					System.exit(0);
				} else if(ans == 'n' || ans == 'N'){
					continue;
				} else {
					System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
					System.exit(0);
				}
			}
		}
	}
}