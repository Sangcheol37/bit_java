package day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {

		Scanner scanner = null;

		try {
			scanner = new Scanner(new File("c://lib//sample.txt"));
			while(scanner.hasNextLine()) {
				String[] data = scanner.nextLine().replace("_", "/").split("/");
				System.out.println(Arrays.toString(data));
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (scanner != null) {
				scanner.close();
			}
			scanner = null;
			System.out.println("자원 반납 완료");
		}

		System.out.println("main end");
	}

}
