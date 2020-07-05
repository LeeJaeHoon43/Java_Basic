import java.io.*;
public class ArrayExam06{
	public static void main(String[] ar)throws IOException{
		/*
		이름(name), 국어(kor), 영어(eng), 수학(mat) 점수를 입력받아서 총점(tot), 평균(avg)을 구하는 프로그램을 작성하세요.
		이때 평균은 소수점 3째 자리에서 반올림해서 소수저점 2째 자리까지 출력한다.
		
		실행방법 : java ExamEx05 홍길동 100 100 96
		*** 홍길동 성적표 ***
		국어 영어 수학 총점 평균
		100 100 95 296 98.67
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("이름 : ");
		String name = br.readLine();

		// 과목
		String[] subject = new String[ar.length-1];
		for (int i = 0; i < subject.length ; i++){
			subject[i] = ar[i+1];
		}

		// 과목 점수 입력받기
		int[] jumsu = new int[subject.length+1];
		for(int i = 0; i < subject.length; i++){
			System.out.print(subject[i] + " 과목 점수 : ");
			jumsu[i] = Integer.parseInt(br.readLine());
			jumsu[jumsu.length-1] += jumsu[i]; // 총합 계산.
		}

		// 평균 구하기.
		float avg = jumsu[jumsu.length-1] / (float)subject.length;
		avg = (int)((avg + 0.005) * 100) / 100.f;

		System.out.println();
		System.out.println("********* " + name + " 성적표 *********");
		for (int i = 0; i < subject.length ; i++ ){
			System.out.print(subject[i] + "\t");
		}
		System.out.println("총점\t평균");
		for (int j = 0; j < jumsu.length; j++){
			System.out.print(jumsu[j] + "\t");
		}
		System.out.println(avg + "\t");
	}
}