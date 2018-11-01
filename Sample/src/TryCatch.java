
public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	      try {

	    	  int d = 1;
	    	   int n = 20;
	    	   int fraction = n / d;
	    	   int g[] = {
	    	    1
	    	   };
	    	   g[20] = 100;
		   
	      }
	    /*  catch(Exception e){
	    	  	System.out.println("In the catch clock due to Exception = "+e);
	      }*/
	      
	      catch (ArithmeticException e) 
	      {
	    	   System.out.println("In the catch clock due to Exception = " + e);
	    	  }
	      catch (ArrayIndexOutOfBoundsException e) {
	    	   System.out.println("In the catch clock due to Exception = " + e);
	    	  }
	      finally{
	    		System.out.println("Inside the finally block");
	    	  }
	    	  System.out.println("End Of Main");
	}
}
