package OOPConceptPart2;

public interface USBank {

	int min_bal = 100;
	
	public void credit();
	
	public void debit();

	void mutualFund();
	
	// Only method declaration
	// No method body -- Only method prototype
	// in Interface, we can declare variables, variables are by default static in nature
	// Variables value will not be changed
    // no static method in Interface
	// No main method 
	// We cannot create the object of Interface
	// Interface is abstract in nature
	
}
