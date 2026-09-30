package Examples;

public class dTest {
    public static void main(String[] args) {
        dStudent s=new dStudent(100);
        s.grade=100;

        dStudent students[]=new dStudent[3];
        students[0]=new dStudent(100);
        dStudent s1=new dStudent(100);
        s1.grade=5000;
        students[1]=s1;
        s1=null;
        //s1.remove();

    }
}
