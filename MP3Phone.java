class CellPhone{
	String model; // 모델명
	String number; // 전화번호
	int chord; // 화음
	
	// 생성자

	// 메서드
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
	int size; // 저장 용량
	public MP3Phone(String model, String num, int chord, int size){
		this.model = model;
		number = num;
		this.chord = chord;
		this.size = size;
	}
}
