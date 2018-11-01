package OOPSConcept1;

public class Car {

	// Class variables 
	int mod;
	int wheel;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// new Car(); -- this is Object of Car Class
		// new keyword is used to create the object
		// a,b,c ---- Object reference variable	s
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod=2015;
		a.wheel=4;
		
		b.mod=2014;
		b.wheel=4;
		
		c.mod=2013;
		c.wheel=4;
		
		System.out.println("Before assigning the references");
		
		System.out.println(a.mod);
		System.out.println(b.mod);
		System.out.println(c.mod);
		
		System.out.println("After shifting the references");
		
		a=b;
		b=c;
		c=a;
		
		a.mod=10;
		System.out.println(a.mod);
		c.mod=20;
		System.out.println(a.mod);
		System.out.println(c.mod);
		
		
		
		
		
		
		
		
	}

}
