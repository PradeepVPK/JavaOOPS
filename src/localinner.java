class outercls{


    void display(){
        class innercls{

            void innerdisplay(){
                System.out.println("Innercls");
            }
        }

        innercls o=new innercls();
     o.innerdisplay();
    }

}

public class localinner {
    public static void main(String[] args) {
        outercls o=new outercls();
        o.display();
    }
}
