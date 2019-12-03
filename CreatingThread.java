package PraticeProgram;

class NewThread implements Runnable {

	Thread t;

	public NewThread() {
		

		t = new Thread(this, "Child Thread");
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {

			for (int i = 0; i < 5; i++) {

				System.out.println(t + ":" + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println("Child Thread Existing");
	}

}

public class CreatingThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//new NewThread();

		Thread t = Thread.currentThread();
		System.out.println("Current Thread : " + t);

		t.setName("Child Thread 2");
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
