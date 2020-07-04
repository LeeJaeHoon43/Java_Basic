import java.io.*;
public class InputEx1{
	public static void main(String[] ar)throws IOException{
			System.out.print("문자 입력 : "); 
			int i = System.in.read(); // System.in.read() : ASCII 코드 입력 받기. 
			System.out.println("ASCII value : " + i); // ASCII 코드 값으로 출력된다.
	}
}