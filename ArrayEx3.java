import java.io.*;
public class ArrayEx3{
	public static void main(String[] ar)throws IOException{
		int[][] test; // ������ �迭 ����.
		test = new int[2][3];
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		// 1�� ��.
		test[1][0] = 500;
		test[1][1] = 600;
		test[1][2] = 700;
		// 2�� ��.
		for (int i = 0; i < test.length; i++){
			for (int j = 0; j < test[i].length; j++){
				System.out.print("test ["+i+"]["+j+"] = " + test[i][j] + "\t");
			}
			System.out.println();
		}
	}	
}