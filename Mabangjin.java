import java.io.*;
public class MabangjinEx{
	public static void main(String[] ar)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("숫자 = ");
		int num = System.in.read() - 48;
		System.in.read(); System.in.read();
		if(num % 2 == 0){
			System.out.println("홀수만 입력하세요.");
			System.exit(0);
		}else{
			int arr[][] = new int [num][num];
			int i=0; int j = num/2; //1.첫 번째 줄 가운데 열에서 시작
			int count = 1;
			while(count <= (num*num)) {
				arr[i][j] = count;
				int oldI = i;
				int oldJ = j;
				i--; j++; // 2. 오른쪽 대각선 위로 이동
				if(i<0)
					i = num-1; // 3. 행이 음수가 되면 그 열의 최대행으로 이동.
				if(j>num-1)
					j=0; // 4. 열이 배열의 값을 벗어나면 0열로 이동한다.
				if(arr[i][j] != 0) { //5. 이동할 곳에 데이터가 존재하면 
					i = oldI;
					j = oldJ;  // 원래 위치로 이동하고 
					i++;	   // 행울 하나 증가시킨다.
				}
				count++;

			}
			for (i = 0; i < num; i++) {
				for (j = 0; j < num; j++) {
					System.out.print(arr[i][j] + "\t");	
				}
				System.out.println();
			}
		}
	}
}