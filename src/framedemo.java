import java.awt.*;

class app extends Frame {
    Label l1;
    Button btn;

    public app() {
        super("hello");
        setSize(1000, 600);
        setLayout(null);
        setBackground(Color.gray);
        btn = new Button("Click Me");
        btn.setBackground(Color.green);
        btn.setBounds(150, 75, 200, 50);
        add(btn);

        l1 = new Label("helloo");
        l1.setForeground(Color.yellow);
        l1.setBounds(75, 75, 200, 100);
        add(l1);
        setVisible(true);
    }

}

public class framedemo {
    public static void main(String[] args) {
        app o = new app();

    }
}
