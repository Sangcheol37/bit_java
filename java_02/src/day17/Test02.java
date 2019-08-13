package day17;

public class Test02 {
	public static void main(String[] args) {
		Book1 b1 = new Book1("java", 900);
		System.out.println(b1);
		if(b1.getTitle() instanceof String)
		System.out.println(((String)(b1.getTitle())).charAt(0));
		
		Book1<String, Integer> b2 = new Book1<String, Integer>("SQL",400);
		System.out.println(b2);
		System.out.println(b2.getTitle().charAt(0));
		
		//char s = b1.getTitle().toString().charAt(0);
		//System.out.println(s);
		
		//char s1= b2.getTitle().charAt(0);
		//System.out.println(s1);
		
		//Object[] obj = {1,2,3};
		Book1<?,Integer> b3 = new Book1<String,Integer>("Spring",4400);
		System.out.println(b3.getTitle()); // ? => Object
		
		Book1<?, ? extends Number> b4 = new Book1<String,Integer>("Spring",4400);
		System.out.println(b4.getPrice()); // Number type 
		
		Book1<String, ? super Number > b5 = new Book1<String, Object>("Spring",400);
		System.out.println(b5.getPrice());
	}
}
