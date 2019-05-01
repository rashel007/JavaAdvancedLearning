package LinkedList;


import java.util.Iterator;

public class DoublyLinkedList<T> implements Iterable<T> {

    private int size = 0;

    private Node<T> head = null;

    private Node<T> tail = null;

    // internal node class to represent data
    private class Node<T> {
        T data;
        Node<T> prev, next;

        public Node(T data, Node<T> prev, Node<T> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
            
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }


    // Empty this linked list, 0(n)
    public void clear() {
        Node<T> trav = head;
        while (trav != null) {
            Node<T> next = trav.next;
            trav.prev = trav.next = null;
            trav = next;
        }

        head = tail = trav = null;
        size = 0;
    }

    // return the size of this linked list
    public int size() {
        return size;
    }

    // Is this linked list empty
    public boolean isEmpty() {
        return size() == 0;
    }

    // add an element to the beginning of this linked list, 0(1)
    public void addFirst(T elem) {

        if (isEmpty()) {
            head = tail = new Node<T>(elem, null, null);
        } else {
            head.prev = new Node<T>(elem, null, head);
            head = head.prev;
        }

        size++;
    }

    // add a node to the tail of the linked list, 0(1)
    public void addLast(T elem) {

        if (isEmpty()) {
            head = tail = new Node<T>(elem, null, null);
        } else {
            tail.next = new Node<T>(elem, tail, null);
            tail = tail.next;
        }

        size++;
    }

    // add an element to the tail of the linked list, 0(1)
    public void add(T elem) {
        addLast(elem);
    }

    // Check the value of the first node if it exists, 0(1) {
    public T peekFirst() {
        if (isEmpty()) throw new RuntimeException("Empty list");
        return head.data;
    }

    // Check the value of the last node if exists, 0(1)
    public T peekLast() {
        if (isEmpty()) throw new RuntimeException("Empty list");
        return tail.data;
    }


    //    remove the first value at the head of th linked list, 0(1)
    public T removeFirst() {

        if (isEmpty()) throw new RuntimeException("Empty list");

        // Extract the data at the head and move
        // the head pointer forwards one node

        T data = head.data;
        head = head.next;
        --size;

        // if the list is empty set the tail to null as well
        if (isEmpty()) tail = null;

            // Do a memory clean of the previous node
        else head.prev = null;

        // return the data that was at the first node we just removed
        return data;
    }

    // Remove the last value at the tail of the linked list
    private T removeLast() {

        if (isEmpty()) throw new RuntimeException("Empty list");

        T data = tail.data;
        tail = tail.prev;
        --size;


        // If the list is now empty set the head to null as well
        if (isEmpty()) head = null;

            // Do a memory clean of the node that was just removed
        else tail.next = null;

        // return the data that was at the first node we just removed
        return data;
    }

    // removed an arbitrary node from the linked list, 0(1)
    private T remove(Node<T> node) {

        // If the node to remove is somewhere either at the
        // head or the tail handle those independently
        if (node.prev == null) return removeFirst();
        if (node.next == null) return removeLast();

        node.next.prev = node.prev;
        node.prev.next = node.next;

        //Temporary store the data we want to return
        T data = node.data;

        // memory cleanuo
        node.data = null;
        node = node.prev = node.next = null;
        --size;

        return data;


    }

    // remove a node at a particular index. 0(n)
    public T removeAt(int index) {

        if (index < 0 || index >= size) throw new IllegalArgumentException();

        int i;
        Node<T> trav;

        // search fro the front of the last
        if (index < size / 2) {
            for (i = 0, trav = head; i != index; i++)
                trav = trav.next;
        } else {
            // search from the back of the list
            for (i = size - 1, trav = tail; i != index; i--)
                trav = trav.prev;
        }

        return remove(trav);
    }

    // remove a particular value in the linked list, 0(n)
    public boolean remove(Object obj) {
        Node<T> trav;

        // Support searching for null
        if (obj == null) {
            for (trav = head; trav != null; trav = trav.next) {
                if (trav.data == null) {
                    remove(trav);
                    return true;
                }
            }
        } else {
            // search for non null object

            for (trav = head; trav != null; trav = trav.next) {
                if (obj.equals(trav.data)) {
                    remove(trav);
                    return true;
                }
            }
        }

        return false;


    }


    // find the index of a particular value in the linked list, 0(n)

    public int indexOF(Object obj) {

        int index = 0;
        Node<T> trav;

        // support for null
        if (obj == null) {

            for (trav = head; trav != null; trav = trav.next, index++) {
                if (trav.data == null)
                    return index;
            }
        } else {
            // search for non null obj
            for (trav = head; trav != null; trav = trav.next, index++) {
                if (obj.equals(trav.data))
                    return index;
            }
        }

        return -1;


    }

    // check is a value is contained within the linked list
    public boolean contains(Object obj) {
        return indexOF(obj) != -1;
    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> trav = head;

            @Override
            public boolean hasNext() {
                return trav != null;
            }

            @Override
            public T next() {
                T data = trav.data;
                trav = trav.next;
                return data;
            }
        };
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        Node<T> trav = head;
        while (trav != null) {
            sb.append(trav.data + ", ");
            trav = trav.next;
        }

        sb.append(" ]");


        return sb.toString();
    }
}
