import java.io.*;
public class Ex20{
	public static void main(String[] args)throws IOException{
		/*
		20. 밑변과 높이를 입력받아서 삼각형의 넓이를 구하는 프로그램을 작성하세요.
			삼각형의 넓이를 구하는 공식은 [넓이 = 밑변 * 높이 / 2] 이다.
		[예시]	   
		밑변 = 5	
	    높이 = 7
	    삼각형 넓이 = 17.5
		*/

		int a;
		int b;
		float c;
		System.out.print("밑변 : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		a = Integer.parseInt(br.readLine());
		System.out.print("높이 : ");
		b = Integer.parseInt(br.readLine());
		
		c = (float)(a * b) / 2;
		c = ((int)(c * 10.0))/(float)10.0;
		System.out.println("삼각형 넓이 : " + c);
	}
}
