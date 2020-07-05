import java.io.*;
public class ArrayEx5{
	public static void main(String[] ar)throws IOException{
		int[][] test; // 다차원 배열 선언.
		test = new int[3][];

		test[0] = new int[2]; // 1행 초기화.
		test[1] = new int[1]; // 2행 초기화.
		test[2] = new int[3]; // 3행 초기화.

		test[0][0] = 100;
		test[0][1] = 200;
		test[1][0] = 300;
		test[2][0] = 400;
		test[2][1] = 500;
		test[2][2] = 600;

		for (int i = 0; i < test.length; i++ ){
			for (int j = 0; j < test[i].length; j++){
				System.out.print("test["+i+"]["+j+"] = " + test[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
