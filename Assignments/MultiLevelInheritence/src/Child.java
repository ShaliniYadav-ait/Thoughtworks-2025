public class Child extends Parent{
    Child(){
        super(" Shalini");
        System.out.println("******** Child Default Constructor ********");
    }

    Child(String name){
        this();
        System.out.println("Child is "+ name);
        allNames();
    }

    String firstNameChild = "Avyukt ";
    String lastNameChild = "Vats";

    String lastNameChild(){
        System.out.println("1. Child's default method");
        return lastNameChild;
    }

    String fullName(String lastNameChild){
        System.out.println("2. Child's parameterized method");
        return firstNameChild + lastNameChild;
    }

    void allNames(){
        String childLastName = lastNameChild();
        String childFullName = fullName(childLastName);
        String parentFullName = fullNameParent();
        String gpFullName = fullNameGP();
        System.out.println("Child is "+ childFullName + ",\nParent is " + parentFullName + ",\nGrandparent is " + gpFullName );
    }
}
