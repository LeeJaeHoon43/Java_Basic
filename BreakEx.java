import java.io.*;
public class BreakEx{
	public static void main(String[] ar)throws IOException{
		int i = 0;
		while (i < 100){
			System.out.print(" " + i);
			if(i == 20) break;
			i++;
		}
		System.out.println("");
	}
}
