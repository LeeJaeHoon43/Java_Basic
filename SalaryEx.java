class Salary{
	// �Ű� ����
	private int pay;

	// �⺻ ������ ����.

	// �޼��� : getter, setter
	public int getPay(){
		return pay;
	}

	public void setPay(int pay, String pass){
		if(pass.equals("1234"))
			this.pay = pay;
	}
}

public class SalaryEx{
	public static void main(String[] ar){
		Salary sal = new Salary();
		// sal.pay = 10000; // ���� �߻� : private�� ������ �����Ϸ��� getter, setter�޼��带 Ȱ���ؾ� �Ѵ�.
		// System.out.println("�� ���¸� ������� " + sal.pay);
		sal.setPay(1000, "1234");
		int myPay = sal.getPay();
		System.out.println("���¿� �Ա��� �ݾ� : " + myPay);
	}
}
