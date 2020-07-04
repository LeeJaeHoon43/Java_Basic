import java.io.*;
public class InputEx2{
	public static void main(String[] ar)throws IOException{
		int num1;
		int num2;
		System.out.print("숫자 1 : ");
		num1 = System.in.read() -48; // 아스키코드가 아닌 실제 숫자 하나 입력받기 : System.in.read() - 48 or '0';
		System.in.read(); // Enter값 처리 : \r처리.
		System.in.read(); // Enter값 처리 : \n처리.
		System.out.print("숫자 2 : ");
		num2 = System.in.read() -'0';  // 아스키코드가 아닌 실제 숫자 하나 입력받기 : System.in.read() - 48 or '0';
		System.out.println("숫자" + (num1 > num2 ? num1 : num2) + "가 더 크네요.");
	}
}