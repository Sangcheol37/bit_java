package day08;

public class Test02 {
	public static void main(String[] args) {
		Student[] st = { new Student("홍길동", 2019001, 92, 90, 95), new Student("김길동", 2019007, 80, 90, 65),
				new Student("최길동", 2019014, 92, 97, 85), new Student("박길동", 2019022, 42, 70, 65),
				new Student("강길동", 2019033, 72, 86, 90) };

		for (Student data : st) {
			if (data.getGrade() == 'A')
				data.print();
		}

	}

}

class Student {

	private String name;
	private int number;
	private int kor;
	private int eng;
	private int math;
	private char grade;

	public Student(String name, int number, int kor, int eng, int math) {
		this.name = name;
		this.number = number;
		setKor(kor);
		setEng(eng);
		setMath(math);
	}

	public Student(String data) {

	}

	public void print() {
		System.out.printf("%s,%.2f,%c \n", name, (kor + eng + math) / 3., getGrade());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		/*
		 * if (!(kor >= 0 && kor <= 100)) { System.out.println(kor + "잘못된 점수입니다.");
		 * return; }
		 */
		if(Test(kor)==!true) {
			return;
		}
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		/*
		 * if (!(eng >= 0 && eng <= 100)) { System.out.println(eng + "잘못된 점수입니다.");
		 * return; }
		 */
		if(Test(eng)==!true) {
			return;
		}
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		/*if (!(math >= 0 && math <= 100)) {
			System.out.println(math + "잘못된 점수입니다.");
			return;
		}*/
		if(Test(math)==!true) {
			return;
		}
		this.math = math;
	}

	public char getGrade() {
		this.setGrade();
		return grade;
	}

	private void setGrade() {
		double avg = (kor + eng + math) / 3;
		this.grade = avg >= 90 ? 'A' : (avg >= 80 ? 'B' : (avg >= 70 ? 'C' : (avg >= 60 ? 'D' : 'F')));
	}

	public boolean Test(int score) {
		boolean flag = true;
		if (!(score >= 0 && score <= 100)) {
			System.out.println(score + "잘못된 점수입니다.");
			flag = false;
		} 
		return flag;
	}
}
