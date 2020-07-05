/*
	성적표 - 여러 명에 대한 성적표.
	사람수와 응시과목수, 과목명에 대한 자유도를 부여 : 사람마다 시험본 과목이 다르게.
	실행 : java ArrayEx6 4
		  java ArrayEx6 사람수
*/
import java.io.*;
public class ArrayEx6{
	public static void main(String[] ar)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int human = Integer.parseInt(ar[0]); // ar배열 맨앞자리에 입력된 사람 수 얻어오기.
		String[] name = new String[human]; // 입력된 사람 수 만큼의 이름을 저장할 배열 선언.
		String[][] subject = new String[human][]; // 가변 길이 배열 선언.
		int[][] jumsu = new int[human][]; // 점수 및 총점을 저장할 가변 길이 배열 선언.
		float[] avg = new float[human]; // 사람 수 만큼의 평균을 저장할 배열 선언.
		char[] grade = new char[human]; // 사람 수 만큼의 학점을 저장할 배열 선언.
		int[] rank = new int[human]; // 사람 수 만큼의 배열 선언.
		

		for(int i = 0; i<human; i++ ){ // 사람 수 만큼 반복.
			System.out.print(i + 1 + "번 학생 이름 : ");
			name[i] = br.readLine();
			System.out.println();

			System.out.print(name[i] + "학생의 응시 과목 수 : ");
			int temp = Integer.parseInt(br.readLine());
			subject[i] = new String[temp];
			// 과목수 : temp : subject[i].length
			for(int j = 0; j < subject[i].length; j++ ){
				System.out.print(j + 1 + "번째 응시 과목 명 : ");
				subject[i][j] = br.readLine();
			}
			
			jumsu[i] = new int[subject[i].length+1]; // +1은 총점.
			System.out.println();
			System.out.println(name[i] + " 학생의 과목 별 점수 입력");
			for (int j = 0; j < subject[i].length; j++ ){ // 과목 배열 수 만큼 반복한다.
				System.out.print(subject[i][j] + "점수 : ");
				jumsu[i][j] = Integer.parseInt(br.readLine()); // 점수를 입력받아서 저장한다.
				jumsu[i][jumsu[i].length-1] += jumsu[i][j]; // 총합을 누적한다.
			}

			avg[i] = jumsu[i][jumsu[i].length-1] / (float) subject[i].length;
			avg[i] = (int)((avg[i] + 0.005) * 100) / 100.f;

			switch((int)(avg[i]/10)){
				case 10:
				case 9: grade[i] = 'A'; break;
				case 8: grade[i] = 'B'; break;
				case 7: grade[i] = 'C'; break;
				case 6: grade[i] = 'D'; break;
				default : grade[i] = 'F'; break;
			}
			System.out.println();
		}

		// 등수 계산
		for (int i = 0;i < human; i++ ){
			rank[i]++;
			for (int j = 0; j < human; j++ ){
				if(avg[i] < avg[j]){
					rank[i]++;
				}
			}
		}
		System.out.println();

		for (int i = 0; i<human; i++){
			System.out.print("============");
			for (int j = 0; j < subject[i].length ; j++)
				System.out.print("====");
			System.out.print(" 성 적 표 ");
			for (int j = 0 ;j < subject[i].length ; j++)
				System.out.print("====");
			System.out.println("============");

			System.out.print("이름\t");
			for (int j = 0; j < subject[i].length; j++)
				System.out.print(subject[i][j] + "\t");
			System.out.println("총점\t평균\t학점\t석차");

			System.out.print(name[i] + "\t");
			for (int j = 0; j < jumsu[i].length; j++)
				System.out.print(jumsu[i][j] + "\t");
			System.out.println(avg[i] + "\t" + grade[i] + "\t" + rank[i]);
			System.out.println();
		}
	}
}