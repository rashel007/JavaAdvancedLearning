import DataStructure.DynamicArray;
import LinkedList.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList<Integer> mySList = new SinglyLinkedList<>();

        mySList.addFirst(1);
        mySList.addFirst(2);
        mySList.addFirst(3);

//        mySList.addLast("Last 1");
//        mySList.addLast("Last 2");
//        mySList.addLast("Last 3");
//
//
//        while (!mySList.isEmpty()){
//            mySList.removeFirst();
//        }


        System.out.println(mySList.hasElement(5));
    }
}
