public class SimpleInheritence {
    public static void main(String[] args){
        Child child = new Child();
        System.out.println("Child name is " + child.firstName + " " + child.lastName);
        System.out.println("Parent name is " + child.pFirstName + " " + child.pLastName);
    }

}

class Parent {
    String pFirstName, pLastName;
    Parent(){
        this.pFirstName = "Shalini";
        this.pLastName = ParentLastName();
    }

    String ParentLastName(){
        return "Yadav";
    }
}


class Child extends Parent{
    String firstName, lastName;
    Child(){
        this.firstName = "Avyukt";
        this.lastName = LastName();
    }

    String LastName(){
        return "Vats";
    }
}