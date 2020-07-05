/*
	����ǥ - ���� �� ���� ����ǥ.
	������� ���ð����, ����� ���� �������� �ο� : ������� ���躻 ������ �ٸ���.
	���� : java ArrayEx6 4
		  java ArrayEx6 �����
*/
import java.io.*;
public class ArrayEx6{
	public static void main(String[] ar)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int human = Integer.parseInt(ar[0]); // ar�迭 �Ǿ��ڸ��� �Էµ� ��� �� ������.
		String[] name = new String[human]; // �Էµ� ��� �� ��ŭ�� �̸��� ������ �迭 ����.
		String[][] subject = new String[human][]; // ���� ���� �迭 ����.
		int[][] jumsu = new int[human][]; // ���� �� ������ ������ ���� ���� �迭 ����.
		float[] avg = new float[human]; // ��� �� ��ŭ�� ����� ������ �迭 ����.
		char[] grade = new char[human]; // ��� �� ��ŭ�� ������ ������ �迭 ����.
		int[] rank = new int[human]; // ��� �� ��ŭ�� �迭 ����.
		

		for(int i = 0; i<human; i++ ){ // ��� �� ��ŭ �ݺ�.
			System.out.print(i + 1 + "�� �л� �̸� : ");
			name[i] = br.readLine();
			System.out.println();

			System.out.print(name[i] + "�л��� ���� ���� �� : ");
			int temp = Integer.parseInt(br.readLine());
			subject[i] = new String[temp];
			// ����� : temp : subject[i].length
			for(int j = 0; j < subject[i].length; j++ ){
				System.out.print(j + 1 + "��° ���� ���� �� : ");
				subject[i][j] = br.readLine();
			}
			
			jumsu[i] = new int[subject[i].length+1]; // +1�� ����.
			System.out.println();
			System.out.println(name[i] + " �л��� ���� �� ���� �Է�");
			for (int j = 0; j < subject[i].length; j++ ){ // ���� �迭 �� ��ŭ �ݺ��Ѵ�.
				System.out.print(subject[i][j] + "���� : ");
				jumsu[i][j] = Integer.parseInt(br.readLine()); // ������ �Է¹޾Ƽ� �����Ѵ�.
				jumsu[i][jumsu[i].length-1] += jumsu[i][j]; // ������ �����Ѵ�.
			}

			avg[i] = jumsu[i][jumsu[i].length-1] / (float) subject[i].length;
			avg[i] = (int)((avg[i] + 0.005) * 100) / 100.f;

			switch((int)(avg[i]/10)){
				case 10:
				case 9: grade[i] = 'A'; break;
				case 8: grade[i] = 'B'; break;
				case 7: grade[i] = 'C'; break;
				case 6: grade[i] = 'D'; break;
				default : grade[i] = 'F'; break;
			}
			System.out.println();
		}

		// ��� ���
		for (int i = 0;i < human; i++ ){
			rank[i]++;
			for (int j = 0; j < human; j++ ){
				if(avg[i] < avg[j]){
					rank[i]++;
				}
			}
		}
		System.out.println();

		for (int i = 0; i<human; i++){
			System.out.print("============");
			for (int j = 0; j < subject[i].length ; j++)
				System.out.print("====");
			System.out.print(" �� �� ǥ ");
			for (int j = 0 ;j < subject[i].length ; j++)
				System.out.print("====");
			System.out.println("============");

			System.out.print("�̸�\t");
			for (int j = 0; j < subject[i].length; j++)
				System.out.print(subject[i][j] + "\t");
			System.out.println("����\t���\t����\t����");

			System.out.print(name[i] + "\t");
			for (int j = 0; j < jumsu[i].length; j++)
				System.out.print(jumsu[i][j] + "\t");
			System.out.println(avg[i] + "\t" + grade[i] + "\t" + rank[i]);
			System.out.println();
		}
	}
}