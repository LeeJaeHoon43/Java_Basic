import java.io.*;
public class MemberManager {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		MyMember member = new MyMember();

		boolean On = true;

		while(On) {
			System.out.println("1. ȸ������");
			System.out.println("2. ȸ���˻�");
			System.out.println("3. ��������");
			System.out.println("4. ȸ��Ż��");
			System.out.println("5. ��ü���");
			System.out.println("0. ���α׷� ����");
			System.out.print("�޴� ���� : ");
			int menu = Integer.parseInt(br.readLine());

			switch(menu) {
			case 0:
				System.out.print("������ �����Ͻðڽ��ϱ�? (y/n) : ");
				String answer = br.readLine();
				if(answer.equals("y") || answer.equals("Y")) {
					System.out.println("���α׷��� �����մϴ�.");
					On = false;
				}else if(answer.equals("n") || answer.equals("N")){
					continue;
				}else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					System.out.println();
				}
				break;
			case 1:
				member.Join();
				break;
			case 2:
				if (member.JoinOk()) {
					member.Search();
				}else {
					System.out.println("ȸ�������� ȸ���� �����ϴ�.");
					System.out.println();
					continue;
				}
				break;
			case 3:
				if (member.JoinOk()) {
					if(member.search == true) {
						member.Update();	
					}else {
						System.out.println("�˻��� ���� �����ϼž� �մϴ�.");
						System.out.println();
						break;
					}
				}else {
					System.out.println("ȸ�������� ȸ���� �����ϴ�.");
					System.out.println();
					continue;
				}
				break;
			case 4:
				if (member.JoinOk()) {
					if (member.search == true){
						member.Delete();
					}else {
						System.out.println("�˻��� ���� �����ϼž� �մϴ�.");
						System.out.println();
						break;
					}
				}else {
					System.out.println("ȸ�������� ȸ���� �����ϴ�.");
					System.out.println();
					continue;
				}
				break;
			case 5:
				if (member.JoinOk()) {
					member.MemberList();
				}else {
					System.out.println("ȸ�������� ȸ���� �����ϴ�.");
					System.out.println();
					continue;
				}
				break;
			default:
				System.out.println("�޴� ���� ��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
				System.out.println();
				break;
			}
		}
	}
}