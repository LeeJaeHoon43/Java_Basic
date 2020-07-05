public class ObjectEx{
	private String name;
	private int price;

	public ObjectEx(String name, int price){
		this.name = name;
		this.price = price;
	}
	public static void main(String[] args) {
		ObjectEx test1 = new ObjectEx("1", 1);
		ObjectEx test2 = new ObjectEx("1", 1);
		ObjectEx test3 = test1;
		System.out.println("test1 :  " + test1); // ��ü�� test1 �ڿ� toString()�� �����Ǿ� �ִ�.
		System.out.println("test2 : " + test2);
		System.out.println("test1�� �ؽ��ڵ�� : " + test1.hashCode());
		System.out.println("test2�� �ؽ��ڵ�� : " + test2.hashCode());
		System.out.println("test1�� test2�� ������? : " + test1.equals(test2));
	}
}
