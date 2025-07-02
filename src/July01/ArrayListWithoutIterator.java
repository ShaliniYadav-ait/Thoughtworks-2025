package July01;

import java.util.ArrayList;

public class ArrayListWithoutIterator {
    public static void main(String[] args) {
        ArrayList<Object> randomList = new ArrayList<>();
        randomList.add(10);
        randomList.add("b");
        randomList.add(3.14f);

        System.out.println(randomList);
    }
}