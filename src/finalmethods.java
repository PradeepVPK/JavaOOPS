class Super{
    public void  display(){
        System.out.println("I am super");
    }
    final void  finaldisplay(){
        System.out.println("I am final");
    }
}
class sub extends Super{
    public void  display(){
        System.out.println("I am sub super");
    }
    /*final void  finaldisplay(){
        System.out.println("I am final");  final methods cant be overridden
    }*/
}

public class finalmethods {
    public static void main(String[] args) {
        sub o= new sub();
        o.display();
        o.finaldisplay();
    }
}
