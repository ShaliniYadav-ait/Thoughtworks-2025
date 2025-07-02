package June26;

public class HeirarchyInheritence {
    public static void main(String[] args) {
        Intern internDetails = new Intern("Shalini");
        System.out.println("Intern is " + internDetails.internName + " works at " + internDetails.company);
        Employee employeeDetails = new Employee("Nidhi");
        System.out.println("Employee is " + employeeDetails.employeeName + " works at " + employeeDetails.company);
    }
}

class Thoughtworks {
    String company;

    Thoughtworks() {
        this.company = "Thoughtworks";
    }
}

class Intern extends Thoughtworks {
    String internName;

    Intern(String name) {
        this.internName = name;
    }
}

class Employee extends Thoughtworks {
    String employeeName;

    Employee(String name) {
        this.employeeName = name;
    }
}