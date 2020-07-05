/**
	����ǥ�� �ۼ� : 1�� ���� ����ǥ�� �ۼ�.
	��, ������ ������� ���� �������� �ο��Ѵ�.
*/
import java.io.*;
public class ArrayEx2{
	public static void main(String[] ar)throws IOException{
		
		/*
		for(String input : ar){
			System.out.println(input);
		} 

		if(ar.length == 0){
			System.out.println("Usage : java ArrayEx2 subject1 subject2 ...");
			System.exit(0);
		} // ar.length == ����� ar's value = �����.
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�̸� : ");
		String name = br.readLine();

		// ����� �Է¹ޱ�.
		String[] subject = new String[ar.length-1]; // ����� = ar.length - 1 = subject.length
		for(int i = 0; i < subject.length; i++){ // ������� �� �Ű� �Դ�.
			subject[i] = ar[i+1];
		} // subject = ar; subject.length => �����...

		// ���� ���� �Է¹ޱ�.
		int jumsu[] = new int[subject.length+1]; // +1�� ������ ������ ������ ����.
		for(int i = 0; i < subject.length; i++){ 
			System.out.print(subject[i] + "���� ���� : ");
			jumsu[i] = Integer.parseInt(br.readLine());
			jumsu[jumsu.length-1] += jumsu[i]; // ���� ���.
		}

		// ��� ���ϱ�.
		float avg = jumsu[jumsu.length-1] / (float)subject.length; // jumsu[�� ������ �ε��� == ����] / subject �迭(���� ��)�� ũ��.
		avg = (int)((avg+0.005)*100)/100.f; // �Ҽ��� 3¥������ �ݿø�.

		// ���� ���ϱ�.
		char grade = 0;
		switch((int)avg/10){
			case 10:
			case 9: grade = 'A'; break;
			case 8: grade = 'B'; break;
			case 7: grade = 'C'; break;
			case 6: grade = 'D'; break;
			default : grade = 'F'; break;
		}
		System.out.println();
		System.out.println("************************** ����ǥ ********************************");
		System.out.print("�̸�\t");
		for (int i = 0; i<subject.length; i++){
			System.out.print(subject[i] + "\t");
		}
		System.out.println("����\t���\t����");
		System.out.println("******************************************************************");
		System.out.print(name+"\t");
		for (int i = 0; i < jumsu.length; i++){
			System.out.print(jumsu[i] + "\t");
		}
		System.out.println(avg + "\t" +grade);
		System.out.println("******************************************************************");
	}
}