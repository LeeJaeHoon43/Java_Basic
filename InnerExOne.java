class OuterEx{
	public class InnerEx{
		int x = 5;
	}
}
public class InnerExOne{
	public static void main(String[] args){
		// �ܺ� Ŭ���� ���� �����ϰ�,
		OuterEx eo = new OuterEx();
		// �ܺθ� ���ؼ� ���� Ŭ������ �����Ѵ�.
		OuterEx.InnerEx ei = eo.new InnerEx();
		System.out.println("ei.x : " + ei.x);
	}
}