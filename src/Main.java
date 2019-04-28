
import CustomIterable.CustomArrayList;
import CustomIterable.NormalArrayList;

public class Main {

    public static void main(String[] args) {

        CustomArrayList customArrayList = new CustomArrayList();

        customArrayList.add("Test 1");
        customArrayList.add("Test 2");
        customArrayList.add("Test 3");


        NormalArrayList normalArrayList = new NormalArrayList();

        normalArrayList.add("Normal 1");
        normalArrayList.add("Normal 2");
        normalArrayList.add("Normal 3");


        // this giving us error bcoz this calss is not iterable
//        for (String normalVal: normalArrayList) {
//            System.out.println(normalVal);
//        }


        // this is iterable as the class customarrlist is iterable
        for(Object customVal : customArrayList) {
            System.out.println(customVal);
        }
    }
}
