import java.io.*;
public class DiceGame{
	public static void main(String[] ar)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rn; // 랜덤 숫자. (1 ~ 6)
		int num; // 메뉴 번호.
		char ans; // 대답.
		int coin = 1000; // 게임 머니.
		int batting = 0; // 배팅 금액.
		boolean status = false;

		while(true){
			System.out.println("*** 주사위 도박 ***");
			System.out.println("경고!! 지나친 도박은 파산을 불러옵니다.");
			System.out.println("1. 홀수");
			System.out.println("2. 짝수");
			System.out.println("0. 게임 종료");
			System.out.print("배팅 숫자 선택 : ");
			num = System.in.read() - 48;
			System.in.read();System.in.read();

			if (num != 1 && num != 0 && num != 2){
				System.out.println("0~2의 메뉴에 대한 번호를 입력하세요");
				continue;
			}

			if (coin <= 0){
				System.out.println("파산입니다.");
				System.exit(0);
			}

			switch(num){
			case 2:
				rn = (int)(Math.random()*6)+1;
				System.out.print("배팅 금액을 입력하세요 : ");
				batting = Integer.parseInt(br.readLine());
				if (batting > coin){
					System.out.println("잔액이 부족합니다. 남은 잔액만큼만 배팅이 이루어졌습니다.");
					System.out.println("현재 잔액 : " + coin + "원이 배팅되었습니다.");
					batting = coin;
				}
				System.out.println("주사위를 던지려면 Enter를 치세요.");
				System.out.print("주사위가 던져집니다.");
				System.out.println();
				System.in.read();System.in.read(); // Enter값 처리.
				if(rn % 2 == 0){
					System.out.println("주사위 값 : " + rn);
					System.out.println("You Win!!");
					coin += batting;
					System.out.println("잔액 : " + coin);
					System.out.println();
					continue;
				}else{
					System.out.println("주사위 값 : " + rn);
					System.out.println("You Loose!!");
					coin -= batting;
					System.out.println("잔액 : " + coin);
					System.out.println();
					continue;
				}
			case 1: 
				rn = (int)(Math.random()*6)+1;
				System.out.print("배팅 금액을 입력하세요 : ");
				batting = Integer.parseInt(br.readLine());
				if (batting > coin){
					System.out.println("잔액이 부족합니다. 남은 잔액만큼만 배팅이 이루어졌습니다.");
					System.out.println("현재 잔액 : " + coin + "원이 배팅되었습니다.");
					batting = coin;
				}
				System.out.println("주사위를 던지려면 Enter를 치세요.");
				System.out.print("주사위가 던져집니다.");
				System.in.read();System.in.read(); // Enter값 처리.
				System.out.println();
				if(rn % 2 == 1){
					System.out.println("주사위 값 : " + rn);
					System.out.println("You Win!!");
					coin += batting;
					System.out.println("잔액 : " + coin);
					System.out.println();
					continue;
				}else{
					System.out.println("주사위 값 : " + rn);
					System.out.println("You Loose!!");
					coin -= batting;
					System.out.println("잔액 : " + coin);
					System.out.println();
					continue;
				}
			case 0:
				System.out.print("정말로 종료하시겠습니까?? (y/n) : ");
				ans = (char)System.in.read();
				System.in.read();System.in.read();
				if(ans == 'y' || ans == 'Y'){
					System.out.println();
					System.out.println("게임을 종료합니다.");
					System.exit(0);
				} else if(ans == 'n' || ans == 'N'){
					continue;
				} else {
					System.out.println("번호를 잘못 입력하셨습니다.");
					System.out.println();
					continue;
				}
			}
		}
	}
}
