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
		System.out.println("test1 :  " + test1); // 객체명 test1 뒤에 toString()이 생략되어 있다.
		System.out.println("test2 : " + test2);
		System.out.println("test1의 해시코드는 : " + test1.hashCode());
		System.out.println("test2의 해시코드는 : " + test2.hashCode());
		System.out.println("test1과 test2는 같은가? : " + test1.equals(test2));
	}
}
