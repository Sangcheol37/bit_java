package day09;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Test02_String {
	public static void main(String[] args) {
		String msg1 = "Java programming/23000";
		System.out.println(msg1.indexOf('/'));
		
		String d1 = msg1.substring(0,msg1.indexOf("/"));
		String d2 = msg1.substring(msg1.indexOf("/")+1,msg1.length()-1);
		
		System.out.println(d1);
		System.out.println(d2);
		
		String url = "http://127.0.0.1:8080/web1/list.do";
		int d3 = url.lastIndexOf("/");
		System.out.println(d3);
		System.out.println(url.indexOf("/"));
		System.out.println(url.substring(d3,url.length()));
		System.out.println(url.substring(url.lastIndexOf("/")));
		
		System.out.println(url.contains(":808"));
		
		
		String data = "2019001_홍길동/90_70/100";
		
		System.out.println(data);  
		data = data.replace("_", "/");
		
		String[] data1 = data.split("/");
		System.out.println(Arrays.toString(data1));
		
		data = "2019001_홍길동/ 90_ 70/100";
		StringTokenizer st = new StringTokenizer(data,"_");
		System.out.println(st.countTokens());
		while(st.hasMoreElements()) {
			System.out.print(st.nextToken()+"    ,  ");
		}
		
	}
}
