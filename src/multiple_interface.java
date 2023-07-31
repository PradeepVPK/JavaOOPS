class phone{
    void voicecall(){
        System.out.println("Make Calls");
    }
    void sms(){
        System.out.println("send sms");
    }
}
interface camera{
    void click();
    void record();
}

interface player{
    void play();
    void pause();
    void stop();
}
class smartphone extends phone implements camera,player{

    @Override
    public void click() {
        System.out.println("click photo");
    }

    @Override
    public void record() {
        System.out.println("Record video");
    }

    @Override
    public void play() {
        System.out.println("play music");
    }

    @Override
    public void pause() {
        System.out.println("pause music");
    }

    @Override
    public void stop() {
        System.out.println("stop music");
    }
}
public class multiple_interface {
    public static void main(String[] args) {
        smartphone o=new smartphone();
        o.voicecall();
        o.sms();
        o.click();
        o.record();
        o.play();
        o.pause();
        o.stop();
    }
}
