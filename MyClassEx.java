class MyClass{

	// 멤버
	private String name;
	private int age;

	// 생성자
	public MyClass(){
		name = "미로";
	}

	public MyClass(String n){
		name = n;		
	}
	
	public MyClass(int a, String n){
		age = a;
		name = n;
	}
	
	public MyClass(String n, int a){
		age = a;
		name = n;
	}

	public String getName(){
		return name;
	}

	public void setName(String n){
		name = n;
	}
	
	public int getAge(){
		return age;
	}

	public void setAge(int a){
		age = a;
	}
}
public class MyClassEx{
	public static void main(String[] args){
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass("홍길동");
		MyClass mc3 = new MyClass("박루미", 2);
		MyClass mc4 = new MyClass(1, "박노루");
		System.out.println(mc1.getName() + "," + mc1.getAge());
		System.out.println(mc2.getName() + "," + mc2.getAge());
		System.out.println(mc3.getName() + "," + mc3.getAge());
		System.out.println(mc4.getName() + "," + mc4.getAge());
	}
}