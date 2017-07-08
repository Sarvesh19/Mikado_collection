import java.util.*;
class IntegerComparator implements Comparator<Integer>
{
	public int compare(Integer i, Integer j)
	{
		return j - i;
	}
};

public class QueueDemo 
{
	public static void main(String args[])
	{
		Integer[] arr = {5,6,1,2,7,8,9};

		/*PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(Integer i : arr)
			pq.offer(i);
		for(Integer i : arr)
			System.out.print(pq.poll()+" ");
		System.out.println("");
		System.out.println("Queue Size = "+pq.size());

	System.out.println("\n");

		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(10,new IntegerComparator());
		for(Integer i : arr)
			pq1.offer(i);
			for(Integer i : arr)
			System.out.print(pq1.peek()+" ");
		System.out.println("");
		System.out.println("Queue Size = "+pq1.size());*/




		/*PriorityQueue<Employee> adq = new PriorityQueue<Employee>(new EmployeeComparator());
		adq.offer(new Employee(2,"Deepak",8500));
		adq.offer(new Employee(1,"Sunil",6000));
		adq.offer(new Employee(3,"Bharat",6000));
		System.out.println(adq);
		System.out.println(adq.contains(new Employee(1,null,0)));
		adq.remove();
		System.out.println(adq);
		System.out.println("Peek = "+adq.peek());
		System.out.println("Poll = "+adq.poll());
		System.out.println(adq);*/

	}
};
