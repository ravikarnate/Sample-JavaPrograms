package OOPSConcept1;

public class StaticAndNonStatic {
	
	// the scope of Global varibales will be available across all the functions with some conditions
	String name = "Ravi";  // Non-static global var
	static int age = 25;  //static global var
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// How to call static methods and varables
		//1. Direct calling
		sum();
		//2. Calling by class name
		StaticAndNonStatic.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStatic.age);
		
		// How to call non-static variables and methods
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.sentMail();
		System.out.println(obj.name);
		
		// Can i access static methods by using reference --- Answer is YES
	 	obj.sum(); //Warning will be given
		
	}
	
	public void sentMail() {  //Non-static method
     	System.out.println("Sent mail method");	
	}
	
	public static void sum() {  // Static method
		System.out.println("Sum method");
	}
	
	
}
