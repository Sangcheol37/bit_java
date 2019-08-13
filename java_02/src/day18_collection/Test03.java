package day18_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Test03 {
	public static void main(String[] args) { //ArrayList 를 Vector로 바꿈
		Student[] s = new Student[10];
		Student[] sss = {
				new Student("김", 90, 95),
				new Student("이", 70, 33),
				new Student("박", 45, 89)
		};
		
		Arrays.sort(sss);  //배열 sort 
		
		Vector<Student> list = new Vector<Student>(5,10); // 내부에 student[] 만들어서 관리
		//Vector 는 동기화 처리가 되어있고 , ArrayList는 동기화처리가 되어있지 않다.
		//여러명이 접근하지 않을 것이라면 ArrayList 쓰면 된다.
		System.out.println("capacity : "+list.capacity());
		System.out.println("size : "+list.size());
		list.add(new Student("김", 90, 95));
		list.add(new Student("이", 70, 33));
		list.add(new Student("박", 45, 89));
		list.add(new Student("박", 45, 89));
		list.add(new Student("박", 45, 89));
		list.add(new Student("박", 45, 89));
		list.add(new Student("박", 45, 89));
		list.add(new Student("박", 45, 89));
		list.add(new Student("박", 45, 89));
		list.add(new Student("박", 45, 89));
		list.add(new Student("박", 45, 89));
		list.add(new Student("박", 45, 89));
		list.add(new Student("박", 45, 89));
		list.add(new Student("박", 45, 89));
		list.add(new Student("박", 45, 89));
		list.add(new Student("박", 45, 89));
		System.out.println("capacity : "+list.capacity());
		System.out.println("size : "+list.size());
		//실질적 데이터는 16 이지만 최초 capacity 초과시 resizing이 일어나서 2배씩 capacity 상승
		// System.out.println(list);

		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student data = it.next();
			if (data.avg >= 90) {
				System.out.println(data);
			}
		}
		System.out.println(list.contains(new Student("박", 45, 89)));
		// equals() 오버라이딩 되어 있어야 함.

		// CURD (등록 업데이트 수정 삭제)
		// 홍길동 90 90 등록
		Student s1 = new Student("홍길동", 90, 90);
		boolean flag = list.add(s1);
		if (flag) {
			System.out.println(s1 + " 등록되었습니다. ");
		} else
			System.out.println("등록에 실패하였습니다.");

		// 홍길동 100 100 으로 수정 한후 list 목록 출력
		it = list.iterator();
		while (it.hasNext()) {
			Student data = it.next();
			if (data.name.equals("홍길동")) {
				data.ko = 100;
				data.math = 100;
				data.setAvg();
				System.out.println(data + " 수정되었습니다.");
			}
		}

		// list 목록 출력
		System.out.println("********학생 List 정보 출력*********");
		it = list.iterator();
		while (it.hasNext()) {
			Student data = it.next();
			System.out.println(data);
		}

		// list 삭제 처리
		System.out.println("********학생 정보 삭제*********");
		it = list.iterator();
		while (it.hasNext()) {
			Student data = it.next();
			if (data.equals(s1)) {
				it.remove();
				System.out.println(s1 + " 삭제되었습니다.");
			}
		}
		Collections.sort(list);

		// list 목록 출력
		System.out.println("********학생 List 정보 출력*********");
		it = list.iterator();
		while (it.hasNext()) {
			Student data = it.next();
			System.out.println(data);
		}
	}

}


