class MethodExTwo{
	// ��� ������.
	int var1, var2;

	// �޼��� (��� �Լ�)
	public int sum(int a, int b){ 
		return a + b;
	}

  	public static void main(String[] args) {
		// �޼����� ������ 1 : �޼���� ���ϰ��� �ϳ��� ���� �����޴´�.
		MethodExTwo me = new MethodExTwo();
		int res = me.sum(1000, -10); 
		System.out.println("res = " + res);
	}
}
