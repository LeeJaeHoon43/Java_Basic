import java.io.*;
public class ForEx1{
	public static void main(String[] ar)throws IOException{

		for(int count = 0; count < 5; count++){ // count : 회전수를 의미한다.
			System.out.println("*");
		}

		int sum = 0;
		for(int num = 1; num <= 100; num++){ // num : 회전수 + 연산에 개입.
			sum += num;
		}
		System.out.println("sum = " + sum);
	}
} 