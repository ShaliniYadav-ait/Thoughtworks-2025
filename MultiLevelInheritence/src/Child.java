public class Child extends Parent{
    Child(){
        super(" Shalini");
        System.out.println("Child Default Constructor");
    }

    Child(String name){
        this();
        System.out.println("Child is "+ name);
        allNames();
    }

    String firstNameChild = "Avyukt ";
    String lastNameChild = "Vats";

    String lastNameChild(){
        System.out.println("Child's default method");
        return lastNameChild;
    }

    String fullName(String lastNameChild){
        System.out.println("Child's parameterized method");
        return firstNameChild + lastNameChild;
    }

    void allNames(){
        String childLastName = lastNameChild();
        String childFullName = fullName(childLastName);
        String parentLastName = lastNameParent();
        String parentFullName = fullNameParent(parentLastName);
        String gpLastName = lastNameGP();
        String gpFullName = fullNameGP(gpLastName);
        System.out.println("Child is "+ childFullName + ", Parent is " + parentFullName + ", Grandparent is " + gpFullName );
    }
}
