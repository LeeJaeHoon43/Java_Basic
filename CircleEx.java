class PointEx{
	private int x;
	private int y;

	public PointEx(){}

	public PointEx(int x){
		this.x = x;
	}
	
	public PointEx(int x, int y){
		this(x);
		this.y = y;
	}

	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void disp(){
		System.out.println("x value is " + x);
		System.out.println("y value is " + y);
	}
}
public class CircleEx extends PointEx{

	private int r;

	public CircleEx(){}

	public CircleEx(int x){
		super(x);
		r = 1;
	}

	public CircleEx(int x, int y){
		super(x, y);
		r = 2;
	}
	
	public CircleEx(int x, int y, int r){
		super(x, y);
		this.r = r;
	}
	public void setR(int r){
		this.r = r;
	}
	public int getR(){
		return r;
	}
	public void disp(){
		super.disp();
		System.out.println("r value is " + r);
	}
	public static void main(String[] args) {
		CircleEx ce = new CircleEx(); // ��ü ����.
		ce.disp();
	}
}
