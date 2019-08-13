package day18_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		//String[] names1 = new String[100];
		String[] names1 = {"이순신","김순신","박순신","강순신"};
		System.out.println(Arrays.toString(names1));
		Arrays.sort(names1); //배열 sort 
		System.out.println(Arrays.toString(names1));
		
		
		System.out.println("====================================");
		List<String> list = new ArrayList<String>();
		list.add("김길동");
		list.add("고길동");
		list.add("감길동");
		list.add("강길동");
		list.add("최길동");
		list.add("박길동");
		list.add("구길동");
		list.add("이길동");
		list.add("이길동");
		
		System.out.println(list);
		Collections.sort(list);       //Collect Sort 수행
		System.out.println(list);
		
		List<String> list2 = new ArrayList<String>(list.subList(1, 4));
		System.out.println(list2);
		
		
		Object[] obj = list.toArray();
		System.out.println("obj => "+Arrays.toString(obj)); //오브젝트 타입의 배열
		
		String[] st = new String[list.size()];
		list.toArray(st);
		System.out.println("st => "+Arrays.toString(st)); // String 타입의 배열

		String[] sss = {"11","33","22","44"};
		List<String> ssslist = new ArrayList<String>(Arrays.asList(sss)); //list로 형변형
		System.out.println(ssslist);

		System.out.println("====    list 다루기    ====");
		System.out.println(list);
		System.out.println(list.contains("이길동"));
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).charAt(0)+"**");
		}
		
		for(String data:list) {
			System.out.println(data+ "    ");
		}
		System.out.println();
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String data = it.next();
			if(data.equals("이길동")) {
				System.out.println("이길동 삭제되었습니다.");
				it.remove();
			}
		}
		System.out.println(list);
	}
}
