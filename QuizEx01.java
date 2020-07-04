/**
	프로그램을 실행하면 아래와 같이 진행.
	이름 : 홍길동
	국어 : 99 
	영어 : 88
	수학 : 79
	
	실행 결과로 아래와 같이 출력.
	이름   국어   영어   수학   총점   평균		학점 
	홍길동  99	88	   79   266   88.67		 B
	
	* 주의점 : 평균은 소수점 3째 자리에서 반올림해서 소수점 둘째 짜리까지 출력한다. 단! printf()를 이용하지 않는다.

	* 반올림의 원리 : 소수점 첫 째 자리에서 반올림해서 정수를 표현하는 경우
	- 1.1  + 0.5 *1 (int) /1 -> 1 
	  1.6  + 0.5 *1 (int) /1 -> 2

	* 소수점 둘 째 자리에서 반올림해서 소수점 첫째 자리까지 출력하는 경우.
	  원래수  +0.05  *10	(int)	/10
	- 1.11 + 0.05 = 1.16 *10 = 11.6 (int) /10 -> 1.1
	- 1.16 + 0.05 = 1.21 *10 = 12.1 (int) /10 -> 1.2

	* 소수점 세 째 자리에서 반올림해서 소수점 둘쨰 자리까지 출력하는 경우.
	  원래수	 +0.005  *100	(int)	/100
	- 1.111	  1.116	 111.6	 111	1.11
	- 1.116	  1.121	 112.6	 112	1.12
*/
import java.io.*; // 입력 1단계
public class QuizEx01{
	public static void main(String[] ar)throws IOException{ // 입력 2단계
		
		// 변수의 선언 및 입력.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력 3단계
		System.out.print("이름 : ");
		String name = br.readLine();
		System.out.print("국어 점수 : ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("영어 점수 : ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("수학 점수 : ");
		int math = Integer.parseInt(br.readLine());

		// 연산하기.
		int tot = kor + eng + math;

		
		double avg = (double)((int)(((double)((double)tot/3)+0.005)*100))/100;
		// avg = (int)((avg+0.005)*100)/100.f; 

		char grade = 0;

		switch((int)(avg/10)){
			case 10:
			case 9:
				grade = 'A'; break;
			case 8:
				grade = 'B'; break;
			case 7:
				grade = 'C'; break;
			case 6:
				grade = 'D'; break;
			default:
				grade = 'F'; break;
		}

		// 화면에 출력.
		System.out.print("이름\t국어\t영어\t수학\t총점\t평균\t학점\n");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg+"\t"+grade);
	}
}