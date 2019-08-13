package day18_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test06 {
	public static void main(String[] args) {
		Set<Employee> set = new TreeSet<Employee>(); // 자동으로 sorting 됨

		boolean flag = set.add(new Employee(2017001, "홍씨", "영업"));
		if (flag)
			System.out.println("등록되었습니다. ");

		flag = set.add(new Employee(2017001, "홍씨", "영업"));
		if (!flag)
			System.out.println("이미 존재하는 데이터입니다. ");

		
		set.add(new Employee(2017044, "김씨", "인사"));
		set.add(new Employee(2017001, "박씨", "영업"));
		set.add(new Employee(2017001, "홍씨", "영업"));
		set.add(new Employee(2017003, "이씨", "기술"));

		// set 목록 출력
		Iterator<Employee> it = set.iterator();
		System.out.println("사원목록입니다. ");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println();

		// 2017003 사번의 사원을 검색출력하세요. System.out.println("검색결과입니다. ");
		
		it = set.iterator();
		while (it.hasNext()) {
			Employee data = it.next();
			if (data.number == 2017003) {
				System.out.println(data);
			}
		}
		

	}

}
