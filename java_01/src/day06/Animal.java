package day06;

public class Animal {

	private boolean live;

	private int age;

	private String name;

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLive(boolean live) {
		this.live = live;
	}

	public boolean isLive() {
		return live;
	}

	public void print() {
		System.out.println(name+" "+ age + " "+ live);
	}
	
	public static void main(String[] args) {
		Animal a = new Animal();
		a.name = "큰뿔소";  //instance variable; 
		
		a.print(); // 인스턴스 메소드 , 주소가 있어야만 호출이 가능. => 그냥 print(); 하면 불가능 
		
	}
}
