import java.io.*;
public class Ex10{
	public static void main(String[] args)throws IOException{
		// 10. ���� �Է¹޾Ƽ� �������� ����ϴ� ���α׷��� �ۼ��ϼ���. (System.in.read() ����� ��)
		System.out.print("���� �Է��Ͻÿ� : ");
		int dan = System.in.read() - 48;
		for(int hang = 1; hang <= 9; hang++){
			System.out.println(dan + " X " + hang + " = " + (dan * hang));
		}
	}
}