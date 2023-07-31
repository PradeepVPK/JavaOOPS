import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class radiobutton extends Frame {
    Label l1,l2;
    Checkbox c1,c2;
    CheckboxGroup cbg;

    public radiobutton() {
        super("Frame demo 2");
        setSize(2000, 1200);
        setLayout(null);
        setVisible(true);

        cbg=new CheckboxGroup();

        c1=new Checkbox("male",cbg,false);
        c1.setBounds(100,50,30,30);

        l1=new Label("unslected");
        l1.setBounds(100,50,600,30);


        c2=new Checkbox("female",cbg,false);
        c2.setBounds(100,100,30,30);

        l2=new Label("unselcted");
        l2.setBounds(100,100,600,30);


        add(c1);
        add(c2);


        add(l1);
        add(l2);


        c1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                l1.setText((e.getStateChange()==1 ?"Checked":"UnChecked"));
                l2.setText("UnChecked");

            }
        });


        c2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                l1.setText("UnChecked");
                l2.setText((e.getStateChange()==1 ?"Checked":"UnChecked"));

            }
        });

    }
}

public class radio_button {
    public static void main(String[] args) {
        radiobutton o= new radiobutton();
    }
}
