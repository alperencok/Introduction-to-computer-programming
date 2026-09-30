package Examples;

public class aEmployeeTest {
    public static void main(String[] args) {
        aEmployee e1=new aEmployee();
        e1.firstName="John";
        e1.lastName="Ak";
        //e1.displayName();
        System.out.println(e1.getName());
        e1.lengthOfEmployement=14;
        //e1.calculateNetSalary();
        System.out.println(e1.getNetSalary());
    }
}
