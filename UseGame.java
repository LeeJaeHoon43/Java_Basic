abstract class Unit{ // 추상 클래스 선언.
	// 멤버 변수.
	int x, y;
	
	// 추상 메서드.
	abstract void move(int x, int y);
	abstract void stop();
	abstract void message();
}

class Marine extends Unit{
	// 추상 메서드 오버라이딩.
	void move(int x, int y){
		System.out.println("마린의 위치 이동 좌표는 x : " + x + ", y : " + y + " 입니다.");
	}
	void stop(){
		System.out.println("마린이 대기 상태에 있습니다.");
	}
	void message(){
		System.out.println("Message : Standing back");
	}
	void stimPack(){
		System.out.println("마린이 스팀팩을 사용한다.");
	}
}

class SiegeTank extends Unit{
	// 추상 메서드 오버라이딩.
	void move(int x, int y){
		System.out.println("Move it! Move it! SiageTank => x : " + x + ", y : " + y);
	}
	void stop(){
		System.out.println("Destination?");
	}
	void message(){
		System.out.println("Message : Go, Siege!");
	}
	void changeMode(){
		System.out.println("Yes, Sir!");
	}
}
class Dropship extends Unit{
	// 추상 메서드 오버라이딩.
	void move(int x, int y){
		System.out.println("Take it slow. Droshp => x : " + x + ", y : " + y);
	}
	void stop(){
		System.out.println("In the by, by, by, by");
	}
	void message(){
		System.out.println("Message : Can I take orders");
	}
	
}
public class UseGame{
	public static void main(String[] args){
		Unit[] ref = new Unit[3]; // 추상클래스 배열 객체 생성.
		ref[0] = new Marine();
		ref[1] = new SiegeTank();
		ref[2] = new Dropship();
		for(int i = 0; i < ref.length; i++){
			System.out.println("=======================================================");
			// 모든 유닛을 이동시키기.
			ref[i].move(100, 200);
			ref[i].message();
			System.out.println("=======================================================");
		}
	}
}
abstract class Unit{ // 추상 클래스 선언.
	// 멤버 변수.
	int x, y;
	
	// 추상 메서드.
	abstract void move(int x, int y);
	abstract void stop();
	abstract void message();
}

class Marine extends Unit{
	// 추상 메서드 오버라이딩.
	void move(int x, int y){
		System.out.println("마린의 위치 이동 좌표는 x : " + x + ", y : " + y + " 입니다.");
	}
	void stop(){
		System.out.println("마린이 대기 상태에 있습니다.");
	}
	void message(){
		System.out.println("Message : Standing back");
	}
	void stimPack(){
		System.out.println("마린이 스팀팩을 사용한다.");
	}
}

class SiegeTank extends Unit{
	// 추상 메서드 오버라이딩.
	void move(int x, int y){
		System.out.println("Move it! Move it! SiageTank => x : " + x + ", y : " + y);
	}
	void stop(){
		System.out.println("Destination?");
	}
	void message(){
		System.out.println("Message : Go, Siege!");
	}
	void changeMode(){
		System.out.println("Yes, Sir!");
	}
}
class Dropship extends Unit{
	// 추상 메서드 오버라이딩.
	void move(int x, int y){
		System.out.println("Take it slow. Droshp => x : " + x + ", y : " + y);
	}
	void stop(){
		System.out.println("In the by, by, by, by");
	}
	void message(){
		System.out.println("Message : Can I take orders");
	}
	
}
public class UseGame{
	public static void main(String[] args){
		Unit[] ref = new Unit[3]; // 추상클래스 배열 객체 생성.
		ref[0] = new Marine();
		ref[1] = new SiegeTank();
		ref[2] = new Dropship();
		for(int i = 0; i < ref.length; i++){
			System.out.println("=======================================================");
			// 모든 유닛을 이동시키기.
			ref[i].move(100, 200);
			ref[i].message();
			System.out.println("=======================================================");
		}
	}
}
