package oopsconcept;

public class Stmethodsmain {
public static void main(String[] args) {
//	System.out.println(Stmethods.sum(2, 4));
	String s = "madam";
	String r= "";
	for(int i=s.length()-1; i>=0; i--) {
		r=r+ s.charAt(i);
	}
		if(s.equals(r)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	
//// program for palindrome number
//	
//	int temp,sum=0,r;
//	int n=454;
//	temp=n;
//	while(n>0) {
//		r=n%10;
//		sum=(sum*10)+r;
//		n=n/10;
//	}
//	if(temp==sum) {
//		System.out.println("the number is palindrome");
//	}
//	else {
//		System.out.println("the number is not palindrome");
//	}
//
//
}
}

