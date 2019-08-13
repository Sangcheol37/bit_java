package day20;

import java.util.Iterator;
import java.util.Properties;

public class Test02 {
	public static void main(String[] args) {
		Properties p = new Properties();
		p.setProperty("java01", "1234");
		p.setProperty("java02", "1244");
		p.setProperty("java03", "1734");
		p.setProperty("java04", "8545");
		p.setProperty("java05", "8456");
		p.setProperty("java06", "1333");
		p.setProperty("java07", "1444");
		p.setProperty("java08", "3737");
		p.setProperty("java09", "6464");
		System.out.println(p.getProperty("java01"));
		
		Iterator it = p.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println(key + " : " + p.getProperty(key));
		}
	}
}
