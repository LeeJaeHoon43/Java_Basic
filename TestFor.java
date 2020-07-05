import java.io.*;
public class TestFor{
	public static void main(String[] ar)throws IOException{ 
		int i, j = 0;
		for (i = 0; i <= 5; i++){
			for(j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}