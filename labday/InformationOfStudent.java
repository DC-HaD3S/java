package Rohit;
/**
 * 
 * @rohit
 */

class Students {
	int id;
    String name;
	String course;
	
	public void getDetails() {
		System.out.println("ID: " + id);
		System.out.println("The name is:  " + name);
		System.out.println("course: " + course);
	
	}
	public int getId() {
		return id;
	}
	public String getname() {
		return name;
	}
	public String getcourse() {
		return course;
	}
	
	

}

public class InformationOfStudent {
	public static void main(String[] args) {
		Students Rohit= new Students();
		Students Ash= new Students();
		Students Aksh= new Students();
		System.out.println("students Information");
		System.out.println();

		
		Rohit.id = 01;
		Rohit.name= "Rohit Zirmute";
		Rohit.course="Bsc. CS";
		
		Aksh.id = 02;
        	Aksh.name= "Aksh Sinha";
		Aksh.course="Bsc. CS";
		
		Ash.id=03;
		Ash.name= "Ash Dsouza";
		Ash.course="Bsc.CS";
		
		Rohit.getDetails();
		System.out.println();
		Aksh.getDetails();
		System.out.println();
		Ash.getDetails();
		System.out.println();
		
		

	}

}
