public class ArrayUtils {

    public static<E> E[] replaceTwoElements(E[] array, int index1, int index2){
        if (index1 >= array.length || index2 >= array.length || index1 < 0 || index2 < 0)
            throw new IndexOutOfBoundsException();
        E[] newArray = array.clone();
        E obj = newArray[index1];
        newArray[index1] = newArray[index2];
        newArray[index2] = obj;
        return newArray;
    }
}
