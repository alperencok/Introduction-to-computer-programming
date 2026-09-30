package Examples.EmployeePackage;
import Examples.JobPackage.*;
public class AddressTest {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setFirstName("John");
        e.addresses.add("Fatih");
        e.addresses.add("Sultan");

        e.setJobs(new Job[]{new Officer(1000,"Developer")});

        Employee e1=new Employee();
        e1.setFirstName("David");
        e1.addresses.add("Central District");
        e1.addresses.add("Sultan");

        Department d=new Department();
        d.employees.add(e);
        d.employees.add(e1);

        d.displayOfficerAddress();
    }
}
