/**
	���α׷��� �����ϸ� �Ʒ��� ���� ����.
	�̸� : ȫ�浿
	���� : 99 
	���� : 88
	���� : 79
	
	���� ����� �Ʒ��� ���� ���.
	�̸�   ����   ����   ����   ����   ���		���� 
	ȫ�浿  99	88	   79   266   88.67		 B
	
	* ������ : ����� �Ҽ��� 3° �ڸ����� �ݿø��ؼ� �Ҽ��� ��° ¥������ ����Ѵ�. ��! printf()�� �̿����� �ʴ´�.

	* �ݿø��� ���� : �Ҽ��� ù ° �ڸ����� �ݿø��ؼ� ������ ǥ���ϴ� ���
	- 1.1  + 0.5 *1 (int) /1 -> 1 
	  1.6  + 0.5 *1 (int) /1 -> 2

	* �Ҽ��� �� ° �ڸ����� �ݿø��ؼ� �Ҽ��� ù° �ڸ����� ����ϴ� ���.
	  ������  +0.05  *10	(int)	/10
	- 1.11 + 0.05 = 1.16 *10 = 11.6 (int) /10 -> 1.1
	- 1.16 + 0.05 = 1.21 *10 = 12.1 (int) /10 -> 1.2

	* �Ҽ��� �� ° �ڸ����� �ݿø��ؼ� �Ҽ��� �Ѥ� �ڸ����� ����ϴ� ���.
	  ������	 +0.005  *100	(int)	/100
	- 1.111	  1.116	 111.6	 111	1.11
	- 1.116	  1.121	 112.6	 112	1.12
*/
import java.io.*; // �Է� 1�ܰ�
public class QuizEx01{
	public static void main(String[] ar)throws IOException{ // �Է� 2�ܰ�
		
		// ������ ���� �� �Է�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // �Է� 3�ܰ�
		System.out.print("�̸� : ");
		String name = br.readLine();
		System.out.print("���� ���� : ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("���� ���� : ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("���� ���� : ");
		int math = Integer.parseInt(br.readLine());

		// �����ϱ�.
		int tot = kor + eng + math;

		
		double avg = (double)((int)(((double)((double)tot/3)+0.005)*100))/100;
		// avg = (int)((avg+0.005)*100)/100.f; 

		char grade = 0;

		switch((int)(avg/10)){
			case 10:
			case 9:
				grade = 'A'; break;
			case 8:
				grade = 'B'; break;
			case 7:
				grade = 'C'; break;
			case 6:
				grade = 'D'; break;
			default:
				grade = 'F'; break;
		}

		// ȭ�鿡 ���.
		System.out.print("�̸�\t����\t����\t����\t����\t���\t����\n");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg+"\t"+grade);
	}
}