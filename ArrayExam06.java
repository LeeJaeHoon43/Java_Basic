import java.io.*;
public class ArrayExam06{
	public static void main(String[] ar)throws IOException{
		/*
		�̸�(name), ����(kor), ����(eng), ����(mat) ������ �Է¹޾Ƽ� ����(tot), ���(avg)�� ���ϴ� ���α׷��� �ۼ��ϼ���.
		�̶� ����� �Ҽ��� 3° �ڸ����� �ݿø��ؼ� �Ҽ����� 2° �ڸ����� ����Ѵ�.
		
		������ : java ExamEx05 ȫ�浿 100 100 96
		*** ȫ�浿 ����ǥ ***
		���� ���� ���� ���� ���
		100 100 95 296 98.67
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�̸� : ");
		String name = br.readLine();

		// ����
		String[] subject = new String[ar.length-1];
		for (int i = 0; i < subject.length ; i++){
			subject[i] = ar[i+1];
		}

		// ���� ���� �Է¹ޱ�
		int[] jumsu = new int[subject.length+1];
		for(int i = 0; i < subject.length; i++){
			System.out.print(subject[i] + " ���� ���� : ");
			jumsu[i] = Integer.parseInt(br.readLine());
			jumsu[jumsu.length-1] += jumsu[i]; // ���� ���.
		}

		// ��� ���ϱ�.
		float avg = jumsu[jumsu.length-1] / (float)subject.length;
		avg = (int)((avg + 0.005) * 100) / 100.f;

		System.out.println();
		System.out.println("********* " + name + " ����ǥ *********");
		for (int i = 0; i < subject.length ; i++ ){
			System.out.print(subject[i] + "\t");
		}
		System.out.println("����\t���");
		for (int j = 0; j < jumsu.length; j++){
			System.out.print(jumsu[j] + "\t");
		}
		System.out.println(avg + "\t");
	}
}