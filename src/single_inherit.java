class Father{
    public  void house(){
        System.out.println("2BHK House");
    }
}

class son extends Father{
    public  void car(){
        System.out.println("Rolls Royce");
    }
}
public class single_inherit {
    public static void main(String[] args) {
        son o= new son();
        o.house();
        o.car();

    }
}
