import java.util.*;


public class MyStack<T>
{
	ArrayDeque<T> adq = new ArrayDeque<>();

	public void push(T object)
	{
		adq.offerFirst(object);
	}
	public T pop()
	{
		return adq.pollFirst();
	}
};