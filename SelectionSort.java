import java.io.*;
public class SelectionSort{
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

		for(int i = 0; i <= num-2; i++){
			for(int j = i+1; j <= num-1 ; j++ ){
				if(number[i] > number[j]){
					int t = number[i];
					number[i] = number[j];
					number[j] = t;
				}
			}
		}
		System.out.print("선택 정렬 결과 : "); 
		for(int k = 0;k < number.length;k++){
			System.out.print(number[k]+ " ");
		}
		System.out.println();
	}
}