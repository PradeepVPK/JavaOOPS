import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class checkbx extends Frame {
    Label l1,l2,l3;
    Checkbox c1,c2,c3;

    public checkbx() {
        super("Frame demo 2");
        setSize(2000, 1200);
        setLayout(null);
        setVisible(true);

        c1=new Checkbox("C");
        c1.setBounds(10,50,30,30);

        l1=new Label("Unchecked");
        l1.setBounds(100,50,600,30);


        c2=new Checkbox("C++");
        c2.setBounds(10,100,30,30);

        l2=new Label("Unchecked");
        l2.setBounds(100,100,600,30);

        c3=new Checkbox("java");
        c3.setBounds(10,150,30,30);

        l3=new Label("Unchecked");
        l3.setBounds(100,150,600,30);

        add(c1);
        add(c2);
        add(c3);

        add(l1);
        add(l2);
        add(l3);

       c1.addItemListener(new ItemListener() {
           @Override
           public void itemStateChanged(ItemEvent e) {
               l1.setText((e.getStateChange()==1 ?"Checked":"UnChecked"));
               l2.setText("UnChecked");
               l3.setText("UnChecked");
           }
       });


        c2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                l1.setText("UnChecked");
                l2.setText((e.getStateChange()==1 ?"Checked":"UnChecked"));
                l3.setText("UnChecked");
            }
        });

        c3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                l1.setText("UnChecked");
                l2.setText("UnChecked");
                l3.setText((e.getStateChange()==1 ?"Checked":"UnChecked"));

            }
        });
    }
}

    public class checkbox {
    public static void main(String[] args) {
        checkbx o= new checkbx();
    }
}
