package javanav;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x = "100";
		System.out.println(x+200);
		
		// Data conversion from String to Integer
		int i = Integer.parseInt(x);
		System.out.println(i+200);
		
		// Wrapper class - Integer, Double, Boolean, Character
		
		// String to Double conversion
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to Boolean
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		//Int to String conversion
		int j = 200;
		String s = String.valueOf(j);
		System.out.println(s+90);

	}

}
