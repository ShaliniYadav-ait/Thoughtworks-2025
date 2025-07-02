package July01;

import java.util.ArrayList;
import java.util.Collections;

public class GuideEmpSorting {

    public static void main(String[] args){
        ArrayList<Emp> empList = new ArrayList<>();
        empList.add(new Emp(10,"Julie"));
        empList.add(new Emp(2,"Jack"));
        empList.add(new Emp(30,"John"));
        empList.add(new Emp(4,"David"));
        System.out.println(empList);
        Collections.sort(empList);
    }
}

class Emp implements Comparable<Emp>{
    int id;
    String name;

    public Emp(int id, String name){
        this.id =   id;
        this.name = name;

        getName();
    }

    public  int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Emp{" + "id = " + id + " , name = " + name + '\''+ '}';
    }

    @Override
    public int compareTo(Emp o1){
        return this.id - o1.id;
    }
}

