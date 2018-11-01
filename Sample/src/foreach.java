import java.text.SimpleDateFormat;
import java.util.Date;

public class foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arrData = {"Alpha", "Beta", "Gamma", "Delta", "Sigma"};
		
		int length = arrData.length;
		System.out.println(arrData);
		
		for(String temp: arrData) {
			System.out.println(temp);
			
		}
		
		
		
		 Date objDate = new Date();
		  // Display the Date & Time using toString()
		 //System.out.println(objDate);
		 System.out.println(objDate.toString());
		  
		  String strDateFormat = "hh:mm:ss a dd-MMM-yyyy"; //Date format is Specified
		  SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); 
		  System.out.println(objSDF.format(objDate)); 
	}

}
