abstract class shPE{
    abstract void draw();
    void message (){
        System.out.println("Message");
    }
}
class Rect extends shPE{

    @Override
    void draw() {
        System.out.println("Draw");
    }
}
public class abstractdemo {
    public static void main(String[] args) {
        Rect o= new Rect();
        o.draw();
        o.message();
    }
}
