package PraticeProgram;


interface interface1{
	
	
	void get();
	
	
}

interface interface2{
	
	void get2();
	
	static void get3(){
		
		System.out.println("get3 method");
	}
}


class ifsdemo2 implements interface1,interface2{

	@Override
	public void get2() {
		// TODO Auto-generated method stub
		
		System.out.println("get 2 methid");
		
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		
		System.out.println("get method");
	}
	
	
}
public class interfacedemo {

	public static void main(String[] args) {
		
		ifsdemo2 i = new ifsdemo2();
		interface2.get3();
		
		i.get();
		i.get2();
	
	}
	
}
