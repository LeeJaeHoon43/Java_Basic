import java.io.*;
public class SwitchEx{
	public static void main(String[] ar)throws IOException{
		int kor; int eng; int mat;
		float avg;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� = ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("���� = ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("���� = ");
		mat = Integer.parseInt(br.readLine());
		avg = (kor + eng + mat) / 3.f;
		
		switch((int)(avg/10)){ // Switch(���ڰ� = ����, �����, �޼��� ��)
			case 10:
			case 9:
				System.out.println("����� ������ A�Դϴ�."); break; // break : �Ʒ����� ���� ����� ����� ã�� ��� ���� ĭ���� Ŀ���� �̵��Ѵ�.
			case 8:
				System.out.println("����� ������ B�Դϴ�."); break;
			case 7:
				System.out.println("����� ������ C�Դϴ�."); break;
			case 6:
				System.out.println("����� ������ D�Դϴ�."); break;
			default:
				System.out.println("����� ������ F�Դϴ�."); break;
		}

	}
}