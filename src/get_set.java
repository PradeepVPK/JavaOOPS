class rect{
    private int length,width;
    int getLength(){
        return length;
    }
    int getWidth(){
        return width;
    }
    void setLength(int l){
        length=l;
    }
    void setWidth(int w){
        width=w;
    }
    int area(){
        return length*width;
    }
}

public class get_set {
    public static void main(String[] args) {
        rect o=new rect();
        o.setLength(10);
        o.setWidth(20);
        System.out.println("Length  :"+o.getLength());
        System.out.println("Width   :"+o.getWidth());
        System.out.println("Area    :"+o.area());
    }
}
