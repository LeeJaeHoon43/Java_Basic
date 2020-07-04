import java.io.*;
public class Ex13{
	public static void main(String[] args)throws IOException{
	/*
	13. 1 ~ 200사이의 난수를 발생하여 데이터를 입력받아서 발생한 숫자를 맞추는 프로그램을 아래와 같이 작성해 보세요. 
		단 10회의 기회를 제공하고 10회안에 맞추지 못할 경우 틀린 것으로 간주하여 게임을 종료하고 계속 진행할 것인지를 묻도록 한다.
		** 1 ~ 200 사이의 난수를 발생하였습니다. **
		** 맞추어 보세요. ** (예를 들어 발생한 숫자가 80이라고 가정하면)
		데이터 입력 : 50
		컴퓨터 발생한 숫자가 더 큽니다.
		데이터 입력 : 100
		컴퓨터 발생한 숫자가 더 작습니다.
		// 이렇게 10회의 기회를 제공한다.
		데이터 입력 : 80
		정답입니다. XX번만 에 맞추셨습니다.
		// 만약 10회 안에 못 맞출 경우 실패하였다는 메시지를 출력하고
		// 아래처럼 계속 진행할 것인지 여부를 물어본다.
		계속하시겠습니까? (y/n) : n
		//만약 여기서 y를 입력하면 다시 게임을 진행한다.
		프로그램을 종료합니다.
	*/
		int count = 0;
		while(true){
			System.out.println("*** 1 ~ 200 사이의 난수를 발생하였습니다. ***");
			System.out.println("*** 맟추어 보세요. ***");
			int rn = ((int)(Math.random() * 200) + 1);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			for(int c = 1; c <= 10; c++){
				System.out.print("정답 입력 : ");
				int myInput = Integer.parseInt(br.readLine());

				if(myInput < 1 || myInput > 200){
					System.out.println("1 ~ 200범위의 정수만 입력하시오.");
					continue;
				}

				if(rn > myInput){
					System.out.println("컴퓨터가 발생시킨 숫자가 더 큽니다.");
					count++;
					continue;
				}else if(rn < myInput){
					System.out.println("컴퓨터가 발생시킨 숫자가 더 작습니다.");
					count++;
					continue;
				} else if(rn == myInput){
					System.out.println("정답입니다."+c+"번만에 맞추셨습니다.");
					System.out.print("계속하시겠습니까? (y/n) : ");
					char gono = (char)System.in.read();
					System.in.read();System.in.read();
					if(gono == 'y'){
						break;
					}else if(gono =='n'){
						System.out.println("프로그램을 종료합니다");
						System.exit(0);
					}else{
						System.out.println("잘못 입력하였습니다.");
					}
				}
			}
			System.out.print("계속하시겠습니까? (y/n) : ");
			char gono = (char)System.in.read();
			System.in.read();System.in.read();
			if(gono == 'y'){
				continue;
			}else if(gono =='n'){
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
			}else{
				System.out.println("잘못 입력하였습니다.");
			}
		}
	}
}