class CellPhone{
	public void call(){
		System.out.println("음성 통화를 합니다.");
	}
}
public class CellPhone3G extends CellPhone{
	@Override // 어노테이션. 이 메서드가 오버라이딩한 메서드라는 것을 알려주는 역할을 한다.
	public void call(){
		super.call();
		System.out.println("영상 통화를 합니다.");
	}

	public static void main(String[] args){
		//CellPhone cp = new CellPhone();
		//cp.call();
		CellPhone3G cp3 = new CellPhone3G();
		cp3.call();
	}
}
