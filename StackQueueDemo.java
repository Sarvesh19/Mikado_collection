public class StackQueueDemo
{
	public static void main(String args[])
	{
		MyStack<Employee> stack = new MyStack<>();
		stack.push(new Employee(1,null,0));
		stack.push(new Employee(2,null,0));
		System.out.println("POP = "+stack.pop());
		MyQueue<Employee> queue = new MyQueue<>();
		queue.offer(new Employee(1,null,0));
		queue.offer(new Employee(2,null,0));
		System.out.println(queue.peek());
		System.out.println(queue.poll());
	}
};