public class GrandParent {
    GrandParent(){
        System.out.println("******** GrandParent Default Constructor *******");
    }

    GrandParent(String name){
        this();
        System.out.println("Grand Parent is "+ name);
    }

    String firstNameGP = "Bharti ";
    String lastNameGP = "Yadav";

    String lastNameGP(){
        System.out.println("5. Grand Parent's default method");
        return lastNameGP;
    }

    String fullNameGP(){
        System.out.println("6. Grand Parent's parameterized method");
        return firstNameGP + lastNameGP();
    }
}
