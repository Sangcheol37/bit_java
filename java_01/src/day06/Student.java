package day06;

public class Student {
	private int age;
	private String name;
	private String school;

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

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	public void display() {
		System.out.println("이름: "+this.name + " 나이 : "+this.age + " 학교 : "+this.school);
		return;
	}

}
