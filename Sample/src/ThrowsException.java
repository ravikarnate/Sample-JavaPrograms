import java.io.FileWriter;
import java.io.IOException;

public class ThrowsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
	           FileWriter file = new FileWriter("c:\\Data1.txt");
	           file.write("Guru99");
	           file.close();
	    }
	    catch(IOException e){
	    	System.out.println("Catch block printed = " +e);
	    }
	}

}
