class singletondemo{
    static singletondemo obj=null;
    private singletondemo() {}
    public static singletondemo getInstance(){
        if (obj==null)
            obj=new singletondemo();
        return obj;
    }
    void display(){
        System.out.println("I am display");
    }
}
public class singleton {
    public static void main(String[] args) {
        singletondemo o=singletondemo.getInstance();
        o.display();
    }
}
