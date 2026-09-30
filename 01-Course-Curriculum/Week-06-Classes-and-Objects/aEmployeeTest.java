package Examples;

public class aEmployeeTest {
    public static void main(String[] args) {
        aEmployee e1=new aEmployee();
        e1.firstName="John";
        e1.lastName="Ak";
        e1.salary=10000;
        System.out.println(e1.firstName+" "+e1.lastName+" "+e1.salary);

        aEmployee e2=new aEmployee();
        e2.firstName="David";
        e2.lastName="Blue";
        e2.salary=10000;
        System.out.println(e2.firstName+" "+e2.lastName+" "+e2.salary);

        //e1=e2;
        //System.out.println(e1.firstName+" "+e1.lastName+" "+e1.salary);
        e1.displayInfo();
        e2.displayInfo();
    }
}
