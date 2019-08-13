package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test02 {
	public static void main(String[] args) { // Map 은 인터페이스
		Map<String, String> map = new HashMap<String, String>();
		map.put("java01", "1234");
		map.put("java02", "1234");
		map.put("admin", "admin");
		map.put("Test01", "test");
		for(int i =0;i<30;i++) {
			map.put("test"+i,(int)(Math.random()*3)+"aa");
		}
		//System.out.println(map);
		System.out.println("andmin => pw ? "+map.get("admin"));
		System.out.println("java01 => pw ? "+map.get("java01"));
		System.out.println("java09 => pw ? "+map.get("java09"));
		
		System.out.println("Test01 => pw ? "+map.get("Test01"+ ""));
		
		System.out.println("===============================");
		
		Set<String> keynames = map.keySet();
		Iterator<String> it = keynames.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("ID : "+key+" , PW : "+map.get(key));
		}
	}
 }
