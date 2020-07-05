import java.io.*;
public class ArrayExam07{
	public static void main(String[] ar)throws IOException{
		/*
			3과목의 점수를 입력받아서 합격이지 불합격인지 출력하는 프로그램을 작성하세요.
			단, 3개의 과목이 전부 40이상이어야 하고, 
			평균이 60이어야 "합격"을 출력하고,
			평균이 60이 넘지만 1개의 과목이라도 40 미만이면 "과락으로 불합격"을 출력하며,
			평균이 60미만이면 "불합격"을 출력한다.
			실행예시 1 :
			실행방법 : java ExamEx06 75 80 100
			결과 = 합격
			실행예시 2 :
			실행방법 : java ExamEx06 95 80 38
			결과 = 과락으로 불합격
			실행예시 3 :
			실행방법 : java ExamEx06 32 40 22
			결과 = 불합격
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tot = 0;
		int[] jumsu = new int[ar.length];
		for(int i = 0; i < jumsu.length ; i++){
			jumsu[i] = Integer.parseInt(ar[i]);
		}
	
		for(int i = 0; i < jumsu.length; i++){
			tot += jumsu[i];
		}

		int avg = 0;
		avg = tot / jumsu.length;

		if(avg > 60){ 
			if ((jumsu[0] > 40 ) && (jumsu[1] > 40) && (jumsu[2] > 40))
				System.out.println("결과 = 합격!!");		
			else
				System.out.println("결과 = 과락으로 불합격!!");
		}else	
			System.out.println("결과 = 불합격!!");
	}
}