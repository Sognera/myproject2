package score;

public class student {
    String name;
    int english;
    int math;
    public student(String name){//Constructor
        this.name=name;
    }
    public student(String name, int english, int math){//Default constructor
        this.name=name;
        this.english=english;
        this.math=math;
    }
    public void
    print(){
        int aver = (english+math)/2;
        System.out.println(name + "\t" + english + "\t" + math + "\t" + aver);
        if(aver<60){
            System.out.print("*");
        }
        System.out.println();
    }
    public int getAverage() {return(english+math)/2;}
}