package day08;

public class Card {
	//instance variable
	String kind = "다이아몬드";  
	int number;
	//member variable
	final static int WIDTH = 100;  //final 붙이면 수정불가능
	final static int HEIGHT = 250;

	public static void main(String[] args) {
		System.out.println(WIDTH+" * "+HEIGHT +"="+WIDTH*HEIGHT);
		System.out.println(new Card().kind);
	
	}
	
}
