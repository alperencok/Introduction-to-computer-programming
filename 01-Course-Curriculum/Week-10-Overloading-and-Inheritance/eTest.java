package Examples;

public class eTest {
    public static void main(String[] args) {
        eStudent s=new eStudent();
        eStudent.university="ITU";

        eStudent s1=new eStudent();
        s1.university="YTU";

        eStudent.university="Marmara";

        System.out.println(s1.university);
    }
}
