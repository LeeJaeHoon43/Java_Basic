import java.io.*;
public class Ex12{
	public static void main(String[] args)throws IOException{
		/*
		12. 1 ~ 100사이의 난수 2개 발생하여 출력(a, b)합니다.
		답(dap)을 입력받아 맞는지 틀리는지 출력하는 프로그램을 작성하세요. 한 문제당 10점(score)처리하여 10문제를 풉니다.
		아래의 예시처럼 동작하도록 작성합니다.
		[1] 23 + 56 = 70
		틀렸습니다. 정답은 79 입니다.
		[2] 13 + 45 = 58
		정답입니다.
		// 같은 방식으로 계속해서 10회까지 진행합니다.
		[10] 10 + 25 = 35
		정답입니다.
		당신의 점수는 XX점입니다.
		계속하시겠습니까? (y/n) : n //만약 여기서 y를 입력하면 다시 10회 반복한다.
		프로그램을 종료합니다.
		*/
		int point = 0;
		while(true){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			for(int i = 1; i <= 10; i++){ 
				int num1 = ((int)(Math.random() * 100)+1); // 1 ~ 100사이의 난수. 
				int num2 = ((int)(Math.random() * 100)+1); // 1 ~ 100사이의 난수.
				System.out.print("["+ i +"] "+num1 + " + " + num2 + " = ");
				int dap = Integer.parseInt(br.readLine());
				
				if((num1 + num2) == dap){
					System.out.println("정답입니다.");
					point += 10;
				}else{
					System.out.println("틀렸습니다. 정답은 " + (num1+num2) + "입니다.");
				}
				System.out.println();
			}
			System.out.println("당신의 점수는 "+ point +"입니다.");
			System.out.print("계속하시겠습니까? (y/n) : ");
			char gono = (char)System.in.read();
			System.in.read();System.in.read();
			if(gono == 'y' || gono == 'Y'){
				point = 0;
				continue;
			}else if(gono =='n' || gono == 'N'){
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
			}else{
				System.out.println("잘못 입력하였습니다.");
				System.exit(0);
			}
		}
	}
}
