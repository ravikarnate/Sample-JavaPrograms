package OOPSConcept1;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10.25);
		obj.sum(10, 20);
	}
	
	// You cannot create a method inside a method
	// Duplicate methods -- Same method name with same number of paramters/arguments are not allowed
	
	
	// Method Overloading -- When the method name is same with different arguments or input parameters within in the same class.

	public void sum() {   // 0 input parameters
		System.out.println("Sum method --- zero parameters");
	}
	
	public void sum(int i) {  // 1 Parameter
		System.out.println("Sum method --- With 1 parameter");
		System.out.println(i);
	}
	
	public void sum(double d) {  // 1 Parameter
		System.out.println("Sum method --- With 1 parameter");
		System.out.println(d);
	}
	
	public void sum(int k, int l) {    // 2 Parameters
		System.out.println("Sum method --- With 2 parameters");
		System.out.println(k+l);
	}
}
