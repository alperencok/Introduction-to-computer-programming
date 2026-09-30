package Examples;

public class cTest {
    public static void main(String[] args) {
        cEmployee e=new cEmployee();
        e.firstName="John";
        e.lastName="Ak";
        e.age=40;
        cEmployee e1=new cEmployee(25000);
        System.out.println(e1.salary);
        cEmployee e2=new cEmployee("John","Ak",40);
        cEmployee e3=new cEmployee(1000);
        System.out.println(e3.salary);

    }
}
