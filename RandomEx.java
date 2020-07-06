import java.util.*;
import static java.lang.System.out;
public class RandomEx{
	public static void main(String[] args) {
		/*
		# Random 클래스.
		- 일련의 난수를 발생한다.
		- int형, float형 등의 난수가 발생 가능하며 정수형 난수 발생은 특정 범위가 넓다.
		- 부동소수점을 가지는 실수형들의 난수는 0.0에서 1.0사이의 값을 받도록 되어 있다.
		
		 * Random 클래스의 주요 메서드.
		 1. nextDouble() : double형 자료에 따른 자료를 반환하게 되며, 0.0 ~ 1.0사이의 값이 반환된다.
		 2. nextFloat() : float형 자료에 따른 자료를 반환하게 되며, 0.0 ~ 1.0사이의 값이 반환된다.
		 3. nextGaussian() : 평균 0.0, 표준편차 1.0의 Gauss분포의 double형의 난수를 발생한다.
		 4. nextInt() : int형 자료 전체에서 난수를 발생하여 반환한다.
		 5. nextInt(int n) : 0부터 인자로 전달된 값의 전까지를 범위로 하여 난수를 발생하여 반환한다.
		 6. nextLong() : long형의 범위 전체에서 난수를 발생하여 반환한다.
		 7. setSeed(long seed) : 인자로 전달된 long형인 seed를 난수 발생기의 시작 seed로 재설정한다.
		*/
		String[] lesson = {"Java Beg", "JSP", "XML&Java", "EJB",};
		Random r1 = new Random();
		int index = r1.nextInt(4);
		out.println("선택과목 : " + lesson[index]);
	}
}