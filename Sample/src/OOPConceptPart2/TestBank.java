package OOPConceptPart2;

public class TestBank {
	
	public static void main(String args[]) {
	
		// USBank is the Interface. Variable are static in nature in Interface. We can call directly using Interface name.
		System.out.println(USBank.min_bal);
		
		HSBCBank hsbc = new HSBCBank();
		hsbc.credit();
		hsbc.debit();
		hsbc.eductionLoan();
		hsbc.carLoan();
		
		
		// Dynamic polymorphism
		// Child class object can be referred by parent Interface reference variable
		
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		
	}

}
