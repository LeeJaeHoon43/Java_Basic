import java.util.Calendar;
import static java.lang.System.out;
public class CalendarEx{
	public static void main(String[] args) {
		/*
		# Calendar 클래스.
		- 일반적인 달력, 시간의 기능을 선언. 1970년 1월 1일 0시 0분 0초 기준.
		
		* 사용방법.
		- Calendar now = Calendar.getInstance();
		- value = now.get(Calendar클래스의 상수 값)
		- new가 아닌 getInstance() 메서드를 통해 객체를 생성한다. 
		
		* Calendar 클래스의 상수 값.
		- 년도를 얻기 위한 상수 : Calendar.YEAR
		- 월을 얻기 위한 상수 : Calendar.MONTH
		- 일을 얻기 위한 상수 : Calendar.DATE 또는 Calendar.DAY_OF_MONTH
		- 시를 얻기 위한 상수 : Calendar.HOUR
		- 분을 얻기 위한 상수 : Calendar.MINUTE
		- 초를 얻기 위한 상수 : Calendar.SECOND
		*/
		StringBuffer sb = new StringBuffer("1년중 ");
		Calendar now = Calendar.getInstance();
		int week_yy = now.get(now.WEEK_OF_YEAR);
		int yy = now.get(now.YEAR);
		int mm = now.get(now.MONTH)+1; // 1월이 0을 기억한다.
		int dd = now.get(now.DAY_OF_MONTH);
		sb.append(week_yy);
		sb.append("주째인 ");
		sb.append(yy);
		sb.append("년 ");
		sb.append(mm);
		sb.append("월 ");
		sb.append(dd);
		sb.append("일 ");
		out.println(sb.toString());
	}
}