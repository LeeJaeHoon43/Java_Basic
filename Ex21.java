import java.io.*;
public class Ex21{
	public static void main(String[] args)throws IOException{
		/*
		21. 초를 입력받아서 분으로 계산하는 프로그램을 아래와 같이 작성해 보세요.

		[예시]
		시간(단위:초) = 250
	    250초는 4분 10초 입니다.

	   */
	   	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("시간(단위:초) : ");
		int sec = Integer.parseInt(br.readLine());
		
		/*
		int min = 0;
		min = sec / 60;

		*/

		int min = (sec % 3600)/60; // 분 = (입력받은 초 % 3600) / 60; (sec / 60)
		System.out.println(sec+"초는 "+min+"분 "+(sec % 60)+"초 입니다.");
	}
}
