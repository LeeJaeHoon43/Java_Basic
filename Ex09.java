import java.io.*;
public class Ex09{
	public static void main(String[] args)throws IOException{

		/*
		9.  아래와 같이 동작되는 단 자리 계산기 프로그램을 작성해 보세요.
			단, 사칙연산만 수행하며 입력은 반드시 0~9사이의 숫자만 넣는다. (System.in.read()를 이용할 것)
			숫자 1 = 5
			연산자 = +
			숫자 2 = 7
			연산결과 : 12
		*/

		System.out.print("숫자 1 : ");
		int num1 = System.in.read() - 48;

		System.in.read();System.in.read();
		System.out.print("연산자 : ");
		char cal = (char)System.in.read();
		System.in.read();System.in.read();
		System.out.print("숫자 2 : ");
		int num2 = System.in.read() - 48;
		System.in.read();System.in.read();

		switch(cal){
			case '+':
				System.out.println("연산 결과 : " + (num1 + num2));
				break;
			case '-':
				System.out.println("연산 결과 : " + (num1 - num2));
				break;
			case '*':
				System.out.println("연산 결과 : " + (num1 * num2));
				break;
			case '/':
				System.out.println("연산 결과 : " + (num1 / num2));
				break;
			case '%':
				System.out.println("연산 결과 : " + (num1 % num2));
				break;
			default:
				System.out.println("사칙 연산 부호를 입력하세요.");
				System.exit(0);
		}
	}
}