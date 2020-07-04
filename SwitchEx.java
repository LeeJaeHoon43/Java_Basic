import java.io.*;
public class SwitchEx{
	public static void main(String[] ar)throws IOException{
		int kor; int eng; int mat;
		float avg;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("국어 = ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어 = ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학 = ");
		mat = Integer.parseInt(br.readLine());
		avg = (kor + eng + mat) / 3.f;
		
		switch((int)(avg/10)){ // Switch(인자값 = 변수, 연산식, 메서드 등)
			case 10:
			case 9:
				System.out.println("당신의 학점은 A입니다."); break; // break : 아래쪽의 가장 가까운 블록을 찾아 블록 다음 칸으로 커서를 이동한다.
			case 8:
				System.out.println("당신의 학점은 B입니다."); break;
			case 7:
				System.out.println("당신의 학점은 C입니다."); break;
			case 6:
				System.out.println("당신의 학점은 D입니다."); break;
			default:
				System.out.println("당신의 학점은 F입니다."); break;
		}

	}
}