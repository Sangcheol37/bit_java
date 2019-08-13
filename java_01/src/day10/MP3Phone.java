package day10;

public class MP3Phone extends CellPhone{
	
	int size; //저장용량
	
	public MP3Phone (String model, String num, int chord, int size) {
		super(model,num,chord);
		//super.model = model;
		//super.number = num;
		//super.chord = chord;
		this.size = size;
	}
}
