class Super {

	public Super(){
		System.out.println("���� Ŭ���� ������");
	}


	public Super(int x){
		System.out.println("���� Ŭ���� ������ : " + x);
	}
}

class Sub extends Super{
	public Sub(){
		// super(); �� �����Ǿ� �ִ�.
		//super(5);
		System.out.println("���� Ŭ���� ������");
	}
}
public class SuperEx2{
	public static void main(String[] args) {
		Sub sub = new Sub(); // ��ü ����.
	}
}
