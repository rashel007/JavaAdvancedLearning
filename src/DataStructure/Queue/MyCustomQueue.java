package DataStructure.Queue;

import java.util.Iterator;
import java.util.LinkedList;

public class MyCustomQueue<T> implements Iterable<T> {

    LinkedList<T> list = new LinkedList<>();

    public MyCustomQueue() {
    }

    public MyCustomQueue(T element) {
        offer(element);
    }


    // return the size of the queue
    public int size() {
        return list.size();
    }

    // returns whether or not the queue is empty
    public boolean isEmpty() {
        return size() == 0;
    }

    // Peek the element at the front of the queue
    // The method throws an error if the queue is empty
    public T peek() {
        if (isEmpty()) throw new RuntimeException("Queue empty");

        return list.peekFirst();
    }

    // Poll an element from the front of the queue
    // The method throws an error if the queue is empty
    public T pool() {
        if (isEmpty()) throw new RuntimeException("Queue empty");

        return list.removeFirst();
    }

    // add an element to the back of the queue
    public void offer(T element) {
        list.addLast(element);
    }


    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
