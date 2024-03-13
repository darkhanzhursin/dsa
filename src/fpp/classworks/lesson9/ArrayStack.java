package fpp.classworks.lesson9;

import java.util.Arrays;
import java.util.Stack;

public class ArrayStack {
    private Object a[];
    private int top;

    public ArrayStack(int n) {
        a = new Object[n];
        top = -1;
    }

    public void push(Object item) {
        if (top == a.length - 1) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        a[top] = item;
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        Object item = a[top];
        top--;
        return item;
    }

    public Object peek() {
        if (isEmpty()) return null;
        return a[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5);
        arrayStack.push("A");
        arrayStack.push(123);
        arrayStack.push('@');
        arrayStack.push(Arrays.asList("Hi", "How are you?"));
        arrayStack.push(10923_4324234324L);
        int n = arrayStack.size();
        for (int i = 0; i < n; i++) {
            System.out.println(arrayStack.pop());
        }
        System.out.println();
        Stack<Integer> s = new Stack<>();
        s.push(42);
        s.push(-2);
        s.push(90);
        System.out.println(s.pop());
        System.out.println(s.size());
    }
}
