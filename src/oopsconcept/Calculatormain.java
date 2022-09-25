package oopsconcept;

public class Calculatormain {
public static void main(String[] args) {
	Calculator c=new Calculator();
	System.out.println("addition result"+c.sum(4, 8));
	System.out.println("subtraction result"+c.sub(4, 8));
	System.out.println("multiplication result"+c.mul(4, 8));
	System.out.println("division result"+c.div(4, 8));
	System.out.println("remainder of division"+c.rem(4, 8));
		
}
}
