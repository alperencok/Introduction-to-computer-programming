package Examples;

public class aTest {
    public static void main(String[] args) {
        aFactory f=new aFactory();
        aEmployee e=new aEmployee();
        e.firstName="John";
        e.lastName="Ak";
        e.salary=100000;
        e.title="Manager";
        f.addEmployee(e);
       // f.displayEmployees();

        aEmployee e1=new aEmployee();
        e1.firstName="Alice";
        e1.lastName="Ak";
        e1.salary=150000;
        e1.title="Manager";
        f.addEmployee(e1);

        aEmployee e2=new aEmployee();
        e2.firstName="Alice";
        e2.lastName="Ak";
        e2.salary=150000;
        e2.title="Staff";
        f.addEmployee(e2);

        f.displayEmployees();
        System.out.println("--------------------");
        System.out.println(f.getTotalSalaryforTitle("Manager"));
        f.increateSalary("John", "Ak", 100000);
        System.out.println(f.getTotalSalaryforTitle("Manager"));

        aCar c=new aCar();
        c.price=20000;
        e.cars.add(c);
        f.displayEmployeesCArPriceExceedlimit(25000);
    }
}
