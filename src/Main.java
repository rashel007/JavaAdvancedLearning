import DataStructure.DynamicArray;

public class Main {

    public static void main(String[] args) {

        DynamicArray<String> array = new DynamicArray<>();

        array.add("Name 1");
        array.add("Name 2");
        array.add("Name 3");

        System.out.println(array.size());

        array.removeAt(1);
        System.out.println(array.size());

    }
}
