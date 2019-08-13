package day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpIpServer {
	public static void main(String[] args) {
		ServerSocket serversocket = null;
		OutputStream os = null;
		BufferedWriter bw = null;
		BufferedReader br = null;

		try {
			serversocket = new ServerSocket(7777);
			System.out.println("서버가 준비되었습니다.");
			while (true) {
				System.out.println("Client 요청을 기다리는 중...");
				Socket socket = serversocket.accept(); // 기다리고 있는 구문, 요청 올때까지 기다림
				T1 t1 = new T1(socket);
				try {
					t1.start();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static class T1 extends Thread implements Runnable {
		Socket socket;

		public T1(Socket socket) {
			this.socket = socket;
		}

		@Override
		public void run() {

			OutputStream os = null;
			BufferedWriter bw = null;
			BufferedReader br = null;

			try {
				os = socket.getOutputStream();
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				bw = new BufferedWriter((new OutputStreamWriter(os)));
				String msg = br.readLine();
				String msg1 = null;
				// bw.write("Hello~~~"+"\n");
				System.out.println("Hello~~~" + msg + "님\n");
				bw.write("Hello~~~" + msg + "\n");
				bw.flush();
				while (true) {
					msg1 = br.readLine();
					if (msg1.equals("quit")) {
						bw.write("<<<<접속종료>>>>\n");
						bw.flush();
						break;
					}
					bw.write(msg + " : " + msg1 + "\n");
					bw.flush();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (bw != null)
						bw.close();
					if (br != null)
						br.close();
					if (socket!=null)
						socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
