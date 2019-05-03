import DataStructure.LinkedList.SinglyLinkedList;
import DataStructure.Stack.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> myStack = new Stack<>();

        myStack.push(2);
        myStack.push(3);
        myStack.push(4);


        for (Integer value: myStack){
            System.out.println(value);
        }
        System.out.println("--------");
        myStack.pop();
        System.out.println(myStack.peek());
        System.out.println("--------");
        myStack.pop();
        for (Integer value: myStack){
            System.out.println(value);
        }
        System.out.println("--------");
        System.out.println(myStack.peek());

    }
}
