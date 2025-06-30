public class User {

    String user;
    Laptop laptop;
    User(String name,Laptop laptop){
        this.user = name;
        this.laptop = laptop;
    }

     void LaptopDetails(){
         System.out.println("***** Laptop Details ******");
         System.out.println("User name is : "+ this.user);
         System.out.println("Hard disk type is : " + laptop.hardDisk.type + " and size is : " + laptop.hardDisk.size);
         System.out.println("Processor generation is : " + laptop.processor.generation + " and speed is : " + laptop.processor.GHz);
         System.out.println("RAM size is : "+ laptop.ram.size + " and generation is : "+ laptop.ram.generation);
    }
}
