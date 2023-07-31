final class finalclsdemo{
    public void display(){
        System.out.println("I am display");
    }
}
//class fas extends finalclsdemo--- gives error/ -final class cant be inherited

public class finalclss {
    public static void main(String[] args) {
        finalclsdemo o=new finalclsdemo();
        o.display();
    }
}
