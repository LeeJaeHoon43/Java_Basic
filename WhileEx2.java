import java.io.*;
public class WhileEx2{ // �޷� ������� ���� ����ϱ�
	public static void main(String[] ar)throws IOException{
		int i = 1;
		while(i <= 31){
			if(i % 7 == 0){
				System.out.println(i);
			} else{
				System.out.print(i + "\t");
			}
			i++;
		}
		System.out.println();
	}
}