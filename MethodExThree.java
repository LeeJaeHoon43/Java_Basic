class MethodExThree{
	// ��� ����.
	int var;

	// getter, setter �޼���.
	public void setVar(int var){
		var = var; // ���� �߻� = �޼����� ������ 2 : ���������� ���������� ������ �� ���������� �켱���� �Ѵ�.
	}
	public int getVar(){
		return var;
	}

  	public static void main(String[] args) {
		MethodExThree me = new MethodExThree();
		me.setVar(1000); 
		System.out.println("var = " + me.getVar()); // �ڵ� �ʱ�ȭ�� �������� var�� ���� 0�� ��µȴ�.
	}
}