import java.util.*;
import static java.lang.System.out;
public class MapEx{
	public static void main(String[] args) {
		String[] msg = {"베를린", "프랑크푸르트", "도르트문트", "뮌헨", "함부르크"}; // 배열 생성.
		HashMap<Integer,String> map = new HashMap<Integer,String>(); // HashMap<String> 생성.
		for(int i = 0; i < msg.length; i++){
			map.put(i, msg[i]); // 맵에 저장. put()메서드 : 인자로 전달된 Key와 value를 현재 맵에 저장한다.
		}
		Set<Integer> keys = map.keySet(); // 맵에 저장되고 있는 key들을 Set 인터페이스로 반환한다.
		for(Integer n : keys){
			out.println(map.get(n)); // 맵에서 읽어오기. 맵에 있는 키 값들을 출력한다. 
		}
	}
}
