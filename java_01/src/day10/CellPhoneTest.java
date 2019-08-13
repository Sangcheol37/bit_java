package day10;

public class CellPhoneTest {

	public static void main(String[] args) {
		D_CaPhone dca = new D_CaPhone("IN-7600", "011-9XXX-9XXXX", 60, "400만화소");
		
		MP3Phone mp = new MP3Phone("KN-600", "011-9XXX-9XXXX",60,256);
		
		System.out.println(dca.getModel()+","+dca.getChord()+","+dca.getNumber());
	}

}
