import java.io.*;
public class InputEx3{
	public static void main(String[] ar)throws IOException{
		String name;
		String age;
		String addr;
		String tel;
		// ���ڿ� �Է¹ޱ�
		// InputStreamReader is = new InputStreamReader(System.in);
		// BufferedReader br = new BufferedReader(is);
		// String name = br.readLine();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�̸� : ");
		name = br.readLine();
		System.out.print("���� : ");
		age = br.readLine();
		System.out.print("�ּ� : ");
		addr = br.readLine();
		System.out.print("��ȭ��ȣ : ");
		tel = br.readLine();
		System.out.println(); // ��� ���.
		System.out.println(name + "��");
		System.out.println(age + "�� �̱���.");
		System.out.println(addr + "�� ��ô� ����.");
		System.out.println(tel + "�� ��ȭ�帮�ڽ��ϴ�.");

	}
}
