public class Parent extends GrandParent {
    Parent(){
        super(" Bharti");
        System.out.println("******* Parent Default Constructor ********");
    }

    Parent(String name){
        this();
        System.out.println("Parent is "+ name);
    }

    String firstNameParent = "Shalini ";
    String lastnameParent = "Yadav";

    String lastNameParent(){
        System.out.println("3. Parent's default method");
        return lastnameParent;
    }

    String fullNameParent(){
        System.out.println("4. Parent's parameterized method");
        return firstNameParent + lastNameParent();
    }
}

