abstract class testdemo{
    abstract  void display();
}

class outerdemo{

    public void outerdisplay(){
        testdemo o= new testdemo() {
            @Override
            void display() {
                System.out.println("test display");
            }
        };
     o.display();
    }
}

public class anonymousinnerclass {
    public static void main(String[] args) {
        outerdemo o =new outerdemo();
        o.outerdisplay();
    }
}
