package Examples;

public class hTest {
    public static void main(String[] args) {
        hStudent s=new hStudent(0, 0);
        s.grade=100;
        System.out.println(s.calculateLetterGrade());
        s.graduate();
        hMasterStudent ms=new hMasterStudent();
        ms.grade=100;
        System.out.println(ms.calculateLetterGrade());
        ms.graduate();
    }
}
