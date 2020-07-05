abstract class Diagram{
	abstract void draw();
}
// private�� ������ �� ���� ���� : �ڽ� Ŭ������ �������̵� �ؾ� �ϴµ� ���ϰ� �ȴ�.
// static���� ������ �� ���� ���� : ��ü ���̵� ȣ���� �Ǵ� �޼����̹Ƿ� �ݵ�� body�� ���ǵǾ�� Ŭ����.�޼���()�������� ȣ���� �� �ִ�.

class Triangle extends Diagram{
	void draw(){
		System.out.println("�ﰢ���� �׸���.");
	}
}
class Circle extends Diagram{
	void draw(){
		System.out.println("���� �׸���.");
	}
}
class Rectangle extends Diagram{
	void draw(){
		System.out.println("�簢���� �׸���.");
	}
}
/*
# �߻�Ŭ����.
- �ȿ� �߻� �޼��带 �ϳ��� ������ ������ �߻� Ŭ�����̴�.
- �߻� �޼��� : public abstract void AbstractClass( ) : �޼���� abstract�� �����ص� �ȴ�.
- �߻� Ŭ���� : public abstract class AbstractClass{ } : Ŭ������ �߻�Ŭ������ ��� abstract�� �����ϸ� �ȵȴ�.
- �߻� �޼���� ����� �Ǹ� ���� Ŭ�������� �ݵ�� �������̵��� �ؾ� �Ѵ�.
- �߻� �޼��带 ������ ������ ��ü�� ������ �� ����. �����ڵ� ����. �������� �̿��Ͽ� ��ü�� �����Ѵ�.
*/
public class UseDraw{
	public static void main(String[] args){
		Diagram[] ref = new Diagram[3]; // Diagram d = new Diagram; �߻� Ŭ������ ��ü�� ���� �� ���� : ���� �߻�. �迭�� ��ü�� �ƴϴ�.
		// �θ� = �ڽ�, �������� ����
		ref[0] = new Triangle();
		ref[1] = new Circle();
		ref[2] = new Rectangle();
		for(int i = 0; i < ref.length; i++){
			ref[i].draw();
		}
	}
}
