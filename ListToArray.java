import java.util.*;

public class ListToArray
{
	public static void main(String args[])
	{
		List<Integer> il = new ArrayList<Integer>();
		for(int i = 0; i<3; i++)
			il.add(i);
		Object [] o = il.toArray();
		Integer[] arr = new Integer[3];
			il.toArray(arr);
		for(Integer r : arr)
			System.out.println(r);
		arr[0] = 10;
		System.out.println("\n");
				for(Integer r : arr)
			System.out.println(r);
		System.out.println("\n");
		System.out.println(il);
	}
};