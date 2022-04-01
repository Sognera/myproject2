package score;

import score.student;

public class graduatestudent extends student {
    int thesis;
    public graduatestudent(String name, int english,int math,int thesis){
        super(name,english,math);
        this.thesis = thesis;
    }
    public graduatestudent(String name){
        super(name);
    }
    @Override
    public void print(){System.out.println(name +"\t"+english+"\t"+math+"\t"+thesis+"\t")}
    public void test(){

    }
}
