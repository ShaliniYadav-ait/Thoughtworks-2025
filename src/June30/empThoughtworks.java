package June30;

import java.io.IOException;

class EmpThoughtworks {
   void anuradha() throws IOException{
       System.out.println("Anuradha solved with 1 error");
       throw new IOException("test exception");
   }

    void ravinder(){
        System.out.println("Ravinder started working");
        System.out.println("Ravinder calls Anu");

        try{
            anuradha();
        }
        catch (IOException e){
            System.out.println("Exception is " + e.getMessage());
        }
   }
}


class MainClass{
    public static void main(String[] args){
        System.out.println("Start");
        EmpThoughtworks manav = new EmpThoughtworks();
        manav.ravinder();
        System.out.println("End");
    }
}
