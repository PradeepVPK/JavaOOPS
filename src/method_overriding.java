class user{
    String name;
    int age;
    user(String n,int a){
        this.name=n;
        this.age=a;
    }
    void print(){
        System.out.println("Name  :"+name);
        System.out.println("Age :"+age);
    }
}
class mainprogrammer extends user{
    String cmpname;
    mainprogrammer(String n,int a,String cname){
        super(n,a);
        this.cmpname=cname;

    }
    void print(){
        System.out.println("Name  :"+name);
        System.out.println("Age :"+age);
    }
}
public class method_overriding {
    public static void main(String[] args) {
        mainprogrammer o= new mainprogrammer("vicky",22,"wipro");
        o.print();
    }
}
