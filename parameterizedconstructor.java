package PraticeProgram;


class Student{
	
	int id;
	String name;
	
	
	
	Student(int i, String n){
		
		id = i;
		name = n;
	}
	
	void display(){
		
		System.out.println(id+" "+name);
	}
}

public class parameterizedconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student(8,"Sunit");
		
		s1.display();
	}

}
