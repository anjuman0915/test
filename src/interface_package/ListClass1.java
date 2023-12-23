package interface_package;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClass1 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(1);
        arrayList.add(3);

        System.out.println(arrayList.get(0));


    }
}
