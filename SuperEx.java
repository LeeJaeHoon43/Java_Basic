class Super{
	int a = 5;
}

class Sub extends Super{
	int a = 10;
	public void test(){
		System.out.println(this.a); // 10
		System.out.println(super.a); // 5
	}
}

public class SuperEx{
	public static void main(String[] args){
		Sub sub = new Sub(); // ��ü ����.
		sub.test(); // �޼��� ȣ��.
	}
}