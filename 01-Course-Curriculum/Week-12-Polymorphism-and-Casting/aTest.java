package Examples;

public class aTest {
    public static void main(String[] args) {
        aFactory f=new aFactory();

        f.addEmployee("John", "Ak", new aRole("CIO"), "MANAGER",8);
        f.addEmployee("Alice", "Ak", new aRole("Staff"), "EMPLOYEE",6);
        f.addEmployee("David", "Ak", new aRole("Staff"), "EMPLOYEE",3);
        f.addEmployee("Kemal", "Ak", new aRole("Asistant"), "EMPLOYEE",2);

        f.printEmployeeNumberInRole();
        System.out.println(f.getTotalSalary());

    }
}
