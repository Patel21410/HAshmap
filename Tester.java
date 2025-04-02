package Hashmapcreactiojn;

import java.util.HashMap;
//import java.util.Map;

public class Tester {
	
	public static void main(String [] arg) {
		
		HashMap<Integer, Student> stud=new HashMap< >();
		//inserting
		System.out.println("********************create*************");

		stud.put(1, new Student(1, "puja", 2000) );
		stud.put(2, new Student(2, "rohan", 2500) );
		stud.put(3, new Student(3, "prem", 2600) );
		stud.put(4, new Student(4, "pranjali", 3500) );
		
		System.out.println("********************read*************");

		//read
		Student as=stud.get(2);
		System.out.println(as);
		
		for(Student st:stud.values()) {
			System.out.println(st);
		}

		//update
//		System.out.println(stud.containsKey(2));
		System.out.println("********************update*************");

		Student nref=stud.get(3);
		nref.setSal(2800);
		
		System.out.println(stud.get(3));
		
		
		//delete
		System.out.println("********************remove*************");

		stud.remove(3);
		System.out.println("********************final*************");
		for(Student st:stud.values()) {
			System.out.println(st);
		}

	}

	
	
	
	
	
	
	
	

}
