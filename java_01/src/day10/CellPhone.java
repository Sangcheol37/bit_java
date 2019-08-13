package day10;

public class CellPhone {
	String model; // 모델명
	String number; // 전화번호
	int chord; // 화음

	public void setNumber(String n) {
		number = n;
	}
	
	public CellPhone() {
		super();
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setChord(int chord) {
		this.chord = chord;
	}

	public CellPhone(String model, String number, int chord) {
		super();
		this.model = model;
		this.number = number;
		this.chord = chord;
	}

	public String getModel() {
		return model;
	}
	
	public int getChord() {
		return chord;
	}
	
	public String getNumber() {
		return number;
	}
}
