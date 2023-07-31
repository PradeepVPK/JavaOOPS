import java.awt.*;
class text_field extends Frame {
    TextField txt;
    Label l1, l2;
    public text_field() {
        super("Frame demo 2");
        setSize(2000, 1200);
        setLayout(null);
        setVisible(true);

        txt=new TextField();
        txt.setBounds(10,50,250,30);


        l1=new Label("unselcted");
        l1.setBounds(300,50,250,30);

        l2=new Label("unselcted");
        l2.setBounds(600,50,250,30);

        add(txt);
        add(l1);
        add(l2);
    }
}
public class textfield {
    public static void main(String[] args) {
        text_field o= new text_field();
    }
}
