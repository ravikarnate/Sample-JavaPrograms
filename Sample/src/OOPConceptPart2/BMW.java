package OOPConceptPart2;

public class BMW extends Car{

	// When same methods is present in parent class as well as in child class with the same name and same number of arguments- Method Overriding 
	public void start() {
		System.out.println("BMW ---- Start");
	}
	
	public void theftSafety() {
		System.out.println("BMW ---- theftsafety");
	}
}
