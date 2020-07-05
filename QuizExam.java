/**
   게임을 시작하면 일단 게임머니를 1000원을 줍니다.
   그리고 아래와 같이 진행합니다.

   1. 주먹
   2. 가위
   3. 보자기
   0. 게임종료
   당신의 선택 : ?

   배팅금액 : ???

   결과를 보려면 Enter를 치세요^^.

   You : 주먹      Computer : 가위
   You Win !!!
   잔액 : ???
*/
import java.io.*;
public class QuizExam{
	public static void main(String[] ar)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int money = 1000;
		int rn = 0;
		int num = 0;
		int batting = 0;
		int computer = 0;
		String myFick = "";
		String comFick = "";

		while(true){
			System.out.println("*** 도박과 함께 하는 가위바위보 게임***");
			System.out.println("1 : 가위");
			System.out.println("2 : 바위");
			System.out.println("3 : 보자기");
			System.out.println("0 : 게임 종료");
			System.out.print("당신의 선택은 : ");
			num = System.in.read() - 48;
			System.in.read();System.in.read();

			switch(num){
			case 1:
				myFick = "가위";
				System.out.println("가위를 선택하셨습니다.");
				System.out.print("배팅 금액 : ");
				batting = Integer.parseInt(br.readLine());
				if (batting > money){
					System.out.println("잔액이 부족합니다. 남은 잔액만큼만 배팅이 이루어졌습니다.");
					System.out.println("현재 잔액 : " + money + "원이 배팅되었습니다.");
					batting = money;
				}

				computer = (int)(Math.random() * 3) + 1;
				if(computer == 1){
					comFick = "가위";
				}else if(computer == 2){
					comFick = "바위";
				}else if(computer == 3){
					comFick = "보자기";
				}

				System.out.print("결과를 보려면 Enter를 치세요.");
				System.in.read();System.in.read(); // Enter값 처리.
				if(myFick == comFick){
					System.out.println("====게임 결과===============================");
					System.out.println("User\t\tComputer");
					System.out.println(myFick + "\t\t" + comFick);
					System.out.println("무승부입니다.");
					System.out.println("잔액 : " + money);
					System.out.println("============================================");
					continue;
				} else if (computer == 2){
					System.out.println("====게임 결과===============================");
					System.out.println("User\t\tComputer");
					System.out.println(myFick + "\t\t" + comFick);
					System.out.println("Computer Win!!");
					System.out.println("잔액 : " + money);
					System.out.println("============================================");
					continue;
				} else{
					System.out.println("====게임 결과===============================");
					System.out.println("User\t\tComputer");
					System.out.println(myFick + "\t\t" + comFick);
					System.out.println("User Win!!");
					money += batting;
					System.out.println("잔액 : " + money);
					System.out.println("============================================");
					continue;
				}

			case 2:
				myFick = "바위";
				System.out.println("바위를 선택하셨습니다.");
				System.out.print("배팅 금액 : ");
				batting = Integer.parseInt(br.readLine());
				if (batting > money){
					System.out.println("잔액이 부족합니다. 남은 잔액만큼만 배팅이 이루어졌습니다.");
					System.out.println("현재 잔액 : " + money + "원이 배팅되었습니다.");
					batting = money;
				} 
				computer = (int)(Math.random() * 3) + 1;
				if(computer == 1){
					comFick = "가위";
				}else if(computer == 2){
					comFick = "바위";
				}else if(computer == 3){
					comFick = "보자기";
				}

				System.out.print("결과를 보려면 Enter를 치세요.");
				System.in.read();System.in.read(); // Enter값 처리.
				if (myFick == comFick){
					System.out.println("====게임 결과===============================");
					System.out.println("User\t\tComputer");
					System.out.println(myFick + "\t\t" + comFick);
					System.out.println("무승부입니다.");
					System.out.println("잔액 : " + money);
					System.out.println("============================================");
					continue;
				} else if (computer == 1){
					System.out.println("====게임 결과===============================");
					System.out.println("User\t\tComputer");
					System.out.println(myFick + "\t\t" + comFick);
					System.out.println("User Win!!");
					money += batting;
					System.out.println("잔액 : " + money);
					System.out.println("============================================");
					continue;
				}else{
					System.out.println("====게임 결과===============================");
					System.out.println("User\t\tComputer");
					System.out.println(myFick + "\t\t" + comFick);
					System.out.println("Computer Win!!");
					System.out.println("잔액 : " + money);
					System.out.println("============================================");
					continue;
				}
			case 3:
				myFick = "보자기";
				System.out.println("보자기를 선택하셨습니다.");
				System.out.print("배팅 금액 : ");
				batting = Integer.parseInt(br.readLine());
				if (batting > money){
					System.out.println("잔액이 부족합니다. 남은 잔액만큼만 배팅이 이루어졌습니다.");
					System.out.println("현재 잔액 : " + money + "원이 배팅되었습니다.");
					batting = money;
				}

				computer = (int)(Math.random() * 3) + 1;
				if(computer == 1){
					comFick = "가위";
				}else if(computer == 2){
					comFick = "바위";
				}else if(computer == 3){
					comFick = "보자기";
				}

				System.out.print("결과를 보려면 Enter를 치세요.");
				System.in.read();System.in.read(); // Enter값 처리.
				if (myFick == comFick){
					System.out.println("====게임 결과===============================");
					System.out.println("User\t\tComputer");
					System.out.println(myFick + "\t\t" + comFick);
					System.out.println("무승부입니다.");
					System.out.println("잔액 : " + money);
					System.out.println("============================================");
					continue;
				} else if (computer == 1){
					System.out.println("====게임 결과===============================");
					System.out.println("User\t\tComputer");
					System.out.println(myFick + "\t\t" + comFick);
					System.out.println("Computer Win!!");
					System.out.println("잔액 : " + money);
					System.out.println("============================================");
					continue;
				} else{
					System.out.println("====게임 결과===============================");
					System.out.println("User\t\tComputer");
					System.out.println(myFick + "\t\t" + comFick);
					System.out.println("User Win!!");
					money += batting;
					System.out.println("잔액 : " + money);
					System.out.println("============================================");
					continue;
				}
			case 0:
				System.out.print("정말로 종료하시겠습니까?? (y/n) : ");
				char ans = (char)System.in.read();
				System.in.read();System.in.read();
				if(ans == 'y' || ans == 'Y'){
					System.out.println("게임을 종료합니다.");
					System.exit(0);
				} else if(ans == 'n' || ans == 'N'){
					continue;
				} else {
					System.out.println("번호를 잘못 입력하셨습니다.");
					System.exit(0);
				}
			}
		}
	}
}