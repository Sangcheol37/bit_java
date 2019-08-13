package day06;

public class StudentTest {

	public static void main(String[] args) {

		Student st1 = new Student();
		st1.setName("박길동");
		st1.setAge(17);
		st1.setSchool("ㄱ고");

		Student st2 = new Student();
		st2.setName("고길동");
		st2.setAge(18);
		st2.setSchool("ㄷ고");

		Student st3 = new Student();
		st3.setName("주길동");
		st3.setAge(19);
		st3.setSchool("ㄱ고");

		Student[] st = { st1, st2, st3 };

		for (int i = 0; i < st.length; i++) {
			if (st[i].getSchool().equals("ㄱ고")) 
				st[i].display();
		}

	}

}
