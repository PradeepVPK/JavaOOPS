public class enum_demo{
    enum gamelevel{
        low,
        medium,
        high

    }
    public static void main(String[] args) {

        //assigning enum variable
        gamelevel o=gamelevel.high;
        System.out.println(o);
       //Enum by  switch
        switch (o){
            case low :
                System.out.println("Low level");
            case medium:
                System.out.println("Medium level");
            case high:
                System.out.println("High level");
        }
        //Enum by enhanced for loop
        for (gamelevel level : gamelevel.values()) {
            System.out.println(level);
        }
    }
}
