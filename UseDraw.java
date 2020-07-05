abstract class Diagram{
	abstract void draw();
}
// private를 선언할 수 없는 이유 : 자식 클래스가 오버라이드 해야 하는데 못하게 된다.
// static으로 선언할 수 없는 이유 : 객체 없이도 호출이 되는 메서드이므로 반드시 body가 정의되어야 클래스.메서드()형식으로 호출할 수 있다.

class Triangle extends Diagram{
	void draw(){
		System.out.println("삼각형을 그린다.");
	}
}
class Circle extends Diagram{
	void draw(){
		System.out.println("원을 그린다.");
	}
}
class Rectangle extends Diagram{
	void draw(){
		System.out.println("사각형을 그린다.");
	}
}
/*
# 추상클래스.
- 안에 추상 메서드를 하나라도 가지고 있으면 추상 클래스이다.
- 추상 메서드 : public abstract void AbstractClass( ) : 메서드는 abstract를 생략해도 된다.
- 추상 클래스 : public abstract class AbstractClass{ } : 클래스는 추상클래스일 경우 abstract를 생략하면 안된다.
- 추상 메서드는 상속이 되면 하위 클래스에서 반드시 오버라이딩을 해야 한다.
- 추상 메서드를 가지고 있으면 객체를 생성할 수 없다. 생성자도 없다. 다형성을 이용하여 객체를 생성한다.
*/
public class UseDraw{
	public static void main(String[] args){
		Diagram[] ref = new Diagram[3]; // Diagram d = new Diagram; 추상 클래스는 객체를 만들 수 없다 : 에러 발생. 배열은 객체가 아니다.
		// 부모 = 자식, 다형성의 개념
		ref[0] = new Triangle();
		ref[1] = new Circle();
		ref[2] = new Rectangle();
		for(int i = 0; i < ref.length; i++){
			ref[i].draw();
		}
	}
}
