import java.io.*;
public class ArrayExam07{
	public static void main(String[] ar)throws IOException{
		/*
			3������ ������ �Է¹޾Ƽ� �հ����� ���հ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
			��, 3���� ������ ���� 40�̻��̾�� �ϰ�, 
			����� 60�̾�� "�հ�"�� ����ϰ�,
			����� 60�� ������ 1���� �����̶� 40 �̸��̸� "�������� ���հ�"�� ����ϸ�,
			����� 60�̸��̸� "���հ�"�� ����Ѵ�.
			���࿹�� 1 :
			������ : java ExamEx06 75 80 100
			��� = �հ�
			���࿹�� 2 :
			������ : java ExamEx06 95 80 38
			��� = �������� ���հ�
			���࿹�� 3 :
			������ : java ExamEx06 32 40 22
			��� = ���հ�
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tot = 0;
		int[] jumsu = new int[ar.length];
		for(int i = 0; i < jumsu.length ; i++){
			jumsu[i] = Integer.parseInt(ar[i]);
		}
	
		for(int i = 0; i < jumsu.length; i++){
			tot += jumsu[i];
		}

		int avg = 0;
		avg = tot / jumsu.length;

		if(avg > 60){ 
			if ((jumsu[0] > 40 ) && (jumsu[1] > 40) && (jumsu[2] > 40))
				System.out.println("��� = �հ�!!");		
			else
				System.out.println("��� = �������� ���հ�!!");
		}else	
			System.out.println("��� = ���հ�!!");
	}
}