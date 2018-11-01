package OOPConceptPart2;

public class TestCar {
	
	public static void main(String args[]) {
		
		// Polymorphism: One to Many methods
		
		// static polymorphism -- compile-time polymorphism
		BMW b = new BMW();
		b.start();
		b.theftSafety();
		b.stop();
		//b.engine();
		
		System.out.println("***********************************");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("*****************************************");
		
		// Top casting
		Car c1 = new BMW(); // Child class object can be referred by parent class reference varibale--- dynamic polymorphism -- Runtime polymorphism
		c1.start();
		c1.stop();
		c1.refuel();
		
		// Down casting is not allowed
		//BMW b1 = new Car();
		// By using casting, it can allow
		BMW b2 = (BMW)new Car();
		
	}

}
