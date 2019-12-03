package PraticeProgram;

class NewThread2 extends Thread {

	public NewThread2() {
		// TODO Auto-generated constructor stub

		super("Child Thread2");
		start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {
			for (int i = 0; i < 5; i++) {

				System.out.println(this + ":" + i);
				Thread.sleep(500);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println("Child Thread Existing");
	}
}

public class CreatingThread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new NewThread2();

		Thread t = Thread.currentThread();
		System.out.println("Current Thread : " + t);

		t.setName("Child Thread");
		System.out.println("After the name change");
		try {

			for (int i = 0; i < 5; i++) {

				System.out.println(t + ":" + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println("Main Thread Existing");
	}

}
