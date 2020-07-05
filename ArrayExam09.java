import java.io.*;
public class ArrayExam09{
	public static void main(String[] ar)throws IOException{
		/*
			9. 정수를 입력받아서 1 ~ 정수까지 약수를 구하는 프로그램을 작성하세요.
			약수는 나누어서 떨어지는 수를 말합니다. (예 9의 약수는 1, 3, 9)
			실행방법 : java ExamEx09 52
			결과출력 : 1 2 4 13 26 52
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(ar[0]);
		
		System.out.print(num + "의 약수 : ");
		for(int i = 1; i <= num; i++){
			if(num % i == 0)
				System.out.print(i + " ");
		}
		System.out.println();
	}
}