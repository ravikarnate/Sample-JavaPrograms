package javanav;

public class ArrayConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array: To store similar data type values in a array variable
		//lowest bound/index = 0
		//upper bound/index = n-1(n is size of array	)
		// 1 dimensional array
		
		//Dis-advantages of array: 
		//1. Size is fixed (Static array)  -- To overcome this problem, we use Collections -- Arraylist, Hashtable -- use Dynamic array
		// Stores similar data type  -- To overcome of this problem, we use object array 
		
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[2]);
		System.out.println(i.length);
				
		//Print all the values of array
		for(int j=0; j<i.length; j++)
		{
			System.out.println(i[j]);
		}
		
		
		// Object array: (Object is a class) -- It is used store different data types values
		Object obj[] = new Object[6];
		obj[0] = "Ravi";
		obj[1] = 25;
		obj[2] = 12.33;
		obj[3] = "01/02/1988";
		obj[4] = "M";
		obj[5] = "London";
		
		System.out.println(obj[3]);
		System.out.println(obj.length);
		
		
		
		
		
	}

}
