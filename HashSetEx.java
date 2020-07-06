import java.util.*;
class AData{

	int x;
	int y;

	public AData(int x, int y){
		this.x = x;
		this.y = y;
	}
	public void disp(){
		System.out.println("x = " + x + ", y = " + y);
	}
}
public class HashSetEx{
	public static void main(String[] args) {
		AData ap = new AData(10,20);
		AData bp = new AData(20,30);
		AData cp = new AData(30,40);
		HashSet<AData> hs = new HashSet<AData>(); // HashSet 생성.
		hs.add(ap); // add() : 제네릭 타입으로 넘어온 객체가 Set구조에 없다면 추가하고 true를 반환한다.
		hs.add(bp);
		hs.add(cp);
		System.out.println("해쉬코드 : " + hs.hashCode()); 
		System.out.println("총 데이터 크기 : " + hs.size());
		// Iterator : Collection에서 사용하며 데이터를 읽어주는 역할.
		Iterator<AData> it = hs.iterator(); // iterator() : 현 Set구조의 요소들을 순서대로 처리하기 위해 Iterator객체로 반환한다.
		while(it.hasNext()){ // hasNext() : 현재 위치에서 다음에 데이터가 있으면 true, 없으면 false 반환.
			it.next().disp(); // next() : 다음에 있는 데이터를 가져오는 메서드.
		}
	}
}
