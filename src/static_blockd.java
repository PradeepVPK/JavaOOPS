class  blocktest{
    static {
        System.out.println(" block 1");
    }
    static {
        System.out.println(" block 2");
    }
}
public class static_blockd {
    static {
        System.out.println("static block 1");
    }
    public static void main(String[] args) {
        System.out.println("main");
        blocktest o=new blocktest();
    }
    static {
        System.out.println("static block 2");
    }
}
