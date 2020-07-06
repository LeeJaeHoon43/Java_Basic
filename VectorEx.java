import java.util.*;

class AA{
	// 멤버
	int a;
	// 메서드
	AA(int a){
		this.a = a;
	}
}
public class VectorEx{
	public static void main(String[] args) {
		Vector vc = new Vector();
		vc.add(new AA(10)); // vc 0 vc 0
		vc.add(new AA(20)); // vc 1 vc 2
		vc.add(new AA(30)); // vc 2 vc 3
		vc.add(new AA(10)); // vc 3 vc 4
		vc.add(new AA(40)); // vc 4 vc 5
		vc.add(new AA(50)); // vc 5 vc 6
		vc.add(1, new AA(15)); //    vc 1
		
		for(int i = 0; i < vc.size(); i++){
			AA ap = (AA)vc.elementAt(i);
			System.out.println("삭제 전 : " + ap.a);
		}
		System.out.println("======================");
		vc.removeElementAt(4); // 벡터 vc의 4번째 인덱스의 값 삭제.
		for(int i = 0; i < vc.size(); i++){
			AA ap = (AA)vc.elementAt(i);
			System.out.println("삭제 후 : " + ap.a);
		}
	}
}