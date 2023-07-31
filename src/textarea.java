import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class text_area extends Frame implements ActionListener {
    TextField t;
    Label l1;
    Button b;
    TextArea ta;

    public text_area() {
        super("Frame demo 2");
        setSize(2000, 1200);
        setLayout(null);
        setVisible(true);
        ta = new TextArea(10, 30);
        ta.setBounds(20, 100, 250, 200);

        t = new TextField();
        t.setBounds(20, 250, 250, 30);


        l1 = new Label("unselcted");
        l1.setBounds(20, 50, 250, 30);


        b = new Button("Click me");
        b.setBounds(20, 400, 200, 50);
        b.addActionListener(this);
        add(b);
        add(t);
        add(ta);
        add(l1);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       // l1.setText(ta.getSelectedText());
        //ta.append(t.getText());
        ta.insert(t.getText(),ta.getCaretPosition());
    }
}
        public class textarea {
            public static void main(String[] args) {
                text_area o=new text_area();
            }
}
