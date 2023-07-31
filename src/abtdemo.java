abstract class mobile{
    abstract void camera();
    abstract void touchdisplay();
    void voicecall (){
        System.out.println("Make calls");
    }
}
class samsung extends mobile{

    @Override
    void camera() {
        System.out.println("108 MP cam");
    }

    @Override
    void touchdisplay() {
        System.out.println("6 inch Display");

    }
}

class nokia extends mobile{

    @Override
    void camera() {
        System.out.println("16 MP cam");
    }

    @Override
    void touchdisplay() {
        System.out.println("5 inch Display");

    }
    void fingerprint() {
        System.out.println("fast finger print access");
    }

}

public class abtdemo {
    public static void main(String[] args) {
        samsung m32 = new samsung();
        m32.voicecall();
        m32.camera();
        m32.touchdisplay();
        System.out.println("-----------------------");
        nokia n1 = new nokia();
        n1.voicecall();
        n1.camera();
        n1.touchdisplay();

    }
}