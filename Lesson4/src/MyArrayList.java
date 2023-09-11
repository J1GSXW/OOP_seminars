import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<E> implements Iterable<E>{
    private E[] array;
    private int currentIndex = -1;

    public MyArrayList(E[] array) {
        this.array = array;
    }

    public int size(){
        return currentIndex + 1;
    }

    public void add(E value){
        if(currentIndex + 1 < array.length){
            array[++currentIndex] = value;
        }
    }

    public E getValue(int index) {
        E currentValue = null;
        for (int i = 0; i < array.length; i++) {
            if (i == index)
                currentValue = array[i];
        }
        return currentValue;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyArrayListIterator();
    }
    class MyArrayListIterator implements Iterator<E>{

        private Iterator<E> iterator = Arrays.stream(array).iterator();

        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }

        @Override
        public E next() {
            return iterator.next();
        }
    }
}

