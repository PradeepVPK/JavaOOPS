public class buffer {
    public static void main(String[] args) {
        StringBuffer buffer=new StringBuffer("Pradeep");
        System.out.println(buffer);
        System.out.println(buffer.append(" rohit"));
        System.out.println(buffer.insert(10, "kumar"));
        System.out.println(buffer.replace(9,11,"qqq"));
        System.out.println(buffer.delete(9,11));
        System.out.println(buffer.reverse());
        System.out.println(buffer.charAt(3));
        System.out.println(buffer.length());
        System.out.println(buffer.substring(0,5));
        buffer.setCharAt(0,'h');
        System.out.println(buffer);
        System.out.println(buffer.capacity());

             }
}
