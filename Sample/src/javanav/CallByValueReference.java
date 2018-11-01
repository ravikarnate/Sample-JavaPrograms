package javanav;

public class CallByValueReference {
	
	int p;
	int q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallByValueReference obj = new CallByValueReference();
		int x = 10;
		int y = 20;
		obj.sum(x, y); // Call by value (or) pass by value
		
		obj.p=50;
		obj.q=60;
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	
	// Call by value
	public void sum(int a, int b) {
		int c = a+b;
	}

	// call by reference
	public void swap(CallByValueReference t) {
		
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;
		
	}
}
