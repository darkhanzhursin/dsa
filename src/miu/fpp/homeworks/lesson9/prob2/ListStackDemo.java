package miu.fpp.homeworks.lesson9.prob2;

import java.util.LinkedList;
import java.util.List;

public class ListStackDemo {
    private List<Object> list;
    private int top;

    public ListStackDemo() {
        list = new LinkedList();
        top = -1;
    }

    public void push(Object item) {
        top++;
        list.add(item);
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        Object item = list.get(top);
        top--;
        return item;
    }

    public Object peek() {
        if (isEmpty()) return null;
        return list.get(top);
    }

    public boolean isEmpty() { return top == -1; }

    public int size() { return top + 1; }

    public static void main(String[] args) {
        ListStackDemo listStackDemo = new ListStackDemo();
        listStackDemo.push("A");
        listStackDemo.push("B");
        listStackDemo.push("C");
        System.out.println(listStackDemo.peek());
        System.out.println(listStackDemo.pop());
        System.out.println(listStackDemo.size());
        System.out.println(listStackDemo.pop());
        System.out.println(listStackDemo.pop());
        System.out.println(listStackDemo.pop());
        System.out.println(listStackDemo.isEmpty());
    }
}
