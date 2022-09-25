package oopsconcept;

public class Oneclasscall {
	public static void m1() {
		System.out.println("static method m1");
	}
	public static void m2() {
		System.out.println("static method m2");
	}
	
	public  void m3() {
		System.out.println("non static method m3");
	}
	public  void m4() {
		System.out.println("non static method m4");
	}
	
	public static void main(String[] args) {
		Oneclasscall.m1();
		Oneclasscall.m2();
		
		Oneclasscall o1= new Oneclasscall();
		o1.m3();
		o1.m4();
	}

}
