import DataStructure.LinkedList.SinglyLinkedList;
import DataStructure.Queue.MyCustomQueue;
import DataStructure.Stack.Stack;

public class Main {

    public static void main(String[] args) {

        MyCustomQueue<Integer> queue = new MyCustomQueue<>();

        queue.offer(3);
        queue.offer(2);
        queue.offer(1);

        for (Integer value: queue){
            System.out.println(value);
        }

        queue.pool();

        for (Integer value: queue){
            System.out.println(value);
        }



    }
}
