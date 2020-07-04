import java.io.*;
public class InputEx4{
	public static void main(String[] ar)throws IOException{
		/*
		# 숫자열(두자리 이상) 입력받기.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));\
		String imsi = br.readLine(); 
		int i = Integer.parseInt(imsi); // 문자열을 숫자열로 바꾸어주는 메서드.
		참고로 숫자를 문자로 바꾸려면 : String ss = String.valueOf(변수);
		*/
		int kor;
		int eng;
		int math;
		int tot;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("국어 = ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어 = ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학 = ");
		math = Integer.parseInt(br.readLine());

		tot = kor + eng + math;
		System.out.println();
		System.out.println("총점 = " + tot);
	}
}