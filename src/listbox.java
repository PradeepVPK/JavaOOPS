import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class list_box extends Frame{
    List lst;
    Button b;
    Label l;
    public list_box() {
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
                String list[]= lst.getSelectedItems();
                String data="Selected Language: ";
                for (String x: list){
                    data+=x+",";
                }
                l.setText(data);
            }
        });
        add(b);

        //creating label
        l=new Label("Click button");
        l.setBounds(10,200,300,100);
        add(l);

        lst=new List(1,true);
        lst.setBounds(10,50,100,100);
        lst.add("c");
        lst.add("c++");
        lst.add("java");
        lst.add("android");
        add(lst);
    }
}
public class listbox {
    public static void main(String[] args) {
        list_box o=new list_box();
    }
}
