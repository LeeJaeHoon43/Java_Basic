import java.io.*;
public class ArrayExam10{
	public static void main(String[] ar)throws IOException{
		/*
		10. ���ڸ� �Է¹޾Ƽ� 2������ �ٲپ��ִ� ���α׷��� �ۼ��� ������.
		��, ���ڴ� 0���� 255������ �Է� �մϴ�.

		���� = 124
		2���� = 0111 1100
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[8];
		int num = 0;
		while(true){
			System.out.print("���� (0 ~ 255 ����) �Է� : ");
			num  = Integer.parseInt(br.readLine());
			if(num < 0 || num > 255){
				System.out.println("0 ~ 255������ ������ �Է��ϼ���.");
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
			System.out.print(num + "�� 2���� : ");
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