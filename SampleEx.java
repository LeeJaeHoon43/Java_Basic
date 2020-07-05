class Sample{ // Sample.java ���ϵ� �ڵ����� �����ȴ�.
	// ��� ����.
	private int x; // private : ����ȭ.
	int y;

	// �����ڴ� �����Ǿ�������, public Sample(){}�� �ڵ����� �����Ǿ� �ִ�. -> default Constructor (�⺻ ������).
	
	// ĸ��ȭ.
	// getter, setter �޼��� �����.
	public int getX(){
		return x;
	}
	public void setX(int value){
		this.x = value;
	}
}

public class SampleEx{ // file�� public�� ���� Ŭ���� �̸����� �����. SampleEx.java
	public static void main(String[] ar){
		Sample sp = new Sample();
		System.out.println(sp.getX()); // getter()�޼��带 ���� private�� x�� ���� �����´�. (ĸ��ȭ)
		// �ڹٿ��� ���� ������� ���� ���� �����ڸ� ������.
		// �ڹٿ��� Ŭ������ ��� ������ �ڵ����� �ʱ�ȭ�ȴ�.
		// �տ��� �迭�� ���� new�� ���� -> new�� �ʱ�ȭ�ϴ� �͵��� �ڵ� �ʱ�ȭ�ȴ�.
		// ��ü�� new�� �ʱ�ȭ�ϴµ� Ŭ������ ��� �������� �ش� Ÿ���� �⺻������ �ڵ����� �ʱ�ȭ�Ѵ�.
		// �� ���Ͽ� Ŭ������ ���� �� �������� public�� ���� �� �ִ� Ŭ������ mainŬ���� �ϳ��̴�.
	}
}