class CellPhone{
	public void call(){
		System.out.println("���� ��ȭ�� �մϴ�.");
	}
}
public class CellPhone3G extends CellPhone{
	@Override // ������̼�. �� �޼��尡 �������̵��� �޼����� ���� �˷��ִ� ������ �Ѵ�.
	public void call(){
		super.call();
		System.out.println("���� ��ȭ�� �մϴ�.");
	}

	public static void main(String[] args){
		//CellPhone cp = new CellPhone();
		//cp.call();
		CellPhone3G cp3 = new CellPhone3G();
		cp3.call();
	}
}
