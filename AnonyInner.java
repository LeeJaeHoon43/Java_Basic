abstract class TestAbst{
	int data = 10000;
	public abstract void printData(); // �߻� �޼���.
}

public class AnonyInner{
	TestAbst inn = new TestAbst(){
		public void printData(){ // �̿ϼ��� ���� �ϼ��Ѵ�.
			System.out.println("data : " + data);
		}
	};
	public static void main(String[] args){
		AnonyInner ai = new AnonyInner();
		ai.inn.printData();
	}
}