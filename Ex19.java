import java.io.*;
public class Ex19{
	public static void main(String[] args)throws IOException{
		/*
		19. 영어 알파벳을 입력받아서 대문자 이면 소문자로 소문자이면 대문자로 바꾸어주는 프로그램을 작성하세요. (System.in.read()와 if~else 문을 이용할 것)
		
		[예시]
		알파벳입력 = A
        변경된 알파벳은 a입니다. 
		또는
		알파벳입력 = a
        변경된 알파벳은 A입니다.
		*/

		System.out.print("알파벳 입력 = ");
		char alpha = (char)System.in.read();
		System.in.read();System.in.read();

		if(alpha >= 'A' && alpha <= 'Z'){
			alpha += 32;
		}else if(alpha >= 'a' && alpha <= 'z'){
			alpha -= 32;
		}else{
			System.out.println("알파벳을 입력해야 합니다");
			return;
		}
		System.out.println("변경된 알파벳은 " + alpha);

		/*

		System.out.print("알파벳입력 = " );
		byte a = (byte)System.in.read();
		if( a > 95 ){
			a = (byte)(a - 32);
			System.out.println("변경된 알파벳은 " + (char)a + "입니다.");
		} else{
			System.out.println("변경된 알파벳은 " + (char)a + "입니다.");
		}


		
		char a;
		System.out.print("알파벳 입력: ");
		a = (char)System.in.read();
		if(65<=a && a<=90){
			a +=32;
		}else if(97<=a && a<=122){
			a -=32;
		}
		System.out.println(a); */
	}
}
