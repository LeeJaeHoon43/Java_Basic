import java.io.*;
public class Ex18{
	public static void main(String[] args)throws IOException{

		/*
		18. 국어점수 영어점수 수학점수를 입력받아 총첨과 평균을 출력해주는 프로그램을 작성하세요.

		 [예시]
	     이름 = 홍길동
         국어점수 = 99
         영어점수 = 88
         수학점수 = 79
         홍길동님의 총점은 266점이고 평균은 86.67점입니다.
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("이름 : ");
		String name = br.readLine();
		System.out.print("국어 점수 : ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("영어 점수 : ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("수학 점수 : ");
		int math = Integer.parseInt(br.readLine());
		
		int tot = kor + eng + math;
		double avg = (double)((int)(((double)((double)tot/3)+0.005)*100))/100;

		System.out.println(name+"님의 총점은 "+tot+"점이고, 평균은 "+avg+"점 입니다.");

	}
}
