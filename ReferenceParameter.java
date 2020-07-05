public class ReferenceParameter{
	public void increase(int[] n){
		for(int i = 0; i<n.length; i++){
			n[i]++;
		}
	}
	public static void main(String[] args) {
		// ���� ȣ�� (Call by reference)
		// �޼��� ȣ�� �� �����Ϸ��� ���ڸ� ����(��ü) �ڷ����� ����� ��츦 �ǹ��Ѵ�. 
		// ���⿡�� �⺻ �ڷ����� �ƴ� �Ϲ� ��ü �Ǵ� �迭���� ���⿡ ���Ѵ�.
		int[] ref1 = {100, 800, 1000};
		ReferenceParameter rp = new ReferenceParameter();
		rp.increase(ref1);
		for(int i = 0; i < ref1.length; i++){
			System.out.println("ref1[" + i + "] : " + ref1[i]);
		}
	}
}