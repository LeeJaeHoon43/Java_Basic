import java.io.*;
public class Ex10{
	public static void main(String[] args)throws IOException{
		// 10. 단을 입력받아서 구구단을 출력하는 프로그램을 작성하세요. (System.in.read() 사용할 것)
		System.out.print("단을 입력하시오 : ");
		int dan = System.in.read() - 48;
		for(int hang = 1; hang <= 9; hang++){
			System.out.println(dan + " X " + hang + " = " + (dan * hang));
		}
	}
}