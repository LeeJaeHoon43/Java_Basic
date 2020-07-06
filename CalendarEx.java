import java.util.Calendar;
import static java.lang.System.out;
public class CalendarEx{
	public static void main(String[] args) {
		/*
		# Calendar Ŭ����.
		- �Ϲ����� �޷�, �ð��� ����� ����. 1970�� 1�� 1�� 0�� 0�� 0�� ����.
		
		* �����.
		- Calendar now = Calendar.getInstance();
		- value = now.get(CalendarŬ������ ��� ��)
		- new�� �ƴ� getInstance() �޼��带 ���� ��ü�� �����Ѵ�. 
		
		* Calendar Ŭ������ ��� ��.
		- �⵵�� ��� ���� ��� : Calendar.YEAR
		- ���� ��� ���� ��� : Calendar.MONTH
		- ���� ��� ���� ��� : Calendar.DATE �Ǵ� Calendar.DAY_OF_MONTH
		- �ø� ��� ���� ��� : Calendar.HOUR
		- ���� ��� ���� ��� : Calendar.MINUTE
		- �ʸ� ��� ���� ��� : Calendar.SECOND
		*/
		StringBuffer sb = new StringBuffer("1���� ");
		Calendar now = Calendar.getInstance();
		int week_yy = now.get(now.WEEK_OF_YEAR);
		int yy = now.get(now.YEAR);
		int mm = now.get(now.MONTH)+1; // 1���� 0�� ����Ѵ�.
		int dd = now.get(now.DAY_OF_MONTH);
		sb.append(week_yy);
		sb.append("��°�� ");
		sb.append(yy);
		sb.append("�� ");
		sb.append(mm);
		sb.append("�� ");
		sb.append(dd);
		sb.append("�� ");
		out.println(sb.toString());
	}
}