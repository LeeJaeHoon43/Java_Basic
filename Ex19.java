import java.io.*;
public class Ex19{
	public static void main(String[] args)throws IOException{
		/*
		19. ���� ���ĺ��� �Է¹޾Ƽ� �빮�� �̸� �ҹ��ڷ� �ҹ����̸� �빮�ڷ� �ٲپ��ִ� ���α׷��� �ۼ��ϼ���. (System.in.read()�� if~else ���� �̿��� ��)
		
		[����]
		���ĺ��Է� = A
        ����� ���ĺ��� a�Դϴ�. 
		�Ǵ�
		���ĺ��Է� = a
        ����� ���ĺ��� A�Դϴ�.
		*/

		System.out.print("���ĺ� �Է� = ");
		char alpha = (char)System.in.read();
		System.in.read();System.in.read();

		if(alpha >= 'A' && alpha <= 'Z'){
			alpha += 32;
		}else if(alpha >= 'a' && alpha <= 'z'){
			alpha -= 32;
		}else{
			System.out.println("���ĺ��� �Է��ؾ� �մϴ�");
			return;
		}
		System.out.println("����� ���ĺ��� " + alpha);

		/*

		System.out.print("���ĺ��Է� = " );
		byte a = (byte)System.in.read();
		if( a > 95 ){
			a = (byte)(a - 32);
			System.out.println("����� ���ĺ��� " + (char)a + "�Դϴ�.");
		} else{
			System.out.println("����� ���ĺ��� " + (char)a + "�Դϴ�.");
		}


		
		char a;
		System.out.print("���ĺ� �Է�: ");
		a = (char)System.in.read();
		if(65<=a && a<=90){
			a +=32;
		}else if(97<=a && a<=122){
			a -=32;
		}
		System.out.println(a); */
	}
}
