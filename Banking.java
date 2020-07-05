import java.io.*;
public class Banking{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		NewAccount na = new NewAccount("ȫ�浿", "1111");

		String strWork = null;
		System.out.print("��й�ȣ : ");
		strWork = br.readLine();
		if(!na.passCheck(strWork)){ // ��й�ȣ�� ���� ������,
			System.out.println("��й�ȣ ����");
			System.exit(0);
		}

		do{
			System.out.println("\n\n�۾� ������ �����ϼ���.");
			System.out.println("=====================================");
			System.out.println("1. �Ա�");
			System.out.println("2. ���");
			System.out.println("3. �ܰ� Ȯ��");
			System.out.println("4. ��й�ȣ ����");
			System.out.println("0. ����");
			System.out.println("=====================================");	
			System.out.print("�۾� ������ �����ϼ��� : ");
			strWork = br.readLine();

			int switchInt = 0;
			if(strWork != null){
				switchInt = Integer.parseInt(strWork);
			}else{
				System.out.println("�۾� ������ �Է����� �ʾҽ��ϴ�.");
				System.exit(0);
			}

			switch(switchInt){
				case 0:  break;
				case 1:
					System.out.println("\n=====================================");
					System.out.print("�ݾ��� �Է��ϼ��� : ");
					String strdepositIn = br.readLine();
					long depositLong = Long.parseLong(strdepositIn);
					na.deposit(depositLong);
					System.out.println(depositLong + "���� �ԱݵǾ����ϴ�.");
					break;
				case 2:
					System.out.println("\n=====================================");
					System.out.print("�ݾ��� �Է��ϼ��� : ");
					String withdrawIn = br.readLine();
					long withdrawLong = Long.parseLong(withdrawIn);
					na.withdraw(withdrawLong);
					System.out.println(withdrawLong + "���� ��ݵǾ����ϴ�.");
					break;
				case 3:
					System.out.println("\n=====================================");
					System.out.println(na.getName() + "���� �ܰ�� " + na.getBalance() + "���̰�, ��й�ȣ�� "+na.getPass() + "�Դϴ�.");
					break;
				case 4:
					System.out.print("������ ��й�ȣ�� �Է��ϼ��� : ");
					String temp = br.readLine();
					na.setPass(temp);
					System.out.println("��й�ȣ�� ���������� ����Ǿ����ϴ�.");
					break;
				default:
					System.out.print("0 ~ 4 ���� ���� �Է�\n");
					break;
			}
		}while(!strWork.equals("0"));
	}
}
