import java.io.*;
public class BubbleSort{
	public static void main(String[] ar)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0;
		System.out.print("숫자 개수 : ");
		num = Integer.parseInt(br.readLine());
		int[] number = new int[num];
		
		for(int i = 0; i < num; i++){
			System.out.print("숫자"+ (i + 1) + " : ");
			number[i] = Integer.parseInt(br.readLine());
		}
		System.out.println();


		for (int i = 1 ; i <= num; i++){
			for (int j = 0 ; j < num - i ; j++){
				if (number[j] > number[j+1]){
					int t = number[j];
					number[j] = number[j+1];
					number[j+1] = t;
				}
			}
		}
		System.out.print("버블 정렬 결과 : "); 
		for(int k = 0;k < number.length;k++){
			System.out.print(number[k]+ " ");
		}
		System.out.println();
	}
}