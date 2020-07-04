import java.io.*;
public class Ex11{
	public static void main(String[] args)throws IOException{
		/*
			11. 국어점수 영어점수 수학점수를 입력받아 총점 평균 학점을 출력하는 프로그램을 작성하세요.
			(단 평균은 소수점 3번째 자리에서 반올림해서 소수점 2째자리 까지 표현한다)
			이름 = 홍길동
			국어점수 = 99
			영어점수 = 88
			수학점수 = 79
			이름 국어 영어 수학 총점 평균 학점
			홍길동 99 88 79 266 86.67 B
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력 3단계
		System.out.print("이름 : ");
		String name = br.readLine();
		System.out.print("국어 점수 : ");
		int kor = Integer.parseInt(br.readLine());
		System.out.print("영어 점수 : ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("수학 점수 : ");
		int math = Integer.parseInt(br.readLine());

		int tot = kor + eng + math;

		float avg = tot/3.f;
		avg = (int)((avg+0.005)*100) / 100.f; 

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

		System.out.print("이름\t국어\t영어\t수학\t총점\t평균\t학점\n");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg+"\t"+grade);
	}
}