class Salary{
	// 매개 변수
	private int pay;

	// 기본 생성자 생략.

	// 메서드 : getter, setter
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
		// sal.pay = 10000; // 에러 발생 : private인 변수에 접근하려면 getter, setter메서드를 활용해야 한다.
		// System.out.println("내 계좌를 마음대로 " + sal.pay);
		sal.setPay(1000, "1234");
		int myPay = sal.getPay();
		System.out.println("계좌에 입금한 금액 : " + myPay);
	}
}
