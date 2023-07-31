class FATHER{
    public  void house(){
        System.out.println("2BHK House");
    }
}

class son1 extends FATHER{
    public  void car(){
        System.out.println("Rolls Royce");
    }
}
class son2 extends FATHER{
    public  void car(){
        System.out.println("Bugatti");
    }
}
class son3 extends FATHER{
    public  void car(){
        System.out.println("Range Rover");
    }
}
public class hierarchical_inherit {
    public static void main(String[] args) {
        son1 o1= new son1();
        o1.house();
        o1.car();
        son2 o2= new son2();
        o2.house();
        o2.car();
        son3 o3= new son3();
        o3.house();
        o3.car();


    }

}
