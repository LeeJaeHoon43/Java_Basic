abstract class AbsEx1{
	int a = 100; // ����.
	final String str = "abstract test"; // ���.
	public String getStr(){ // �Ϲ� �޼���
		return str;
	}

	// �߻� �޼���� ��ü(body)�� ����.
	abstract public int getA();
}
abstract class AbsEx2 extends AbsEx1{
	public int getA(){ // �θ� Ŭ����(AbsEx1)�� �߻� �޼��� �������̵�.
		return a; // 100 ����.
	}
	public abstract String getStr();
}
public class AbsEx extends AbsEx2{
	public String getStr(){ // AbsEx2�� �߻� �޼��� �������̵�.
		return str; // str�� AbsEx1�� ��� �����̴�.
	}
	public static void main(String[] args){
		AbsEx ae = new AbsEx(); // ��ü ����.
		System.out.println("ae.getA() : " + ae.getA());
		System.out.println("ae.getStr() : " + ae.getStr());
	}
}
