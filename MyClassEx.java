class MyClass{

	// ���
	private String name;
	private int age;

	// ������
	public MyClass(){
		name = "�̷�";
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
		MyClass mc2 = new MyClass("ȫ�浿");
		MyClass mc3 = new MyClass("�ڷ��", 2);
		MyClass mc4 = new MyClass(1, "�ڳ��");
		System.out.println(mc1.getName() + "," + mc1.getAge());
		System.out.println(mc2.getName() + "," + mc2.getAge());
		System.out.println(mc3.getName() + "," + mc3.getAge());
		System.out.println(mc4.getName() + "," + mc4.getAge());
	}
}