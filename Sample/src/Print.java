
public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Printing on console");
		
		/*StringBuffer a = new StringBuffer("Java programming is fun");
	      System.out.println(a.reverse()); */
	     
	     String first = "Automation";
	     char ch[] = first.toCharArray();
	     System.out.println(ch.length);
	     
	     String rev = "";
	     
	     for(int i=ch.length-1; i>=0; i--)
	     {
	 
	    	 System.out.print(ch[i]);
	    	 
	     }

	}

}
