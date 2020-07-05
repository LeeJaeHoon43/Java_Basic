/**
	성적표를 작성 : 1명에 대한 성적표를 작성.
	단, 과목명과 과목수에 대해 자유도를 부여한다.
*/
import java.io.*;
public class ArrayEx2{
	public static void main(String[] ar)throws IOException{
		
		/*
		for(String input : ar){
			System.out.println(input);
		} 

		if(ar.length == 0){
			System.out.println("Usage : java ArrayEx2 subject1 subject2 ...");
			System.exit(0);
		} // ar.length == 과목수 ar's value = 과목명.
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("이름 : ");
		String name = br.readLine();

		// 과목수 입력받기.
		String[] subject = new String[ar.length-1]; // 과목수 = ar.length - 1 = subject.length
		for(int i = 0; i < subject.length; i++){ // 과목명을 다 옮겨 왔다.
			subject[i] = ar[i+1];
		} // subject = ar; subject.length => 과목수...

		// 과목별 점수 입력받기.
		int jumsu[] = new int[subject.length+1]; // +1은 마지막 총점을 저장할 공간.
		for(int i = 0; i < subject.length; i++){ 
			System.out.print(subject[i] + "과목 점수 : ");
			jumsu[i] = Integer.parseInt(br.readLine());
			jumsu[jumsu.length-1] += jumsu[i]; // 총점 계산.
		}

		// 평균 구하기.
		float avg = jumsu[jumsu.length-1] / (float)subject.length; // jumsu[맨 마지막 인덱스 == 총합] / subject 배열(과목 수)의 크기.
		avg = (int)((avg+0.005)*100)/100.f; // 소수점 3짜리에서 반올림.

		// 학점 구하기.
		char grade = 0;
		switch((int)avg/10){
			case 10:
			case 9: grade = 'A'; break;
			case 8: grade = 'B'; break;
			case 7: grade = 'C'; break;
			case 6: grade = 'D'; break;
			default : grade = 'F'; break;
		}
		System.out.println();
		System.out.println("************************** 성적표 ********************************");
		System.out.print("이름\t");
		for (int i = 0; i<subject.length; i++){
			System.out.print(subject[i] + "\t");
		}
		System.out.println("총점\t평균\t학점");
		System.out.println("******************************************************************");
		System.out.print(name+"\t");
		for (int i = 0; i < jumsu.length; i++){
			System.out.print(jumsu[i] + "\t");
		}
		System.out.println(avg + "\t" +grade);
		System.out.println("******************************************************************");
	}
}