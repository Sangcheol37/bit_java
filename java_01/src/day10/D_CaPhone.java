package day10;

public class D_CaPhone extends CellPhone {
	String pixel; // 화소수
	
	public D_CaPhone(String model, String num, int chord, String pixel) {
		super(model,num,chord);
		//super.model=model;
		//super.number=num;
		//super.chord=chord;
		this.pixel=pixel;
	}
}
