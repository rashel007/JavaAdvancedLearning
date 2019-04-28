package CustomIterable;

import java.util.ArrayList;
import java.util.List;

public class NormalArrayList<T> {

    List<T> listItem = new ArrayList();

    public void add(T val){
        listItem.add(val);
    }
}
