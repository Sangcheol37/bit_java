package day20;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import day19.Employee;

public class Test01 {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);

		list.forEach(i -> System.out.print(i + " "));
		System.out.println();
		list.removeIf(i -> (i % 2 == 0));
		list.forEach(i -> System.out.print(i + " "));
		System.out.println();

		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(2017001, "홍길동", "영업부"));
		emp.add(new Employee(2018002, "고길동", "전산부"));
		emp.add(new Employee(2017011, "박길동", "인사부"));
		emp.add(new Employee(2019101, "염길동", "인사부"));
		System.out.println("--------------------------------------------------------");
		System.out.println("2018001 보다 사번이 뒤에 있는 사람 수 :");
		System.out.println(emp.stream()
				.filter(i -> i.getNumber() > 2018001).count() + "명");
		emp.stream().filter(i -> i.getNumber() > 2018001)
		.forEach(i -> System.out.println(i));
		// list를 가지고 스트림을 만들었음

		System.out.println("---------------------------------------------------------");
		Employee[] e  = {
				new Employee(2017001, "홍길동", "영업부"),
				new Employee(2018002, "고길동", "전산부"),
				new Employee(2017011, "박길동", "인사부"), 
				new Employee(2019101, "염길동", "인사부") };

		System.out.println("=========Array Stream 처리=========");
		
		Stream.of(e).filter(i -> i.getDept().equals("인사부"
				))
		.forEach(i -> System.out.println(i));
		// 배열을 가지고 스트림을 만들었음 //배열은 stream으로 바꾼 후 인사부 사원만 추출하여 출력
		
		System.out.println();
		Stream.of(e).sorted().forEach(i->System.out.println(i));
		System.out.println();
		//sort 기준을 이름으로.
		Stream.of(e)
		.sorted((o1,o2)-> o1.getName().compareTo(o2.getName()))
		.forEach(i->System.out.println(i));
	}
}
