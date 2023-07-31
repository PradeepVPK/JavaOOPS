import java.awt.*;

class Mycanvas extends Canvas {
    public Mycanvas(){
        setBackground(Color.gray);
        setSize(300,200);
    }
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fill3DRect(75,75,150,75,true);
    }
}

public class canvas_demo extends Frame {
    public canvas_demo(){
        super("Frame demo 2");
        setSize(2000, 1200);
        setLayout(null);
        setVisible(true);
        add(new Mycanvas());
    }

    public static void main(String[] args) {
        canvas_demo o=new canvas_demo();
    }
}
