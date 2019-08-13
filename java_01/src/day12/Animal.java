package day12;

public  abstract class Animal {
    protected String kind = "동물의 종류";
    		
	public Animal() {
	}

	public Animal(String kind) {
		super();
		this.kind = kind;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public abstract void breath(); // 추상 메소드 (추상메소드가 있기에 미완성이므로 Animal class는 추상클래스이다)
	
	public void print() {
		System.out.printf("Anumal kind : %s " , kind);
	}
}
