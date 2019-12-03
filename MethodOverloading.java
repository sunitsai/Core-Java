package PraticeProgram;

public class MethodOverloading {

	
	void test(){
		
		System.out.println("Method with not arguments");
	}
	
	void test(int a){
		
		System.out.println("Method with one arguments");
		
	}
	
	void test(int a, int b){
		
		System.out.println("Method with two arguments");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading m = new MethodOverloading();
		
		m.test();
		m.test(12);
		m.test(15,16);

	}

}
