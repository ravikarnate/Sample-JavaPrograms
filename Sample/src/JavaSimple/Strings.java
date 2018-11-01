package JavaSimple;

public class Strings {

	private static final String String = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myString = "Hello World";
        int myStringLength = myString.length();
        String myStringLowerCase = myString.toLowerCase();
        
		/*System.out.println(myString);
        System.out.println(myStringLength);
        System.out.println(myStringLowerCase);*/
        
        //System.out.println(myString.replace('l', 'k'));
        //System.out.println(myString.compareToIgnoreCase("hello World"));
        
        naming("Ravi");
       
	}
	
	public static void naming(String name) {
		System.out.println("My name is " +name);
	}

}
