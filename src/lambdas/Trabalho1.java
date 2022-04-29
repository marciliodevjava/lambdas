package lambdas;

public class Trabalho1 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("Trabalho #1 : " + i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {

			}
		}
	}

}
