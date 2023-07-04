//Формат сдачи: ссылка на подписанный git-проект.
//Задание
//Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
//1) Умножьте два числа и верните произведение в виде связанного списка.
//2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными.
//3)*Реализовать стэк с помощью массива. Нужно реализовать методы: size(), empty(), push(), peek(), pop().

class Deque {
    private int arr[];
    private int top;
    private int capacity;

    Deque(int size) {
        arr = new int[size + 1];
        capacity = size;
        top = -1;
    }

    // реализация метода push с проверкой на переполнение коллекции
    public void push(int x) {
        if (isFull()) {
            System.out.println("Overflow");
            System.exit(-1);
        }

        System.out.println("add " + x);
        arr[++top] = x;
    }

    // реализация метода pop с проверкой опустожение коллекции
    public int pop() {

        if (isEmpty()) {
            System.out.println("Underflow");
            System.exit(-1);
        }
        return arr[top--];
    }

    // реализация метода peek, без удаления самого элемента из коллекции
    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.exit(-1);
        }
        return -1;
    }

    // реализация метода size
    public int size() {
        return top + 1;
    }

    // проверка на пустоту коллекции
    public boolean isEmpty() {
        return top == -1;
    }

    // проверка на заполненость коллекции
    public boolean isFull() {
        return top == capacity - 1;
    }
}

class Task {
    public static void main(String[] args) {
        // ввожу числа
        int OneNum = -87;
        int TwoNum = 22;
        // нахожу результат умножения и сложения
        int RezOfOneTwo = OneNum * TwoNum;
        int RezSumOfOneTwo = OneNum + TwoNum;
        System.out.println("Результат суммы: " + RezSumOfOneTwo);
        System.out.println("Результат умнажения: " + RezOfOneTwo);

        // Создаю Deque для каждой переменной и результата исчисления, передаю в Deque размеры переменной
        Deque stackOne = new Deque(String.valueOf(OneNum).length());
        Deque stackTwo = new Deque(String.valueOf(TwoNum).length());
        Deque stackRez = new Deque(String.valueOf(RezOfOneTwo).length());
        Deque stackRezSum = new Deque(String.valueOf(RezSumOfOneTwo).length());

        // помещаю 1 переменную в Deque, каждая цифра - отдельный узел
        while (!stackOne.isFull()) {
            int OneNum1 = OneNum % 10;
            OneNum = OneNum / 10;
            stackOne.push(OneNum1);
        }

        // Тест на Overflow (удали коментарии в следующей строке)
        // stackOne.push(1);

        // вывожу размер введеной 1 переменной
        System.out.println("Размер: " + stackOne.size());

        // помещаю 2 переменную в Deque, каждая цифра - отдельный узел
        while (!stackTwo.isFull()) {
            int TwoNum1 = TwoNum % 10;
            TwoNum = TwoNum / 10;
            stackTwo.push(TwoNum1);
        }
        // вывожу размер введеной 2 переменной
        System.out.println("Размер: " + stackTwo.size());

        // извлекаю 1 переменную из Deque
        while (!stackOne.isEmpty()) {
            System.out.print(stackOne.pop() + " ");
        }

        // Тест на Underflow (удали коментарии в следующей строке)
        // System.out.print(stackOne.pop() + " ");

        // извлекаю 2 переменную из Deque
        while (!stackTwo.isEmpty()) {
            System.out.print(stackTwo.pop() + " ");
        }
        System.out.println();

        //	System.out.println("The top element is " + stackOne.peek());
        ////////////////////

        // помещаю результат умнажения в Deque, каждая цифра - отдельный узел
        while (!stackRez.isFull()) {
            int RezOfOneTwo1 = RezOfOneTwo % 10;
            RezOfOneTwo = RezOfOneTwo / 10;
            stackRez.push(RezOfOneTwo1);
        }
        // извлекаю результат умножения из Deque, очищая сам Deque

        System.out.print("Multiplication: ");
        while (!stackRez.isEmpty()) {
            System.out.print(stackRez.pop() + " ");
        }
        System.out.println();
        System.out.println("Размер: " + stackRez.size());
        ////////////////////

        // помещаю результата суммирования в Deque, каждая цифра - отдельный узел
        while (!stackRezSum.isFull()) {
            int RezSumOfOneTwo1 = RezSumOfOneTwo % 10;
            RezSumOfOneTwo = RezSumOfOneTwo / 10;
            stackRezSum.push(RezSumOfOneTwo1);
        }

        // извлекаю результат суммировани из Deque, очищая сам Deque
        System.out.print("Sum: ");
        while (!stackRezSum.isEmpty()) {
            System.out.print(stackRezSum.pop() + " ");
        }
        System.out.println();
        System.out.println("Размер: " + stackRezSum.size());


    }
}
