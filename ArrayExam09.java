import java.io.*;
public class ArrayExam09{
	public static void main(String[] ar)throws IOException{
		/*
			9. ������ �Է¹޾Ƽ� 1 ~ �������� ����� ���ϴ� ���α׷��� �ۼ��ϼ���.
			����� ����� �������� ���� ���մϴ�. (�� 9�� ����� 1, 3, 9)
			������ : java ExamEx09 52
			������ : 1 2 4 13 26 52
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(ar[0]);
		
		System.out.print(num + "�� ��� : ");
		for(int i = 1; i <= num; i++){
			if(num % i == 0)
				System.out.print(i + " ");
		}
		System.out.println();
	}
}