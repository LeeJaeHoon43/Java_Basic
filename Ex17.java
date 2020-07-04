import java.io.*;
public class Ex17{
	public static void main(String[] args)throws IOException{
		/*
		17. 단 자리 숫자 2개를 입력받아서 합 차 곱 나누기 나눗셈의 나머지를 구하는 프로그램을 작성하세요. (System.in.read()를 이용할 것)
	
		[예시]
		숫자1 = 9
        숫자2 = 2
        두 숫자의 합은 11 이고 차는 7 이며 
        곱은 18 나눈 값은 4 이고 나눗셈의 나머지는 1입니다.
		*/

		System.out.print("숫자 1 : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("숫자 2 : ");
		int num2 = Integer.parseInt(br.readLine());
		System.out.println("두 숫자의 합은 " + (num1+num2)+ "이고, 차는 " + (num1-num2) + "이며\n\r곱은 " + (num1*num2) + "나눈 값은 " + (num1/num2)+"이고 나머지는 " + (num1%num2)+"입니다.");

	}
}