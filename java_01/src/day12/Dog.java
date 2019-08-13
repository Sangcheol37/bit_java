package day12;

public class Dog extends Animal{

	String kind;
	String name;
	
	public Dog() {
		super("강아지");
	}

	public Dog(String kind, String name) {
		super("강아지");
		this.kind=kind;
		this.name=name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//abstract 했던걸 오버라이딩 꼭 해줘야함
	@Override
	public void breath() {
		System.out.println(super.kind+" => 폐로 쉼시기");
	}

	@Override
	public String toString() {
		return "Dog [kind=" + kind + ", name=" + name + "]";
	}
	
	
}
