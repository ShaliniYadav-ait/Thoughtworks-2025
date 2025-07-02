package June26;

public class Super {
    public static void main(String[] args){
        ChildSuper c = new ChildSuper();
        System.out.println("Child is "+ c.firstName + " " + c.lastName);
        System.out.println("Parent is "+ c.parentName);
    }
}


class ParentSuper{
    String pFirstName, pLastName;
    ParentSuper(){
        this.pFirstName = "Shalini";
        this.pLastName = ParentLastName();
    }
    String ParentLastName(){
        return "Yadav";
    }
}


class ChildSuper extends ParentSuper {
    String firstName, lastName,parentName;
    ChildSuper(){
        this.firstName = "Avyukt";
        this.lastName = LastName();
        this.parentName = super.pFirstName + " " + super.pLastName;
    }

    String LastName(){
        return "Vats";
    }
}