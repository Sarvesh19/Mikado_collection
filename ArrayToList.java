import java.util.*;
public class  ArrayToList
{
	public static void main(String[] args) 
	{
		String str[] = {"one","two","three","four"};
		
		List<String> list = Arrays.asList(str);
		System.out.println(list+"\n");

		list.set(0,"five");
		System.out.println(list+"\n");

		//list.set(4,"aaa");//ArrayIndexOutOfBoundsException

		for(String s : str)
			System.out.println(s);

		System.out.println("\n");

		str[1] = "six";

				System.out.println(list+"\n");

		for(String s : str)
			System.out.println(s);
	}
}
