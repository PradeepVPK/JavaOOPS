import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class add_prgrm extends Frame implements ActionListener {
    Button b;
    Label l1, l2, l3;
    TextField t1, t2;

    public add_prgrm() {
        super("Frame demo 2");
        setSize(2000, 1200);
        setLayout(null);
        setVisible(true);

        t1=new TextField();
        t1.setBounds(300,50,250,30);


        l1=new Label("enter no1");
        l1.setBounds(10,50,250,30);

        t2=new TextField();
        t2.setBounds(300,100,250,30);


        l2=new Label("enter no2");
        l2.setBounds(10,100,250,30);
        //creating buttons
        b = new Button("Click me");
        b.setBounds(75, 150, 200, 50);
        b.addActionListener(this);

        l3=new Label("output");
        l3.setBounds(10,200,250,30);

        add(b);
        add(t1);
        add(t2);
        add(l1);
        add(l2);
        add(l3);
    }

    public void actionPerformed(ActionEvent e) {
        String s1=t1.getText();
        String s2=t2.getText();
        if (s1.isEmpty()||s2.isEmpty()) {
            l3.setText("enter data");
        }
        else {
            int a=Integer.parseInt(s1);
            int b=Integer.parseInt(s2);
            int c= a+b;
            String result=String.valueOf(c);
        l3.setText("Result"+result);
    }
}
}
public class addition {
    public static void main(String[] args) {
        add_prgrm o=new add_prgrm();

    }
}
