import java.io.*;
public class InputEx4{
	public static void main(String[] ar)throws IOException{
		/*
		# ���ڿ�(���ڸ� �̻�) �Է¹ޱ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));\
		String imsi = br.readLine(); 
		int i = Integer.parseInt(imsi); // ���ڿ��� ���ڿ��� �ٲپ��ִ� �޼���.
		����� ���ڸ� ���ڷ� �ٲٷ��� : String ss = String.valueOf(����);
		*/
		int kor;
		int eng;
		int math;
		int tot;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("���� = ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("���� = ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("���� = ");
		math = Integer.parseInt(br.readLine());

		tot = kor + eng + math;
		System.out.println();
		System.out.println("���� = " + tot);
	}
}