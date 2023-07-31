import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class button extends Frame implements ActionListener {
    Button b;
    Label lbl;
    public button() {
        super("Frame demo 2");
        setSize(2000, 1200);
        setLayout(null);
        setVisible(true);
        //creating buttons
        b=new Button("Click me");
        b.setBounds(75,150,200,50);
        b.addActionListener(this);
        add(b);

        //creating label
        lbl=new Label("Click button");
        lbl.setBounds(75,25,300,100);
        add(lbl);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        lbl.setText("button pressed");
    }
}
    public class button_action {
        public static void main(String[] args) {
            button o=new button();
        }
}
