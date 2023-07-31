import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class choicedemo extends Frame{
    Choice c;
    Button b;
    Label l;
    public choicedemo() {
        super("Frame demo 2");
        setSize(2000, 1200);
        setLayout(null);
        setVisible(true);
        //creating buttons
        b=new Button("Click me");
        b.setBounds(10,150,200,50);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data="programming language selected: "+c.getItem(c.getSelectedIndex());
                l.setText(data);
            }
        });
        add(b);

        //creating label
        l=new Label("Click button");
        l.setBounds(10,200,300,100);
        add(l);

        c=new Choice();
        c.setBounds(10,50,100,100);
        c.add("c");
        c.add("c++");
        c.add("java");
        c.add("android");
        add(c);
    }
}
public class choice_demo {
    public static void main(String[] args) {
        choicedemo o=new choicedemo();
    }
}
