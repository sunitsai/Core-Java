package PraticeProgram;

class Callback{
	
	public void call(String msg){
		
		System.out.print("["+msg);
		
		try{
			
			Thread.sleep(5000);
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		System.out.println("]");
	}
	
}

class Caller implements Runnable{

	Thread t;
	String msg;
	Callback c;
	
	public Caller(String msg, Callback c) {
		// TODO Auto-generated constructor stub
		
		this.msg = msg;
		this.c = c;
		t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized (c) {
			
			c.call(msg);
		}
	}
	
	
}

public class syncrodemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Callback c = new Callback();
		Caller c1 = new Caller("Hello", c);
		Caller c2 = new Caller("I am", c);
		Caller c3 = new Caller("Java Developer", c);
		
		
	}

}
