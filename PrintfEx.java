public class PrintfEx{
	public static void main(String[] ar){
			int a = 100;
			char b = 'A';
			float c = 12.346f;
			String d = "ȫ�浿";
			System.out.printf("a = %d �Դϴ�.%n", a); // %n ��ſ� \n�� ��밡���ϴ�.
			System.out.printf("b = %c = %d %n", b, (int)b);
			System.out.printf("c = %6.2f %n", c);
			System.out.printf("d = %s�Դϴ�.", d);
	}
}