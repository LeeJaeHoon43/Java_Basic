import java.io.*;
public class Ex11{
	public static void main(String[] args)throws IOException{
		/*
			11. �������� �������� ���������� �Է¹޾� ���� ��� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
			(�� ����� �Ҽ��� 3��° �ڸ����� �ݿø��ؼ� �Ҽ��� 2°�ڸ� ���� ǥ���Ѵ�)
			�̸� = ȫ�浿
			�������� = 99
			�������� = 88
			�������� = 79
			�̸� ���� ���� ���� ���� ��� ����
			ȫ�浿 99 88 79 266 86.67 B
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // �Է� 3�ܰ�
		System.out.print("�̸� : ");
		String name = br.readLine();
		System.out.print("���� ���� : ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("���� ���� : ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("���� ���� : ");
		int math = Integer.parseInt(br.readLine());

		int tot = kor + eng + math;

		float avg = tot/3.f;
		avg = (int)((avg+0.005)*100) / 100.f; 

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

		System.out.print("�̸�\t����\t����\t����\t����\t���\t����\n");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg+"\t"+grade);
	}
}