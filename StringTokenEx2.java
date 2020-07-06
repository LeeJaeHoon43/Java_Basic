import java.util.StringTokenizer;
public class StringTokenEx2{
	public static void main(String[] args) {
		/*
		# String Ŭ������ split()�޼���� StringTokenizer�� ������.
		- split() �޼����� ��� ���ǹ��� ����(white space)�� �ڸ��� ������.
		- StringTokenizer�� ��� ���ǹ��� ������ �����ϰ� �����Ѵ�. 
		*/
		String str = "�б�,��,,���ӹ�";
		StringTokenizer tokens = new StringTokenizer(str,",");
		for(int x = 1; tokens.hasMoreTokens(); x++){
			System.out.print("����" + x + " = " + tokens.nextToken() + "\t");
		}

		System.out.println("");
		System.out.println("========================================================================");
		String[] values = str.split(",");
		for(int x = 0; x < values.length; x++){
			System.out.print("����" + (x + 1) + " = " + values[x] + "\t");
		}
		System.out.println("");
	}
}