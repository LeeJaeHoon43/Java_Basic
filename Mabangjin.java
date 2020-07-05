import java.io.*;
public class MabangjinEx{
	public static void main(String[] ar)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("���� = ");
		int num = System.in.read() - 48;
		System.in.read(); System.in.read();
		if(num % 2 == 0){
			System.out.println("Ȧ���� �Է��ϼ���.");
			System.exit(0);
		}else{
			int arr[][] = new int [num][num];
			int i=0; int j = num/2; //1.ù ��° �� ��� ������ ����
			int count = 1;
			while(count <= (num*num)) {
				arr[i][j] = count;
				int oldI = i;
				int oldJ = j;
				i--; j++; // 2. ������ �밢�� ���� �̵�
				if(i<0)
					i = num-1; // 3. ���� ������ �Ǹ� �� ���� �ִ������� �̵�.
				if(j>num-1)
					j=0; // 4. ���� �迭�� ���� ����� 0���� �̵��Ѵ�.
				if(arr[i][j] != 0) { //5. �̵��� ���� �����Ͱ� �����ϸ� 
					i = oldI;
					j = oldJ;  // ���� ��ġ�� �̵��ϰ� 
					i++;	   // ��� �ϳ� ������Ų��.
				}
				count++;

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