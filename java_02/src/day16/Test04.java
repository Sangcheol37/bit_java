package day16;

public class Test04 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(" main start");

		for (int i = 0; i < 10; i++) {
			System.out.println("hello ~~~" + i);

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(" main end");
	}
}
