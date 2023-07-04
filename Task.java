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
		arr = new int[size+1];
		capacity = size;
		top = -1;
	}

	// Utility function to add an element `x` to the stack
	public void push(int x)
	{
		if (isFull())
		{
			System.out.println("Overflow");
			System.exit(-1);
		}

		System.out.println("add " + x);
		arr[++top] = x;
	}

	// Utility function to pop a top element from the stack
	public int pop()
	{
		// check for stack underflow
		if (isEmpty())
		{
			System.out.println("Underflow");
			System.exit(-1);
		}
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
	    int OneNum = -111;
	    int TwoNum = 22;
	    int RezOfOneTwo = OneNum * TwoNum;
	    int RezSumOfOneTwo = OneNum + TwoNum;
	    
		Deque stackOne = new Deque(String.valueOf(OneNum).length());
		Deque stackTwo = new Deque(String.valueOf(TwoNum).length());
		Deque stackRez = new Deque(String.valueOf(RezOfOneTwo).length());
		Deque stackRezSum = new Deque(String.valueOf(RezSumOfOneTwo).length());
		
		while (!stackOne.isFull())
		{
		    int OneNum1 = OneNum % 10;
		    OneNum = OneNum / 10;
		    stackOne.push(OneNum1);
		}
		System.out.println("The stack size is " + stackOne.size());
		
		
		while (!stackTwo.isFull())
		{
		    int TwoNum1 = TwoNum % 10;		    
		    TwoNum = TwoNum / 10;
		    stackTwo.push(TwoNum1);
		}
		System.out.println("The stack size is " + stackTwo.size());
		
		
		while (!stackOne.isEmpty())
		{
		    System.out.print(stackOne.pop() + " ");
		}
		
		while (!stackTwo.isEmpty())
		{
		    System.out.print(stackTwo.pop() + " ");
		}
		System.out.println();
		
	    //	System.out.println("The top element is " + stackOne.peek());
		////////////////////
		while (!stackRez.isFull())
		{
		    int RezOfOneTwo1 = RezOfOneTwo % 10;
		    RezOfOneTwo = RezOfOneTwo / 10;
		    stackRez.push(RezOfOneTwo1);
		}
		
		System.out.print("Multiplication: ");
		while (!stackRez.isEmpty())
		{
		    System.out.print(stackRez.pop() + "");
		}
		System.out.println();
		System.out.println("The stack size is " + stackRez.size());
		////////////////////
		
		
		while (!stackRezSum.isFull())
		{
		    int RezSumOfOneTwo1 = RezSumOfOneTwo % 10;
		    RezSumOfOneTwo = RezSumOfOneTwo / 10;
		    stackRezSum.push(RezSumOfOneTwo1);
		}
		
		System.out.print("Sum: ");
		while (!stackRezSum.isEmpty())
		{
		    System.out.print(stackRezSum.pop() + " ");
		}
		System.out.println();
		System.out.println("The stack size is " + stackRezSum.size());
		

	}	
}
