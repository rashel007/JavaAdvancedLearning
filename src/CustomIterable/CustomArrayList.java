package CustomIterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomArrayList<T> implements Iterable<T> {


    List<T> listItem = new ArrayList<>();

    public void add(T val){
        listItem.add(val);
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomIterator<>(listItem);
    }


    public class CustomIterator<E> implements Iterator<E> {

        int indexPosition = 0;

        List<E> innerList;

        public CustomIterator(List<E> innerList) {
            this.innerList = innerList;
        }

        @Override
        public boolean hasNext() {

            if (innerList.size() >= indexPosition + 1) {
                return true;
            }

            return false;
        }

        @Override
        public E next() {

            E val = innerList.get(indexPosition);
            indexPosition++;
            return val;
        }
    }

}
