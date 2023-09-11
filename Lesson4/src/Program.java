import java.util.ArrayList;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Employee("Игорь", 22));
        arrayList.add(true);
        arrayList.add(12);
        arrayList.add("hello");


        MyArrayList<Employee> myArrayList = new MyArrayList(new Employee[10]);
        myArrayList.add(new Employee("Вася", 40));
        System.out.println("Количество элементов в коллекции: " + myArrayList.size());


        for (Employee e: myArrayList) {
            if(e != null){
                System.out.println(e.getName());
            }
        }

        Integer[] array1 = new Integer[]{ 5, 6, -1, 12, 1 };
        String[] array2 = new String[] {"AA", "BB", "CC", "DD"};
        System.out.println(Arrays.toString(array1));
        Integer[] res = ArrayUtils.replaceTwoElements(array1, 1, 2);
        System.out.println(Arrays.toString(res));
    }
}