import DataStructure.DynamicArray;
import LinkedList.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList<String> mySList = new SinglyLinkedList<>();

        mySList.addFirst("First 1");
        mySList.addFirst("First 2");
        mySList.addFirst("First 3");
        mySList.addLast("Last 1");
        mySList.addLast("Last 2");
        mySList.addLast("Last 3");


        while (!mySList.isEmpty()){
            mySList.removeFirst();
        }


    }
}
