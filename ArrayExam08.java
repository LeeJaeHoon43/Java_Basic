import java.io.*;
public class ArrayExam08{
	public static void main(String[] ar)throws IOException{
		/*
		8. ���� ���� �� ���� �Է��Ͽ� ���ۺ��� �� ������ ����ϰ� ���� ���ϴ� ���α׷��� �ۼ��ϼ���.
		���࿹�� 1 :
		������ : java ExamEx08 2 20
		2 3 4 5 6 7 8 ... 18 19 20
		�� = 209
		���࿹�� 2 :
		������ : java ExamEx08 20 2
		2 3 4 5 6 7 8 ... 18 19 20
		�� = 209
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] num = new int[2];
		int tot = 0;
		
		for(int i = 0; i < num.length; i++){
			num[i] = Integer.parseInt(ar[i]);
		}

		if (num[0] > num[1]){
			for (int i = num[1]; i <= num[0]; i++ ){
				tot += i;
			}
		}else{
			for(int i = num[0]; i <= num[1]; i++){
				tot += i;
			}
		}
		System.out.println("�� = " + tot);
	}
}