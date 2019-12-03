package PraticeProgram;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
