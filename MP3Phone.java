class CellPhone{
	String model; // �𵨸�
	String number; // ��ȭ��ȣ
	int chord; // ȭ��
	
	// ������

	// �޼���
	public void setNumber(String n){
		number = n;
	}
	public String getModel(){
		return model;
	}
	public int getChord(){
		return chord;
	}
	public String getNumber(){
		return number;
	}
}
public class MP3Phone extends CellPhone{
	int size; // ���� �뷮
	public MP3Phone(String model, String num, int chord, int size){
		this.model = model;
		number = num;
		this.chord = chord;
		this.size = size;
	}
}
