public class MultilevelInheritence {
    public static void main(String[] args){
        Child c = new Child();
        System.out.println("Child is "+ c.childName);
        System.out.println("Parent is "+ c.parentName);
        System.out.println("Grand Parent is "+ c.grandParentName);
    }
}

class GrandParent{
    String grandParentName;

    GrandParent(){
        this.grandParentName = GPFirstName() + " " + GPLastName();
    }

    String GPFirstName(){
        return "Bharti";
    }

    String GPLastName(){
        return "Yadav";
    }
}

class Parent extends GrandParent{
    String parentName;

    Parent(){
        this.parentName = ParentFirstName() + " " + ParentLastName();
    }

    String ParentFirstName(){
        return "Shalini";
    }

    String ParentLastName(){
        return "Yadav";
    }
}

class Child extends Parent{
    String childName;

    Child(){
        this.childName = ChildFirstName() + " " + ChildLastName();
    }

    String ChildFirstName(){
        return "Avyukt";
    }

    String ChildLastName(){
        return "Vats";
    }
}