import java.io.*;
public class InputEx1{
	public static void main(String[] ar)throws IOException{
			System.out.print("���� �Է� : "); 
			int i = System.in.read(); // System.in.read() : ASCII �ڵ� �Է� �ޱ�. 
			System.out.println("ASCII value : " + i); // ASCII �ڵ� ������ ��µȴ�.
	}
}