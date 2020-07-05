import java.io.*;
public class ArrayExam10{
	public static void main(String[] ar)throws IOException{
		/*
		10. 숫자를 입력받아서 2진수로 바꾸어주는 프로그램을 작성해 보세요.
		단, 숫자는 0에서 255까지만 입력 합니다.

		숫자 = 124
		2진수 = 0111 1100
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[8];
		int num = 0;
		while(true){
			System.out.print("정수 (0 ~ 255 사이) 입력 : ");
			num  = Integer.parseInt(br.readLine());
			if(num < 0 || num > 255){
				System.out.println("0 ~ 255사이의 정수만 입력하세요.");
				System.exit(0);
			}else{
				for(int i = 0; i <= arr.length; i++){
					int temp = num;
					for(int k = 0; k < arr.length; k++) {			
						arr[k] = (temp % 2);   // 0 , 1
						temp = temp / 2 ;
					}			
				}
			}
			System.out.print(num + "의 2진수 : ");
			for (int j = arr.length-1; j >= 0; j--){
				if (j == 3){
					System.out.print("  ");
				}
				System.out.print(arr[j]);
			}
			System.out.println();
		}
	}
}