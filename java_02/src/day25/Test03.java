package day25;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

public class Test03 {
	public static void main(String[] args) {
		String address = "https://www.naver.com/index.html";
		String line = null;

		URL url = null;
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			url = new URL(address);
			// InputStreamReader 의 역할: byte Stream을 reader로 바꿔줌
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			bw = new BufferedWriter(new FileWriter("naver.html"));
			while ((line = br.readLine()) != null) {
				bw.write(line + "\n");
			}
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (bw != null)
					bw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
	}
}