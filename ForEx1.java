import java.io.*;
public class ForEx1{
	public static void main(String[] ar)throws IOException{

		for(int count = 0; count < 5; count++){ // count : ȸ������ �ǹ��Ѵ�.
			System.out.println("*");
		}

		int sum = 0;
		for(int num = 1; num <= 100; num++){ // num : ȸ���� + ���꿡 ����.
			sum += num;
		}
		System.out.println("sum = " + sum);
	}
} 