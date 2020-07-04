public class OperEx6{
	public static void main(String[] args) {
		int a = 20, b = 30, max;
		max = a > b ? ++a : ++b;
		System.out.println("max : " + max);
		System.out.println("b : " + a);
		System.out.println("a : " + b);
	}
}