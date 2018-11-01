package OOPSConcept1;

public class FunctionInJava {

	// Main method is starting point of execution
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionInJava obj = new FunctionInJava();
		// One object will be crated - obj is the reference variable, referring to this object
		// After creating the object, the copy of all non-static methods will be given to this object
		
		obj.test();
		FunctionInJava.test();
		
		int l = obj.url();
		System.out.println(l);
		
		String S1 = obj.qa();
		System.out.println(S1);
		
		int div = obj.division(20, 10);
		System.out.println(div);
	}

	// Non static methods
	
	// void - doesn't return any value
	// return type = void
	public static void test() {   // NO input & NO output
		System.out.println("Test method");
	}
	
	// return type = int
	public int url() {    // NO input, Some Output
		System.out.println("URL method");
		int a=10;
		int b=20;
		int c=a+b;	
		return c;
	}
	
	//return type = String
	public String qa() {   // NO input, Some Output
		System.out.println("QA method");
		String s="Selenium";
		return s;	
	}
	
	// return type = int
	// x,y - input parameters/arguments
	public int division(int x, int y) {     // Some input, Some output
		System.out.println("Division method");
		int z = x/y;
		return z;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
