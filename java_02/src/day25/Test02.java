package day25;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Test02 {
	public static void main(String[] args) {
		// www.naver.com/index.html => url 주소
		URL url = null;
		String address = "https://www.naver.com/index.html";
		String line = null;

		BufferedReader br = null;

		try {
			url = new URL(address);
			// InputStreamReader 의 역할: byte Stream을 reader로 바꿔줌
			br = new BufferedReader(new InputStreamReader(url.openStream()));

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
	}
}
