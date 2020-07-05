import java.io.*;
public class ArrayExam12{
	public static void main(String[] ar)throws IOException{

		/*
		12. �Ʒ��� ���� ����Ǵ� �߱������� ����� ���ô�.
		��, ���ڴ� ������ 3�ڸ��̸�, ��ǻ�Ͱ� �����ϰ� ����� ���ϴ�.
		(���� ��� ��ǻ�Ͱ� 863�̶� ���ڸ� ����� �� ��츦 �����ϰڽ��ϴ�.)
		������ ���� �Ͻðڽ��ϱ�? (y/n) : y
		���ڸ� �����߽��ϴ�.
		����� �����ϴ� ���� = 357
		1 �� : 1��
		����� �����ϴ� ���� = 835
		2 �� : 1��Ʈ����ũ 1��
		// �̷� ������ ����ؼ� 10������ �����մϴ�.
		// ���� 10�� �̳��� ������ ���Ѵٸ� �����ߴٴ� �޽����� ����ϰ� �����մϴ�.
		����� �����ϴ� ���� = 863
		�����Դϴ�.^^
		*/

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ ���� �Ͻðڽ��ϱ�?(y/n) : ");
		String yesOrNo = br.readLine();

		boolean gameStart = false;

		if(yesOrNo.equals("y") || yesOrNo.equals("Y")){
			gameStart = true;
		} 
		
		// Math.random() -> 0.0 ~1.0������ ���� �߻� 

		if(gameStart){
			int randomNum[] = new int[3]; 
			for(int i = 0 ; i < randomNum.length; i++){
				randomNum[i] = (int)(Math.random()*9)+1 ;
			}
			// ��ǻ�� ���� �����Ϸ�. 
			// System.out.println("��ǻ�Ͱ� ���� ���� = " + randomNum[0] + "" +randomNum[1] +""+randomNum[2] );

			int ballCount = 0 ;
			int strikeCount = 0; 
			boolean out = false; 
			
			for(int i = 0 ; i < 10 ; i ++){

				ballCount = 0;
				strikeCount =0;
				out = false; 
				int outCount = 0; 

				System.out.print("����� �����ϴ� ���� = ");
				int tempNum = Integer.parseInt(br.readLine());
				int myNum[] = new int[3];
				myNum[0] = tempNum/100;
				tempNum = tempNum - (tempNum/100)*100;
				myNum[1] = tempNum/10;
				tempNum = tempNum - (tempNum/10)*10;
				myNum[2] = tempNum; 
				// myNum �迭�� ���� �����ϴ� ���� �����Ϸ�.
				
				System.out.println("���� ������ ���� = " + myNum[0] +""+myNum[1] +""+myNum[2]);

				//��ǻ�Ͱ� ���� ���ڿ� ���� ������ ���� �� 
				// ��Ʈ����ũ ī��Ʈ 
				for(int j = 0; j < 3 ; j++){
					if(randomNum[j]==myNum[j]){
						strikeCount ++;
						
					} else {
						//��ī��Ʈ 
						for(int k = 0 ; k < 3 ; k++){
							if(randomNum[j] == myNum[k]){
								ballCount++;
								
							} else { // out�� Ȯ���ϱ����ؼ��� 9���� ����Ǽ��� ��� �޶���� 
								outCount++ ;
								if(outCount == 9){
									out = true;
								}
							}
						}
					}
				}
				if(strikeCount == 3){ // ������ 
					System.out.println("�����Դϴ�. ^^");
					System.exit(0);
				}
				
				if(out == true ){ // �ƿ��� ���� �ƴѰ�� 
					System.out.println((i+1)+" �� : �ƿ�");
				} else {
					System.out.println((i+1)+" �� : " +strikeCount+"��Ʈ����ũ " + ballCount + "��");
				}
			}
			System.out.println("�����ϼ̽��ϴ�.");
		}
	}
}