package day12;

public class Test01 {
	public static void main(String[] args) {
		
	Animal[] a =	{
						new Dog("시베리안허스키","케리"),
						new Fish("구피"),
						new Fish("Fish","구피")
					};

	
	for(Animal data:a) {
		System.out.println(data);
		data.breath();
		//원래는 Object syso 하면 주소가 찍히지만, 오버라이딩 했기 때문에 가장 밑에있는 Dog 와 Fish의 toString이 출력이된다.
	}

	}
}
