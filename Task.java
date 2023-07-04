//Формат сдачи: ссылка на подписанный git-проект.
//Задание
//Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
//1) Умножьте два числа и верните произведение в виде связанного списка.
//2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными.
//3)*Реализовать стэк с помощью массива. Нужно реализовать методы: size(), empty(), push(), peek(), pop().

class Deque
{
	private int arr[];
	private int top;
	private int capacity;

	// Constructor to initialize the stack
	Deque(int size)
	{
		arr = new int[size];
		capacity = size;
		top = -1;
	}

	// Utility function to add an element `x` to the stack
	public void push(int x)
	{
		if (isFull())
		{
			System.out.println("Overflow\nProgram Terminated\n");
			System.exit(-1);
		}

		System.out.println("Inserting " + x);
		arr[++top] = x;
	}

	// Utility function to pop a top element from the stack
	public int pop()
	{
		// check for stack underflow
		if (isEmpty())
		{
			System.out.println("Underflow\nProgram Terminated");
			System.exit(-1);
		}

		System.out.println("Removing " + peek());

		// decrease stack size by 1 and (optionally) return the popped element
		return arr[top--];
	}

	// Utility function to return the top element of the stack
	public int peek()
	{
		if (!isEmpty()) {
			return arr[top];
		}
		else {
			System.exit(-1);
		}

		return -1;
	}

	// Utility function to return the size of the stack
	public int size() {
		return top + 1;
	}

	// Utility function to check if the stack is empty or not
	public boolean isEmpty() {
		return top == -1;   			// or return size() == 0;
	}

	// Utility function to check if the stack is full or not
	public boolean isFull() {
		return top == capacity - 1; 	// or return size() == capacity;
	}
}

class Main
{
	public static void main (String[] args)
	{
		Deque stack = new Deque(3);

		stack.push(1);  	
		stack.push(2);  	

		stack.pop();		
		stack.pop();		
	

		stack.push(333);  	

		System.out.println("The top element is " + stack.peek());
		System.out.println("The stack size is " + stack.size());

		stack.pop();		// removing the top element (3)

		// check if the stack is empty
		if (stack.isEmpty()) {
			System.out.println("The stack is empty");
		}
		else {
			System.out.println("The stack is not empty");
		}
	}
}
