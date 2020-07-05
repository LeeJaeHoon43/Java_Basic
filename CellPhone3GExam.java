import java.io.*;

class CellPhone1 {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void call(String number)throws IOException{
		System.out.println(number + "�� ���� ��ȭ�� �մϴ�.");
	}

}
class Phone3G extends CellPhone1{
	//���
	BufferedReader br;
	//������   
	public Phone3G(){
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	@Override
	public void call(String number)throws IOException{
		System.out.println("1. ���� ��ȭ");
		System.out.println("2. ���� ��ȭ");
		System.out.print("��ȭ ��� ���� : ");
		int choice = Integer.parseInt(br.readLine());
		if (choice == 1) {
			super.call(number);
		}else if (choice == 2) {
			System.out.println(number + "�� ���� ��ȭ�� �մϴ�.");
		}else {
			System.out.println("�޴� �Է� ���� : ��ȭ�� ����մϴ�.");
		}
	}
}
public class MyPhone2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.print("��ȭ�� �Ͻðڽ��ϱ�? (y/n) : ");
			String answer = br.readLine();
			
			if(answer.equals("N") || answer.equals("n")) {
				System.out.println("��ȭ�� �����մϴ�.");
				System.exit(0);
			}
			
			System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
			String phoneNumber = br.readLine();

			CellPhone1 phone = new Phone3G(); // ������ ��ü ����.
			phone.call(phoneNumber);
			
			try{
				Thread.sleep(3000); // ���α׷� 3�ʰ� ����.	
			}catch (InterruptedException ie){}
			
			System.out.println();
		}
	}
}