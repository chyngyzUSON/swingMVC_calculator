public class Stack<T> {
    private T[] stacksArray;
    private int stackSize;
    private int top = -1;

    public Stack(int size) {
        stackSize = size;
        stacksArray = (T[]) new Object[stackSize];
    }

    public boolean isFull() {
        return top == stackSize -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(T element) {
        if (isFull()) {
            System.out.println("Стэк заполнен");
            throw new ArrayIndexOutOfBoundsException();
        }
        top++;
        stacksArray[top] = element;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Cтэк пуст и не может быт разобрано");
            throw new RuntimeException();
        }
        T element = stacksArray[top];
        top--;
        return element;
    }

    public T peek() {
        return stacksArray[top];
    }
}
