package DataStructure.Stack;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

public class Stack<T> implements Iterable<T>{


    private LinkedList <T> list = new LinkedList<>();

    // Create and empty stack
    public Stack(){}

    // Create a Stack with an initial element
    public Stack (T element){
        push(element);
    }


    // return the number of elements in the stack
    public int size(){
        return list.size();
    }


    // Check if stack is empty
    public boolean isEmpty() {
        return list.size() == 0;
    }

    // push an element on the stack
    public void push(T element){
        list.push(element);
    }


    // Pop an element off the stack
    // Throws an error if the stack is empty
    public T pop() {
        if (isEmpty()) throw new EmptyStackException();

        return list.removeLast();
    }

    // peek the top of the stack without removing an element
    // throws an exception if the stack is empty
    public T peek() {
        if (isEmpty()) throw new EmptyStackException();

        return list.peekLast();
    }

    // allow users to iterate through the stack using an iterator

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
