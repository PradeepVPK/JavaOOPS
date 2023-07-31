interface animal{
     void sound();
     void sleep();

}
class dog implements animal{

    @Override
    public void sound() {
        System.out.println("Dog sounds Woof");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");

    }
}
public class interfaceDemo {
    public static void main(String[] args) {
        dog o= new dog();
        o.sleep();
        o.sound();
    }
}
