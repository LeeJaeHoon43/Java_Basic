import java.io.*;

class CellPhone1 {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void call(String number)throws IOException{
		System.out.println(number + "로 음성 통화를 합니다.");
	}

}
class Phone3G extends CellPhone1{
	//멤버
	BufferedReader br;
	//생성자   
	public Phone3G(){
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	@Override
	public void call(String number)throws IOException{
		System.out.println("1. 음성 통화");
		System.out.println("2. 영상 통화");
		System.out.print("통화 방법 선택 : ");
		int choice = Integer.parseInt(br.readLine());
		if (choice == 1) {
			super.call(number);
		}else if (choice == 2) {
			System.out.println(number + "로 영상 통화를 합니다.");
		}else {
			System.out.println("메뉴 입력 오류 : 통화를 취소합니다.");
		}
	}
}
public class MyPhone2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.print("통화를 하시겠습니까? (y/n) : ");
			String answer = br.readLine();
			
			if(answer.equals("N") || answer.equals("n")) {
				System.out.println("통화를 종료합니다.");
				System.exit(0);
			}
			
			System.out.print("전화번호를 입력하세요 : ");
			String phoneNumber = br.readLine();

			CellPhone1 phone = new Phone3G(); // 다형성 객체 생성.
			phone.call(phoneNumber);
			
			try{
				Thread.sleep(3000); // 프로그램 3초간 멈춤.	
			}catch (InterruptedException ie){}
			
			System.out.println();
		}
	}
}