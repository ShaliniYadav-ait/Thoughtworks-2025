package June30;

class IllegalAge extends RuntimeException{
        public  IllegalAge(String message){
            super(message);
        }
}

public class customException {

    public static void ValidateAge(int age) throws IllegalAge{
        if (age < 18 || age > 99){
            throw new IllegalAge(" The age is  " + age);
        }
        System.out.println("Valid age " + age);
    }

    public static void main(String[] args){
       customException c = new customException();
        try{
            c.ValidateAge(20);
            c.ValidateAge(2);
        }
        catch(IllegalAge e){
            System.out.println("Illegal age exception" + e.getMessage());
        }
    }

}
