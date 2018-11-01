import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Collectiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList value = new ArrayList();
		value.add(12);
		value.add(24);
		value.add(36);
		
		System.out.println(value);
		
		Collection value1 = new ArrayList();
		value1.add(2);
		value1.add(4);
		value1.add(6);
		
		System.out.println(value1);
		Iterator it = value.iterator();		
		
		while(it.hasNext()) {

			System.out.println(it.next());
				
		}
		/*while(it.hasNext()) {
			System.out.println(it.next());
		}*/
				
	}

}
