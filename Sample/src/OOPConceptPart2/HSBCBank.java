package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank{
	
	// If a class is implementing any Interface, then its mandatory to define/override of all the methods of Interface
   
	
	// Overriding from USBank 
	@Override
	public void credit() {
		// TODO Auto-generated method stub
		
		System.out.println("Credit function");
		
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("Debit function");
	}
	
	// Seperate methods of HSBCBank class
	public void eductionLoan() {
		System.out.println("Education funciton");
	}
	
	public void carLoan() {
		System.out.println("Cal loan function");
	}

	
	// method from Brazil Bank Interface
	@Override
	/*public void mutualFund() {
		// TODO Auto-generated method stub
		System.out.println("Mutual fund function");
	}*/
	

}
