import java.io.*;
public class WhileEx1{
	public static void main(String[] ar)throws IOException{
		int i = 0;
		int sum = 0;
		while(i < 100){
			i++;
			sum += i;
		}
		System.out.println("1 ~ 100까지의 합 : " + sum);
	}
}