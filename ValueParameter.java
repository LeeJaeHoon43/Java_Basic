public class ValueParameter{
	public int increase(int n){
		++n;
		return n;
	}
	public static void main(String[] args) {
		// �� ȣ�� (Call by value)
		// �޼��带 ȣ�� �� �⺻ �ڷ����� ���� ���ڷ� �����ϴ� ���.
		int var1 = 100;
		ValueParameter vp = new ValueParameter();
		int var2 = vp.increase(var1);
		System.out.println("var1 : " + var1 + ", var2 : " + var2);
	}
}