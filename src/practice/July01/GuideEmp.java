package practice.July01;
import java.util.Vector;

public class GuideEmp {
    public static void main(String[] args){
        Vector<String> listOfNames = new Vector<>();

        listOfNames.add("Julie");
        listOfNames.add("David");
        listOfNames.add("John");
        listOfNames.add("Jane");
        listOfNames.add("Julie");
        listOfNames.add("David");
        listOfNames.add("John");
        listOfNames.add("Jane");

        System.out.println(listOfNames.size());
        System.out.println(listOfNames);
        System.out.println(listOfNames.capacity());
        listOfNames.trimToSize();
        System.out.println(listOfNames.capacity());
    }
}
