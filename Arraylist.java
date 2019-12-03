package PraticeProgram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student3 {

	 String name;
	 String contact;
	 String email;
	 
	 public Student3() {
		// TODO Auto-generated constructor stub
	}

	public Student3(String name, String contact, String email) {

		this.name = name;
		this.contact = contact;
		this.email = email;
		// TODO Auto-generated constructor stub
	}

	static Student3 getdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("***********Student Detail ********** ");
		System.out.print("Enter the name of Student :");		
		String name = sc.nextLine();
		System.out.print("Enter the Contact of Student :");
		String contact = sc.nextLine();
		System.out.print("Enter the Email of Student :");
		String email = sc.nextLine();

		System.out.println("******Please Check Detail*******");
		System.out.println("");
		System.out.println("Student Name : " + "" + name + "" + "\nContact : " + contact + "" + "\nEmail :" + email);
		// return name + " " + contact + " " + email;
		return new Student3(name, contact, email);
		

	}
	
	
}

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Student3 s = new Student3();
		
		ArrayList<Student3> arr = new ArrayList();
		Iterator itr = arr.iterator();
		
		for (int i = 0; i <= arr.size(); i++) {
			System.out.println("**********Welcome To Student Registration Process********");
			System.out.println("");
			System.out.println("Press 1 to create the student");
			System.out.println("Press 2 to update the student");
			System.out.println("Press 3 to delete the student");
			System.out.println("Press 4 to Display the student Details");
			System.out.println("Press 5 to exit the student");

			System.out.print("Enter your key to add, update or delete the info :");
			int key = sc.nextInt();

			switch (key) {

			case 1:

				arr.add(Student3.getdata());
				break;

			case 2:

				System.out.print("Enter the update value for Already Student Created");
				int index = sc.nextInt();
				arr.set(index, Student3.getdata());

				break;
				
			case 3: 
				
				System.out.print("Enter the index value you want to remove :");
				int in = sc.nextInt();
				arr.remove(in);
				
				
			case 4:
				
		
					while(itr.hasNext()){
						
						//s = (Student3) itr.next();
						/*Object obj = itr.next();
						System.out.println("Details Of student : " +obj);*/
					}
			default:
				System.out.println("Thank You");

			}
			
			

		}

	}

}
