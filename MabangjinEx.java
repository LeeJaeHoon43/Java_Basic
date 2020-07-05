import java.io.*;
public class MabangjinEx{
	public static void main(String[] ar)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("### ������ ###");
		System.out.print("���� = ");
		int num = Integer.parseInt(br.readLine());
		if(num % 2 == 0 || num == 1 || num == 0){
			System.out.println("3 �̻��� Ȧ���� �Է��ϼ���.");
			System.exit(0);
		}else{
			int arr[][] = new int[num][num];
			int i=0;  // �迭�� �� ��ġ�� �����ϴ� ����.
			int j = num/2; // ù ��° �� ��� ������ ����. �迭�� �� ��ġ�� �����ϴ� ����.
			int count = 1; // ���ڴ� 1���� �����Ѵ�.
			while(count <= (num*num)) {
				arr[i][j] = count;
				int oldI = i; // ���� ���� ��ġ�� ����ϱ� ���� ���� �����صд�.
				int oldJ = j; // ���� ���� ��ġ�� ����ϱ� ���� ���� �����صд�.
				i--; 
				j++; // ������ �밢�� ���� �̵�.
				if(i<0)
					i = num-1; // ���� ������ �Ǹ� �� ���� �� ������ �̵�.
				if(j>num-1)
					j=0; // ���� �迭�� ���� ����� 0���� �̵��Ѵ�.
				if(arr[i][j] != 0) { // �̵��� ���� �����Ͱ� �����ϸ� 
					i = oldI;  // �൵ ���� ��ġ�� �̵��ϰ�,
					j = oldJ;  // ���� ���� ��ġ�� �̵��ϰ�,
					i++;	   // ��� �ϳ� ������Ų��.
				}
				count++; // ���� 1 ����.
			}
			for (i = 0; i < num; i++) {
				for (j = 0; j < num; j++) {
					System.out.print(arr[i][j] + "\t");	
				}
				System.out.println();
			}
		}
	}
}