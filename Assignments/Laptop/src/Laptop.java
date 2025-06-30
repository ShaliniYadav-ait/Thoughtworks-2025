public class Laptop {

    final String logo;
    HardDisk hardDisk ;
    Processor processor;
    RAM ram;

    Laptop(HardDisk hardDisk, Processor processor, RAM ram){
        this.logo = "Mac";
        this.hardDisk = hardDisk;
        this.processor = processor;
        this.ram = ram;
    }

}
