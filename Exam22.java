/*
22. �� ������ǰ���� ���� �Ҹ��� ��� �ٸ���. �׷��Ƿ� Ư�� Ŭ�������� �Ҹ��� ���ϰ� ����� �� ���� �ִ�. 
	�̷� �� �ʿ��� ���� �߻�Ŭ�����ε� ������ǰ�鿡 ����� ������ [����]�� ���� �߻�Ŭ������ ������ ����.
		[����]
		- ������ �Ҹ��� �����ϴ� int���� energy��� ����
		- ��ǰ�� �̸��� ������ �� �ִ� productName�̶�� ����
		- energy ���� ��ȯ�ϴ� �޼���
		- ��ǰ�� �̸��� ��ȯ�ϴ� �޼���
		- ��ǰ�� �̸��� ����(����)�ϴ� �޼���
		- ������ �Ҹ��� �����ϴ� electricMeter() �߻� �޼���.
*/
public abstract class electric1{ // �߻� Ŭ����.
	
	// ��� ����.
	private int energy; // ������ �Ҹ��� �����ϴ� int���� energy��� ����.	
	private String productName; // ��ǰ�� �̸��� ������ �� �ִ� productName�̶�� ����.
	
	// �޼���.
	public int getEnergy() { // energy���� ��ȯ�ϴ� �޼���.
		return energy;
	}
	public String getProductName() { // ��ǰ�� �̸��� ��ȯ�ϴ� �޼���.
		return productName;
	}
	public void setProductName(String productName) { // ��ǰ�� �̸��� ����(����)�ϴ� �޼���.
		this.productName = productName;
	}
	
	// �߻� �޼���.
	public abstract void electricMeter();
}