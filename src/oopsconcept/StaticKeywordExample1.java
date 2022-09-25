package oopsconcept;

public class StaticKeywordExample1 {
	int empid;
	String empName;
	 static int deptno;
	
	public void getvalues() {
		System.out.println(empid);
		System.out.println(empName);
		System.out.println(deptno);
	}
	
	
	
	public static void main(String[] args) {
		
		StaticKeywordExample1 sk1 = new StaticKeywordExample1();
		sk1.empid =101;
		sk1.empName ="ABC";
		deptno=30;
		sk1.getvalues();
		System.out.println("------------------------------------------------------");
		
		StaticKeywordExample1 sk2 = new StaticKeywordExample1();
		sk2.empid =102;
		sk2.empName ="LMN";
		sk2.getvalues();
		System.out.println("------------------------------------------------------");
		
		StaticKeywordExample1 sk3 = new StaticKeywordExample1();
		sk3.empid =102;
		sk3.empName ="XYZ";
		deptno=45;
		sk3.getvalues();
		System.out.println("------------------------------------------------------");
		StaticKeywordExample1 sk4 = new StaticKeywordExample1();
		sk4.empid =104;
		sk4.empName ="LMN";
		sk4.getvalues();
		System.out.println("------------------------------------------------------");
		
		StaticKeywordExample1 sk11 = new StaticKeywordExample1();
		sk11.empid =1011;
		sk11.empName ="ABC";
		deptno=35;
		sk11.getvalues();
		System.out.println("------------------------------------------------------");
		
		StaticKeywordExample1 sk12 = new StaticKeywordExample1();
		sk12.empid =1012;
		sk12.empName ="LMN";
		sk12.getvalues();
		System.out.println("------------------------------------------------------");
		
	}
	


}
