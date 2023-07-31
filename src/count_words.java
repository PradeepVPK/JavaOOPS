import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class countwords extends Frame implements ActionListener {

    Label l1, l2;
    Button b;
    TextArea ta;

    public countwords() {
        super("Frame demo 2");
        setSize(2000, 1200);
        setLayout(null);
        setVisible(true);
        ta = new TextArea(10, 30);
        ta.setBounds(20, 100, 250, 200);

        l1 = new Label("unselcted");
        l1.setBounds(20, 600, 250, 30);

        l2 = new Label("unselcted");
        l2.setBounds(20, 700, 250, 30);

        b = new Button("Click me");
        b.setBounds(20, 400, 200, 50);
        b.addActionListener(this);
        add(b);
        add(l2);
        add(ta);
        add(l1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = ta.getText();
        String words[] = text.split("\\s");
        l1.setText("words  :" + words.length);
        l2.setText("Characters  :" + text.length());
    }
}
public class count_words {
    public static void main(String[] args) {
        countwords o=new countwords();
    }
}
