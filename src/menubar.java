import java.awt.*;

class menu_demo extends Frame{
    MenuBar m;
    Menu submenu;
    Menu menu;
    public menu_demo() {
        super("Frame demo 2");
        setSize(2000, 1200);
        setLayout(null);
        setVisible(true);


         m = new MenuBar();
        submenu = new Menu("submenu");
         menu = new Menu("menu");
        MenuItem i1 = new MenuItem("Item 1");
        MenuItem i2 = new MenuItem("Item 2");
        MenuItem i3 = new MenuItem("Item 3");
        MenuItem i4 = new MenuItem("Item 4");
        MenuItem i5 = new MenuItem("Item 5");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);
        m.add(menu);
        setMenuBar(m);

    }
}
public class menubar {
    public static void main(String[] args) {
     menu_demo o=new menu_demo();
    }
}
