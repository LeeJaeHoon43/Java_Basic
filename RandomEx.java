import java.util.*;
import static java.lang.System.out;
public class RandomEx{
	public static void main(String[] args) {
		/*
		# Random Ŭ����.
		- �Ϸ��� ������ �߻��Ѵ�.
		- int��, float�� ���� ������ �߻� �����ϸ� ������ ���� �߻��� Ư�� ������ �д�.
		- �ε��Ҽ����� ������ �Ǽ������� ������ 0.0���� 1.0������ ���� �޵��� �Ǿ� �ִ�.
		
		 * Random Ŭ������ �ֿ� �޼���.
		 1. nextDouble() : double�� �ڷῡ ���� �ڷḦ ��ȯ�ϰ� �Ǹ�, 0.0 ~ 1.0������ ���� ��ȯ�ȴ�.
		 2. nextFloat() : float�� �ڷῡ ���� �ڷḦ ��ȯ�ϰ� �Ǹ�, 0.0 ~ 1.0������ ���� ��ȯ�ȴ�.
		 3. nextGaussian() : ��� 0.0, ǥ������ 1.0�� Gauss������ double���� ������ �߻��Ѵ�.
		 4. nextInt() : int�� �ڷ� ��ü���� ������ �߻��Ͽ� ��ȯ�Ѵ�.
		 5. nextInt(int n) : 0���� ���ڷ� ���޵� ���� �������� ������ �Ͽ� ������ �߻��Ͽ� ��ȯ�Ѵ�.
		 6. nextLong() : long���� ���� ��ü���� ������ �߻��Ͽ� ��ȯ�Ѵ�.
		 7. setSeed(long seed) : ���ڷ� ���޵� long���� seed�� ���� �߻����� ���� seed�� �缳���Ѵ�.
		*/
		String[] lesson = {"Java Beg", "JSP", "XML&Java", "EJB",};
		Random r1 = new Random();
		int index = r1.nextInt(4);
		out.println("���ð��� : " + lesson[index]);
	}
}