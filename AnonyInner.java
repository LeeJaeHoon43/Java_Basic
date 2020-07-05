abstract class TestAbst{
	int data = 10000;
	public abstract void printData(); // 추상 메서드.
}

public class AnonyInner{
	TestAbst inn = new TestAbst(){
		public void printData(){ // 미완성된 것을 완성한다.
			System.out.println("data : " + data);
		}
	};
	public static void main(String[] args){
		AnonyInner ai = new AnonyInner();
		ai.inn.printData();
	}
}