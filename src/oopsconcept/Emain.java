package oopsconcept;

public class Emain {
public static void main(String[] args) {
		//edited code from git
		Employeeinoneclass e1 = new Employeeinoneclass();    // object creation  ==> copy of class.
		e1.empid=101;
		e1.empname= "ABC";
		e1.empsal= 21250.75;
		e1.empdept= 10;
		e1.job="Developer";
		e1.display();
		
		System.out.println("----------------------------------------------------------");
		
		Employeeinoneclass e2 = new Employeeinoneclass();    // object creation  ==> copy of class.
		e2.empid=102;
		e2.empname= "LMN";
		e2.empsal= 41250.75;
		e2.empdept= 15;
		e2.job="Tester";
		e2.display();
		
		
		System.out.println("----------------------------------------------------------");
		
		Employeeinoneclass e3 = new Employeeinoneclass();    // object creation  ==> copy of class.
		e3.empid=103;
		e3.empname= "xyz";
		e3.empsal= 81250.75;
		e3.empdept= 75;
		e3.job="Manager";
		e3.display();
		
		
	}
	

}
