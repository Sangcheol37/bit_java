package day17;

public class Test01 {
	public static void main(String[] args) {
		Book b1 = new Book("java",900); // T => object
		System.out.println(b1);
		
		Book<Double> b2 = new Book<Double>("sql",700.0);
		System.out.println(b2);
		
		Book<Integer> b3 = new Book<Integer>("JSP",5000);
		System.out.println(b3);
		
	}
}
