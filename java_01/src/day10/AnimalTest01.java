package day10;

public class AnimalTest01 {
	public static void main(String[] args) {
		Animal a1 = new Animal();	
		a1.breath();
			
		Animal a2 = new Animal("강아지");
		a2.breath();
	
		Animal a3 = new Animal("고양이");
		a3.breath();
		
		Dog d1 = new Dog("시베리안허스키","케리");
		d1.breath();

		d1.dogPrint();
		
		Dog d2 = new Dog("Dog","진돗개","쫑이");
		d2 .dogPrint();
		
		String animalKind = d2.getSuperKind(); //static 영역에서는 this, super 사용불가
		System.out.println(animalKind);
	}
}
