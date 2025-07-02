package July01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListWithIterator {
    public static void main(String[] args) {
        ArrayList<Integer> myNumList = new ArrayList<Integer>();

        myNumList.add(1);
        myNumList.add(2);
        myNumList.removeFirst();
        myNumList.add(3);

        for (Integer i : myNumList) {
            System.out.println(i);
        }

        Iterator<Integer> it = myNumList.iterator();
        do {
            System.out.println(it.next());
        } while (it.hasNext());

    }
}
