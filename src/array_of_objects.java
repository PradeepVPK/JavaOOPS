class student{
    int rollno;
    String name;
    student(int r,String n){
        this.rollno=r;
        this.name=n;
    }

    void print(){
        System.out.println("Name  :"+name);
        System.out.println("Rollno :"+rollno);
    }
}
public class array_of_objects {
    public static void main(String[] args) {
        student[] o= new student[5];
        o[0] = new student(10, "ram");
        o[1] = new student(11, "sam");
        o[2] = new student(12, "tom");
        o[3] = new student(13, "john");
        o[4] = new student(14, "wick");
        for (int i=0;i<o.length;i++){
            o[i].print();
        }


    }
}
