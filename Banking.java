import java.io.*;
public class Banking{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		NewAccount na = new NewAccount("홍길동", "1111");

		String strWork = null;
		System.out.print("비밀번호 : ");
		strWork = br.readLine();
		if(!na.passCheck(strWork)){ // 비밀번호가 맞지 않으면,
			System.out.println("비밀번호 오류");
			System.exit(0);
		}

		do{
			System.out.println("\n\n작업 내용을 선택하세요.");
			System.out.println("=====================================");
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 잔고 확인");
			System.out.println("4. 비밀번호 변경");
			System.out.println("0. 종료");
			System.out.println("=====================================");	
			System.out.print("작업 내용을 선택하세요 : ");
			strWork = br.readLine();

			int switchInt = 0;
			if(strWork != null){
				switchInt = Integer.parseInt(strWork);
			}else{
				System.out.println("작업 내용을 입력하지 않았습니다.");
				System.exit(0);
			}

			switch(switchInt){
				case 0:  break;
				case 1:
					System.out.println("\n=====================================");
					System.out.print("금액을 입력하세요 : ");
					String strdepositIn = br.readLine();
					long depositLong = Long.parseLong(strdepositIn);
					na.deposit(depositLong);
					System.out.println(depositLong + "원이 입금되었습니다.");
					break;
				case 2:
					System.out.println("\n=====================================");
					System.out.print("금액을 입력하세요 : ");
					String withdrawIn = br.readLine();
					long withdrawLong = Long.parseLong(withdrawIn);
					na.withdraw(withdrawLong);
					System.out.println(withdrawLong + "원이 출금되었습니다.");
					break;
				case 3:
					System.out.println("\n=====================================");
					System.out.println(na.getName() + "님의 잔고는 " + na.getBalance() + "원이고, 비밀번호는 "+na.getPass() + "입니다.");
					break;
				case 4:
					System.out.print("변경할 비밀번호를 입력하세요 : ");
					String temp = br.readLine();
					na.setPass(temp);
					System.out.println("비밀번호가 성공적으로 변경되었습니다.");
					break;
				default:
					System.out.print("0 ~ 4 사이 숫자 입력\n");
					break;
			}
		}while(!strWork.equals("0"));
	}
}
