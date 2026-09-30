package Examples;

public class eTest {
    public static void main(String[] args) {
        eEmployee e=new eEmployee("John");
        System.out.println(e.getFirstName());

        eEmployee e1=new eStaff("David");
        System.out.println(e1.getFirstName());

        System.out.println(e1.getCompany());
    }
}
