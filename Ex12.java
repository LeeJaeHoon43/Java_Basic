import java.io.*;
public class Ex12{
	public static void main(String[] args)throws IOException{
		/*
		12. 1 ~ 100������ ���� 2�� �߻��Ͽ� ���(a, b)�մϴ�.
		��(dap)�� �Է¹޾� �´��� Ʋ������ ����ϴ� ���α׷��� �ۼ��ϼ���. �� ������ 10��(score)ó���Ͽ� 10������ Ǳ�ϴ�.
		�Ʒ��� ����ó�� �����ϵ��� �ۼ��մϴ�.
		[1] 23 + 56 = 70
		Ʋ�Ƚ��ϴ�. ������ 79 �Դϴ�.
		[2] 13 + 45 = 58
		�����Դϴ�.
		// ���� ������� ����ؼ� 10ȸ���� �����մϴ�.
		[10] 10 + 25 = 35
		�����Դϴ�.
		����� ������ XX���Դϴ�.
		����Ͻðڽ��ϱ�? (y/n) : n //���� ���⼭ y�� �Է��ϸ� �ٽ� 10ȸ �ݺ��Ѵ�.
		���α׷��� �����մϴ�.
		*/
		int point = 0;
		while(true){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			for(int i = 1; i <= 10; i++){ 
				int num1 = ((int)(Math.random() * 100)+1); // 1 ~ 100������ ����. 
				int num2 = ((int)(Math.random() * 100)+1); // 1 ~ 100������ ����.
				System.out.print("["+ i +"] "+num1 + " + " + num2 + " = ");
				int dap = Integer.parseInt(br.readLine());
				
				if((num1 + num2) == dap){
					System.out.println("�����Դϴ�.");
					point += 10;
				}else{
					System.out.println("Ʋ�Ƚ��ϴ�. ������ " + (num1+num2) + "�Դϴ�.");
				}
				System.out.println();
			}
			System.out.println("����� ������ "+ point +"�Դϴ�.");
			System.out.print("����Ͻðڽ��ϱ�? (y/n) : ");
			char gono = (char)System.in.read();
			System.in.read();System.in.read();
			if(gono == 'y' || gono == 'Y'){
				point = 0;
				continue;
			}else if(gono =='n' || gono == 'N'){
				System.out.println("���α׷��� �����մϴ�");
				System.exit(0);
			}else{
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				System.exit(0);
			}
		}
	}
}
