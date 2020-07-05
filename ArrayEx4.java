import java.io.*;
public class ArrayEx4{
	public static void main(String[] ar)throws IOException{
		/*
			성적표 작성 - 여러 명에 대한 성적표.
			사람 수와 과목 명에 대해서 자유도를 부여한다.
			java ArrayEx4 3 국어 영어 수학 과학
			java ArrayEx4 사람수 과목명1 과목명2 ... 과목명N
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int human = Integer.parseInt(ar[0]); // 사람 수 구하기.
		String[] name = new String[human]; // 사람 수 만큼의 이름을 저장할 배열 선언.
		String[] subject = new String[ar.length-1]; // 과목명 초기화. ar배열에서 -1의 크기로 과목명을 담을 배열 선언.
		// 과목 수 = ar.length-1 == subject.length.
		for(int i = 0; i < subject.length; i++){
			subject[i] = ar[i+1]; // 과목명을 옮겨오기.
		}

		// 점수와 총점 처리 배열들 선언..
		int[][] jumsu = new int[human][subject.length+1]; // +1은 총점을 구하기 위해.
		float[] avg = new float[human]; // 사람 수 만큼 평균을 저장할 배열.
		char[] grade = new char[human]; // 사람 수 만큼 등급을 저정할 배열.
		int[] rank = new int[human]; // 사람 수 만큼 석차를 저장할 배열.

		for(int i=0; i < human; i++){ // 사람 수만큼 반복.
			System.out.print(i+1+" 번째 학생 이름 : ");
			name[i] = br.readLine();
			System.out.println();
			System.out.println(name[i] + " 학생 점수 입력");
			for (int j = 0; j < subject.length; j++){ // 과목 수 만큼 반복, 총점 구하기.
				System.out.print(subject[j] + " 점수 : ");
				jumsu[i][j] = Integer.parseInt(br.readLine());
				jumsu[i][jumsu[i].length-1] += jumsu[i][j]; // 총점 구하기.
			} // end for j = 과목수.

			// 평균 구하기.
			avg[i] = jumsu[i][jumsu[i].length-1] / (float)subject.length;
			avg[i] = (int)((avg[i] + 0.005) * 100) / 100.f;

			switch((int)avg[i]/10){
			case 10:
			case 9: grade[i] = 'A'; break;
			case 8: grade[i] = 'B'; break;
			case 7: grade[i] = 'C'; break;
			case 6: grade[i] = 'D'; break;
			default : grade[i] = 'F'; break;
			}
			System.out.println();
		}// end for human

		// 등수 계산.
		for (int i = 0; i < human ; i++){
			rank[i]++;
			for (int j = 0; j < human ; j++){
				if(avg[i] < avg[j]){
					rank[i]++;
				}
			}
		}

		// 화면 출력.
		System.out.println();
		System.out.println("************************** 성적표 ********************************");
		System.out.print("이름\t");
		for (int i = 0; i < subject.length; i++)
			System.out.print(subject[i] + "\t");
		System.out.println("총점\t평균\t학점\t등수");
		System.out.println("******************************************************************");
		for (int i=0; i < human;i++){
			System.out.print(name[i]+"\t");
			for (int j = 0; j < jumsu[i].length; j++)
				System.out.print(jumsu[i][j] + "\t");
			System.out.println(avg[i] + "\t" + grade[i] + "\t" + rank[i]);
		} // end for
		System.out.println("******************************************************************");
	} // end main
} // end class
