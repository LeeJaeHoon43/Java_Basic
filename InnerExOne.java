class OuterEx{
	public class InnerEx{
		int x = 5;
	}
}
public class InnerExOne{
	public static void main(String[] args){
		// 외부 클래스 먼저 생성하고,
		OuterEx eo = new OuterEx();
		// 외부를 통해서 내부 클래스를 생성한다.
		OuterEx.InnerEx ei = eo.new InnerEx();
		System.out.println("ei.x : " + ei.x);
	}
}