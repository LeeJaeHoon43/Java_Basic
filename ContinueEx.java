import java.io.*;
public class ContinueEx{
	public static void main(String[] ar)throws IOException{
		for(int i = 0; i <= 20; i++){
			if(i % 2 == 0) continue;
			System.out.print(i + " "); // Ȧ���� ����Ѵ�.
		}
		System.out.println("");
	}
}