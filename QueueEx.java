import java.util.*;
import static java.lang.System.out;
public class QueueEx{
	public static void main(String[] args) {
		String[] item = {"소나타", "렉스톤", "재규어"}; // 배열 생성.
		LinkedList<String> q = new LinkedList<String>(); // LinkedList 생성.
		for(String n : item){
			q.offer(n); // 요소 추가. offer() : 전달된 요소를 마지막 요소로 추가한다.
		}
		out.println("q의 크기 : " + q.size());
		String data = "";
		while((data = q.poll()) != null){ // poll() : 가장 첫 번째 요소를 반환한 후 삭제한다.
			out.println(data + "삭제!");
			out.println("q의 크기 : " + q.size());
		}
	}
}
