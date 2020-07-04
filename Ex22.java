import java.io.*;
public class Ex22{
	public static void main(String[] args)throws IOException{
		/*
		22. 금액을 입력받아서 화폐의 개수를 구하는 아래와 같이 프로그램을 작성하세요.
		단! 금액은 10원 이상 10만원 미만의 금액만 입력한다.

	   [예시]
	   금액 = 57620
	   만원 = 5장
	   천원 = 7장
	   백원 = 6개
	   십원 = 2개
	   */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("금액 = ");
		int money = Integer.parseInt(br.readLine());
		
		System.out.println("만원 = " +(money / 10000)+ "장");
		System.out.println("천원 = " +((money % 10000) / 1000)+ "장");
		System.out.println("백원 = " +((money % 1000) / 100)+ "개");
		System.out.println("십원 = " +((money % 100) / 10)+ "개");

		/*
		# 1번째 방법.
		int tent;
		int thousand;
		int hund;
		int ten;
		int money;
		System.out.print("금액 : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		money = Integer.parseInt(br.readLine());

		tent = money/10000;
		money %= 10000;
		thousand = money/1000;
		money %= 1000;
		hund  = money/100;
		money %= 100;
		ten = money/10;

		System.out.println("만원 = " + tent + "장");
		System.out.println("천원 = " + thousand + "장");
		System.out.println("백원 = " + hund + "개");
		System.out.println("십원 = " + ten + "개");

		# 2번째 방법.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("금액 = ");
		int money = Integer.parseInt(br.readLine());

		System.out.println("만원 = " + (money / 10000) + "장");
		System.out.println("천원 = " + ((money % 10000) / 1000) + "장");
		System.out.println("백원 = " + (((money % 10000) % 1000) / 100) + "개");
		System.out.println("십원 = " + ((((money % 10000) % 1000) % 100) / 10) + "개");

		# 3번째 방법.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("금액 = "); 
		String sMoney = br.readLine(); 
		
		String man = sMoney.substring(0,1);
		String chon = sMoney.substring(1,2);
		String baek = sMoney.substring(2,3);
		String sip = sMoney.substring(3,4);

		System.out.println("만원 = "  + man + "장");
		System.out.println("천원 = "  + chon + "장");
		System.out.println("백원 = "  + baek + "개");
		System.out.println("십원 = "  + sip + "개");
		*/
	}
}
