import java.io.*;
public class ArrayEx4{
	public static void main(String[] ar)throws IOException{
		/*
			����ǥ �ۼ� - ���� �� ���� ����ǥ.
			��� ���� ���� �� ���ؼ� �������� �ο��Ѵ�.
			java ArrayEx4 3 ���� ���� ���� ����
			java ArrayEx4 ����� �����1 �����2 ... �����N
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int human = Integer.parseInt(ar[0]); // ��� �� ���ϱ�.
		String[] name = new String[human]; // ��� �� ��ŭ�� �̸��� ������ �迭 ����.
		String[] subject = new String[ar.length-1]; // ����� �ʱ�ȭ. ar�迭���� -1�� ũ��� ������� ���� �迭 ����.
		// ���� �� = ar.length-1 == subject.length.
		for(int i = 0; i < subject.length; i++){
			subject[i] = ar[i+1]; // ������� �Űܿ���.
		}

		// ������ ���� ó�� �迭�� ����..
		int[][] jumsu = new int[human][subject.length+1]; // +1�� ������ ���ϱ� ����.
		float[] avg = new float[human]; // ��� �� ��ŭ ����� ������ �迭.
		char[] grade = new char[human]; // ��� �� ��ŭ ����� ������ �迭.
		int[] rank = new int[human]; // ��� �� ��ŭ ������ ������ �迭.

		for(int i=0; i < human; i++){ // ��� ����ŭ �ݺ�.
			System.out.print(i+1+" ��° �л� �̸� : ");
			name[i] = br.readLine();
			System.out.println();
			System.out.println(name[i] + " �л� ���� �Է�");
			for (int j = 0; j < subject.length; j++){ // ���� �� ��ŭ �ݺ�, ���� ���ϱ�.
				System.out.print(subject[j] + " ���� : ");
				jumsu[i][j] = Integer.parseInt(br.readLine());
				jumsu[i][jumsu[i].length-1] += jumsu[i][j]; // ���� ���ϱ�.
			} // end for j = �����.

			// ��� ���ϱ�.
			avg[i] = jumsu[i][jumsu[i].length-1] / (float)subject.length;
			avg[i] = (int)((avg[i] + 0.005) * 100) / 100.f;

			switch((int)avg[i]/10){
			case 10:
			case 9: grade[i] = 'A'; break;
			case 8: grade[i] = 'B'; break;
			case 7: grade[i] = 'C'; break;
			case 6: grade[i] = 'D'; break;
			default : grade[i] = 'F'; break;
			}
			System.out.println();
		}// end for human

		// ��� ���.
		for (int i = 0; i < human ; i++){
			rank[i]++;
			for (int j = 0; j < human ; j++){
				if(avg[i] < avg[j]){
					rank[i]++;
				}
			}
		}

		// ȭ�� ���.
		System.out.println();
		System.out.println("************************** ����ǥ ********************************");
		System.out.print("�̸�\t");
		for (int i = 0; i < subject.length; i++)
			System.out.print(subject[i] + "\t");
		System.out.println("����\t���\t����\t���");
		System.out.println("******************************************************************");
		for (int i=0; i < human;i++){
			System.out.print(name[i]+"\t");
			for (int j = 0; j < jumsu[i].length; j++)
				System.out.print(jumsu[i][j] + "\t");
			System.out.println(avg[i] + "\t" + grade[i] + "\t" + rank[i]);
		} // end for
		System.out.println("******************************************************************");
	} // end main
} // end class
