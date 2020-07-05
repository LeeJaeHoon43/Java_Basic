public class StaticInner{
	
	int a = 10; // ��� ����.
	private int b = 100;
	static int c = 200;
	
	static class Inner{ // static �̳� Ŭ����.
		// ��¿�� ���� �̳� Ŭ������ static���� �����ؾ� �ϴ� ��찡 �ִ�.
		// �̳� Ŭ������ ����� �� �ϳ��� static����� ���� ���.
		static int d = 1000;
		public void	printData(){
				// System.out.println("int a : " + a); // ����
				// System.out.println("private int b : " + b); // ����
				System.out.println("static int c : " + c);
				System.out.println("static int d : " + d);
		}
	}

	public static void main(String[] args){
		// �� �ٸ� ������ ��ü���� static �̳� Ŭ���� ���� ��.
		// �ܺ� Ŭ������ ���� �̳� Ŭ���� ��ü�� �����ؾ� �޼��带 ����� �� �ִ�.
		StaticInner.Inner inner = new StaticInner.Inner();
		inner.printData();
	}
}

