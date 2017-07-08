import java.util.*;
public class ArraysDemo1  
{
	public static void main(String[] args) 
	{
		String str[] = {"sanjay","Anil","Prafull","sidharth"};
		System.out.println("Unsorted "+str[0]+" "+str[1]+" "+str[2]+" "+str[3]);
		Arrays.sort(str);
		System.out.println("Sorted ");
			for(String s : str)
			System.out.println(s);
	}
}
