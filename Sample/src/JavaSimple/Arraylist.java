package JavaSimple;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Karthika");
		list.add("Pragathi");
		
		list.set(0, "Karthi");
		
		System.out.println(list.get(0));
		System.out.println(list.size());
		
		for(String elements : list) {
			System.out.println(elements);
			
		}
		
		list.remove(2);
		System.out.println(list.size());
		
	
		System.out.println(list.size());

	}

}
