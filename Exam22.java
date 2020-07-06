/*
22. 각 가전제품들의 전기 소모량은 모두 다르다. 그러므로 특정 클래스에서 소모량을 정하고 상속을 줄 수도 있다. 
	이럴 때 필요한 것이 추상클래스인데 가전제품들에 적용될 다음의 [조건]을 보고 추상클래스를 정의해 보자.
		[조건]
		- 에너지 소모량을 저장하는 int형의 energy라는 변수
		- 제품의 이름을 저장할 수 있는 productName이라는 변수
		- energy 값을 반환하는 메서드
		- 제품의 이름을 반환하는 메서드
		- 제품의 이름을 설정(변경)하는 메서드
		- 에너지 소모량을 증가하는 electricMeter() 추상 메서드.
*/
public abstract class electric1{ // 추상 클래스.
	
	// 멤버 변수.
	private int energy; // 에너지 소모량을 저장하는 int형의 energy라는 변수.	
	private String productName; // 제품의 이름을 저장할 수 있는 productName이라는 변수.
	
	// 메서드.
	public int getEnergy() { // energy값을 반환하는 메서드.
		return energy;
	}
	public String getProductName() { // 제품의 이름을 반환하는 메서드.
		return productName;
	}
	public void setProductName(String productName) { // 제품의 이름을 설정(변경)하는 메서드.
		this.productName = productName;
	}
	
	// 추상 메서드.
	public abstract void electricMeter();
}