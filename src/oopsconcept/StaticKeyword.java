package oopsconcept;

public class StaticKeyword {
//	int empid;
//	String name;
//	static int dept;
//	
//	public void display() {
//		System.out.println(empid);
//		System.out.println(name);
//		System.out.println(dept);
//	}
//	
//	public static void main(String[] args) {
//		
//		StaticKeyword sk1= new StaticKeyword();
//		sk1.empid=101;
//		sk1.name="ABC";
//		dept=100;
//		sk1.display();
//		
//		System.out.println("=======================================================================");
//		
//		StaticKeyword sk2= new StaticKeyword();
//		sk2.empid=102;
//		sk2.name="PQR";
//		sk2.display();	
//		
//System.out.println("=======================================================================");
//		
//		StaticKeyword sk3= new StaticKeyword();
//		sk3.empid=103;
//		sk3.name="xyz";
//		dept=101;
//		sk3.display();
//		
//System.out.println("=======================================================================");
//		
//		StaticKeyword sk4= new StaticKeyword();
//		sk4.empid=102;
//		sk4.name="PQR";
//		sk4.display();
//		
//	}
//
//
	static int a=10; // static
	int b=20;  // non static
	
	
	public static void m1() {
		System.out.println(" this is static nmethod m1");
	}
	
	public  void m2() {
		System.out.println(" this is Non static nmethod m2");
	}
	
	public void m3() {
		System.out.println("=========> this is method m3");
		
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	public static void main(String[] args) {
		
		// rule 1 :- Static methods can access static members directly. (without creating the object)
		
		System.out.println(a);
		m1();
		
		// rule 2 :- Static methods can also access non static members through objects only.
		
		StaticKeyword se = new StaticKeyword();
		System.out.println(se.b);
		se.m2();
		
		// rule 3 :- Non Static methods can access both static and non static members directly.
		StaticKeyword se1 = new StaticKeyword();
		
		se1.m3();
	
	
}





}
