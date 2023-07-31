class grandpa{
    public void land(){
        System.out.println("Land 5 Acres");
    }
}
class father extends  grandpa{
    public  void house(){
        System.out.println("2BHK House");
    }
}

class Son extends father{
    public  void car(){
        System.out.println("Rolls Royce");
    }
}public class multilevel_inherit {
    public static void main(String[] args) {
        Son o= new Son();
        o.house();
        o.car();
        o.land();

    }
}
