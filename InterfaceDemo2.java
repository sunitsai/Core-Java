package PraticeProgram;

interface ifs1{
	
	void meth1();
	void meth2();
}


interface ifs2{
	
	void meth3();
	
	static void meth4(){
		
		System.out.println("Method 4 called!");
	}
}


class ifsdemo implements ifs1,ifs2{

	@Override
	public void meth3() {
		// TODO Auto-generated method stub
		
		System.out.println("Method 3 Called!");
	}

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println("Method 1 called!");
	}

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("Method 2 called!");
	}
	
	
}
public class InterfaceDemo2  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ifsdemo ifs = new ifsdemo();
		
		ifs.meth1();
		ifs.meth2();
		ifs.meth3();
		ifs2.meth4();
		

	}

}
