package June26;

public class SimpleInheritence {
    public static void main(String[] args){
        ChildClass childClass = new ChildClass();
        System.out.println("Child name is " + childClass.firstName + " " + childClass.lastName);
        System.out.println("Parent name is " + childClass.pFirstName + " " + childClass.pLastName);
    }

}

class ParentClass {
    String pFirstName, pLastName;
    ParentClass(){
        this.pFirstName = "Shalini";
        this.pLastName = ParentLastName();
    }

    String ParentLastName(){
        return "Yadav";
    }
}


class ChildClass extends ParentClass {
    String firstName, lastName;
    ChildClass(){
        this.firstName = "Avyukt";
        this.lastName = LastName();
    }

    String LastName(){
        return "Vats";
    }
}