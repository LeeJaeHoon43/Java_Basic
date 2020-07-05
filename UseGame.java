abstract class Unit{ // �߻� Ŭ���� ����.
	// ��� ����.
	int x, y;
	
	// �߻� �޼���.
	abstract void move(int x, int y);
	abstract void stop();
	abstract void message();
}

class Marine extends Unit{
	// �߻� �޼��� �������̵�.
	void move(int x, int y){
		System.out.println("������ ��ġ �̵� ��ǥ�� x : " + x + ", y : " + y + " �Դϴ�.");
	}
	void stop(){
		System.out.println("������ ��� ���¿� �ֽ��ϴ�.");
	}
	void message(){
		System.out.println("Message : Standing back");
	}
	void stimPack(){
		System.out.println("������ �������� ����Ѵ�.");
	}
}

class SiegeTank extends Unit{
	// �߻� �޼��� �������̵�.
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
	// �߻� �޼��� �������̵�.
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
		Unit[] ref = new Unit[3]; // �߻�Ŭ���� �迭 ��ü ����.
		ref[0] = new Marine();
		ref[1] = new SiegeTank();
		ref[2] = new Dropship();
		for(int i = 0; i < ref.length; i++){
			System.out.println("=======================================================");
			// ��� ������ �̵���Ű��.
			ref[i].move(100, 200);
			ref[i].message();
			System.out.println("=======================================================");
		}
	}
}
abstract class Unit{ // �߻� Ŭ���� ����.
	// ��� ����.
	int x, y;
	
	// �߻� �޼���.
	abstract void move(int x, int y);
	abstract void stop();
	abstract void message();
}

class Marine extends Unit{
	// �߻� �޼��� �������̵�.
	void move(int x, int y){
		System.out.println("������ ��ġ �̵� ��ǥ�� x : " + x + ", y : " + y + " �Դϴ�.");
	}
	void stop(){
		System.out.println("������ ��� ���¿� �ֽ��ϴ�.");
	}
	void message(){
		System.out.println("Message : Standing back");
	}
	void stimPack(){
		System.out.println("������ �������� ����Ѵ�.");
	}
}

class SiegeTank extends Unit{
	// �߻� �޼��� �������̵�.
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
	// �߻� �޼��� �������̵�.
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
		Unit[] ref = new Unit[3]; // �߻�Ŭ���� �迭 ��ü ����.
		ref[0] = new Marine();
		ref[1] = new SiegeTank();
		ref[2] = new Dropship();
		for(int i = 0; i < ref.length; i++){
			System.out.println("=======================================================");
			// ��� ������ �̵���Ű��.
			ref[i].move(100, 200);
			ref[i].message();
			System.out.println("=======================================================");
		}
	}
}
