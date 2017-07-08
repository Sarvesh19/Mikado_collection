import java.util.*;


public class MyQueue<T>
{
	ArrayDeque<T> adq = new ArrayDeque<>();
	
	public void offer(T object)
	{
		adq.offer(object);
	}
	public T poll()
	{
		return adq.poll();
	}
	public T peek()
	{
		return adq.peek();
	}
};