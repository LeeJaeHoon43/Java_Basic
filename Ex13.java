import java.io.*;
public class Ex13{
	public static void main(String[] args)throws IOException{
	/*
	13. 1 ~ 200������ ������ �߻��Ͽ� �����͸� �Է¹޾Ƽ� �߻��� ���ڸ� ���ߴ� ���α׷��� �Ʒ��� ���� �ۼ��� ������. 
		�� 10ȸ�� ��ȸ�� �����ϰ� 10ȸ�ȿ� ������ ���� ��� Ʋ�� ������ �����Ͽ� ������ �����ϰ� ��� ������ �������� ������ �Ѵ�.
		** 1 ~ 200 ������ ������ �߻��Ͽ����ϴ�. **
		** ���߾� ������. ** (���� ��� �߻��� ���ڰ� 80�̶�� �����ϸ�)
		������ �Է� : 50
		��ǻ�� �߻��� ���ڰ� �� Ů�ϴ�.
		������ �Է� : 100
		��ǻ�� �߻��� ���ڰ� �� �۽��ϴ�.
		// �̷��� 10ȸ�� ��ȸ�� �����Ѵ�.
		������ �Է� : 80
		�����Դϴ�. XX���� �� ���߼̽��ϴ�.
		// ���� 10ȸ �ȿ� �� ���� ��� �����Ͽ��ٴ� �޽����� ����ϰ�
		// �Ʒ�ó�� ��� ������ ������ ���θ� �����.
		����Ͻðڽ��ϱ�? (y/n) : n
		//���� ���⼭ y�� �Է��ϸ� �ٽ� ������ �����Ѵ�.
		���α׷��� �����մϴ�.
	*/
		int count = 0;
		while(true){
			System.out.println("*** 1 ~ 200 ������ ������ �߻��Ͽ����ϴ�. ***");
			System.out.println("*** ���߾� ������. ***");
			int rn = ((int)(Math.random() * 200) + 1);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			for(int c = 1; c <= 10; c++){
				System.out.print("���� �Է� : ");
				int myInput = Integer.parseInt(br.readLine());

				if(myInput < 1 || myInput > 200){
					System.out.println("1 ~ 200������ ������ �Է��Ͻÿ�.");
					continue;
				}

				if(rn > myInput){
					System.out.println("��ǻ�Ͱ� �߻���Ų ���ڰ� �� Ů�ϴ�.");
					count++;
					continue;
				}else if(rn < myInput){
					System.out.println("��ǻ�Ͱ� �߻���Ų ���ڰ� �� �۽��ϴ�.");
					count++;
					continue;
				} else if(rn == myInput){
					System.out.println("�����Դϴ�."+c+"������ ���߼̽��ϴ�.");
					System.out.print("����Ͻðڽ��ϱ�? (y/n) : ");
					char gono = (char)System.in.read();
					System.in.read();System.in.read();
					if(gono == 'y'){
						break;
					}else if(gono =='n'){
						System.out.println("���α׷��� �����մϴ�");
						System.exit(0);
					}else{
						System.out.println("�߸� �Է��Ͽ����ϴ�.");
					}
				}
			}
			System.out.print("����Ͻðڽ��ϱ�? (y/n) : ");
			char gono = (char)System.in.read();
			System.in.read();System.in.read();
			if(gono == 'y'){
				continue;
			}else if(gono =='n'){
				System.out.println("���α׷��� �����մϴ�");
				System.exit(0);
			}else{
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
			}
		}
	}
}