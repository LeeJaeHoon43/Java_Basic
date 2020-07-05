import java.io.*;
public class ArrayExam12{
	public static void main(String[] ar)throws IOException{

		/*
		12. 아래와 같이 실행되는 야구게임을 만들어 봅시다.
		단, 숫자는 무조건 3자리이며, 컴퓨터가 랜덤하게 만들어 냅니다.
		(예를 들어 컴퓨터가 863이란 숫자를 만들어 낸 경우를 가정하겠습니다.)
		게임을 실행 하시겠습니까? (y/n) : y
		숫자를 생성했습니다.
		당신이 생각하는 숫자 = 357
		1 구 : 1볼
		당신이 생각하는 숫자 = 835
		2 구 : 1스트라이크 1볼
		// 이런 식으로 계속해서 10구까지 진행합니다.
		// 만약 10구 이내에 맞추지 못한다면 실패했다는 메시지를 출력하고 종료합니다.
		당신이 생각하는 숫자 = 863
		정답입니다.^^
		*/

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("게임을 실행 하시겠습니까?(y/n) : ");
		String yesOrNo = br.readLine();

		boolean gameStart = false;

		if(yesOrNo.equals("y") || yesOrNo.equals("Y")){
			gameStart = true;
		} 
		
		// Math.random() -> 0.0 ~1.0사이의 난수 발생 

		if(gameStart){
			int randomNum[] = new int[3]; 
			for(int i = 0 ; i < randomNum.length; i++){
				randomNum[i] = (int)(Math.random()*9)+1 ;
			}
			// 컴퓨터 숫자 생성완료. 
			// System.out.println("컴퓨터가 만든 숫자 = " + randomNum[0] + "" +randomNum[1] +""+randomNum[2] );

			int ballCount = 0 ;
			int strikeCount = 0; 
			boolean out = false; 
			
			for(int i = 0 ; i < 10 ; i ++){

				ballCount = 0;
				strikeCount =0;
				out = false; 
				int outCount = 0; 

				System.out.print("당신이 생각하는 숫자 = ");
				int tempNum = Integer.parseInt(br.readLine());
				int myNum[] = new int[3];
				myNum[0] = tempNum/100;
				tempNum = tempNum - (tempNum/100)*100;
				myNum[1] = tempNum/10;
				tempNum = tempNum - (tempNum/10)*10;
				myNum[2] = tempNum; 
				// myNum 배열에 내가 생각하는 숫자 생성완료.
				
				System.out.println("내가 생성한 숫자 = " + myNum[0] +""+myNum[1] +""+myNum[2]);

				//컴퓨터가 만든 숫자와 내가 생각한 숫자 비교 
				// 스트라이크 카운트 
				for(int j = 0; j < 3 ; j++){
					if(randomNum[j]==myNum[j]){
						strikeCount ++;
						
					} else {
						//볼카운트 
						for(int k = 0 ; k < 3 ; k++){
							if(randomNum[j] == myNum[k]){
								ballCount++;
								
							} else { // out을 확인하기위해서는 9개의 경우의수가 모두 달라야함 
								outCount++ ;
								if(outCount == 9){
									out = true;
								}
							}
						}
					}
				}
				if(strikeCount == 3){ // 맞춘경우 
					System.out.println("정답입니다. ^^");
					System.exit(0);
				}
				
				if(out == true ){ // 아웃인 경우와 아닌경우 
					System.out.println((i+1)+" 구 : 아웃");
				} else {
					System.out.println((i+1)+" 구 : " +strikeCount+"스트라이크 " + ballCount + "볼");
				}
			}
			System.out.println("실패하셨습니다.");
		}
	}
}