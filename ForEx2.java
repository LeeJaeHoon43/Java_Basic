import java.io.*;
public class ForEx2{
	public static void main(String[] ar)throws IOException{
		System.out.println("*** 구구단 ***");
		for(int dan = 2; dan < 10; dan++){
			for (int hang = 1; hang < 10; hang++){
				System.out.println(dan + " X " + hang + " = " + dan*hang);
			}
			System.out.println();
		}


		System.out.println("*** 구구단 가로 출력하기 ***");
		for (int hang=1; hang < 10 ; hang++){
			for(int dan=2; dan <10 ; dan++ ){
				if(dan * hang >= 10)
					System.out.print(dan + " X " + hang + " =" + dan*hang + "\t");
				else
					System.out.print(dan + " X " + hang + " = " + dan*hang + "\t");
			}
			System.out.println();
		}
	}
} 