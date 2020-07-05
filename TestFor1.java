import java.io.*;
public class TestFor1{
	public static void main(String[] ar)throws IOException{ 
		int i, j, k = 0;
		for (i = 0; i <= 5; i++){
			for(j = 0; j <= 5-i-1; j++){
				System.out.print(" ");
			}
			for (k = 0; k < i ; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}