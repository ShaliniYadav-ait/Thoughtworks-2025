package practice.June26;

public class MethodOverriding {
    public static void main(String[] args){
        Advanced a = new Advanced();
        a.Details();
        Basic b = new Basic();
        b.Details();
    }
}

class Basic{
    public void Details(){
        System.out.println(" Basic details");
    }
}

class Advanced extends Basic{
    public void Details(){
        System.out.println(" Advanced details");
    }
}