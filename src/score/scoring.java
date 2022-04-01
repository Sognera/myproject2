package score;

public class scoring {
    public static void main(String[] args){
        String name;
        int english,math;
        student ron = new student(name:"Ron", english=20, math=66);
        student bob = new student(name:"Bob", english=12, math=33);
        graduatestudent robin = new student(name:"Robin", english=82, math=76);
        ron.print();
        bob.print();
        robin.print();
    }
}
