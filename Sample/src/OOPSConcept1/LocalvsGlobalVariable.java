package OOPSConcept1;

public class LocalvsGlobalVariable {

	// Global variables or Class variables
	String s = "ravi"; 
	int age = 25;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		System.out.println(i);
		
		LocalvsGlobalVariable obj = new LocalvsGlobalVariable();
		System.out.println(obj.age);
	}

	public void sum() {
		int i =10; // local variable for sum method
		int j =20;
	}
}
