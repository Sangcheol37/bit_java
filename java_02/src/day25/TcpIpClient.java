package day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TcpIpClient {
	public static void main(String[] args) {
		String serverIp = "127.0.0.1"; // 127.0.0.1 == 나
		// String serverIp = "192.168.0.135"; // 선생님자리
		InputStream is = null;
		BufferedReader br = null;
		OutputStream os = null;
		BufferedWriter bw = null;
		Scanner scanner = new Scanner(System.in);
		Socket socket = null;

		try {
			System.out.println(serverIp + "<<<<<<<<<<<<<연결 시도>>>>>>>>>>>>");
			socket = new Socket(serverIp, 7777);
			is = socket.getInputStream();

			br = new BufferedReader(new InputStreamReader(is));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			String send = "";
			String msg = null;
			String msg1 = null;

			System.out.println("아이디를 입력하세요 : ");
			send = scanner.nextLine();
			bw.write(send + "\n");
			bw.flush();
			msg = br.readLine();
			System.out.println(msg);
			while (true) {
				System.out.println("메시지 입력하세요 ...");
				send = scanner.nextLine();
				bw.write(send + "\n");
				bw.flush();
				msg1 = br.readLine();
				System.out.println(msg1 + "\n");
				if (send.equals("quit")) {
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (bw != null)
					bw.close();
				if (socket != null)
					socket.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
	}
}
