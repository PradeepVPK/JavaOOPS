class rect_{
    int length,width;
    //default construtor
    rect_(){
        length=10;
        width=20;
    }
    //parameterized constructor
    rect_(int l,int w){
        length=l;
        width=w;
    }

    int area(){
        return length*width;
    }
}

public class constructor {
    public static void main(String[] args) {
        rect_ o = new rect_();
        System.out.println("Area    :" + o.area());
        rect_ o1= new rect_(20,30);
        System.out.println("Area    :" + o1.area());
    }
}
