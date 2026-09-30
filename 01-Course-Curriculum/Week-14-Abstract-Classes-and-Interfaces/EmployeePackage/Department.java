package Examples.EmployeePackage;
import java.util.ArrayList;
public class Department {
    ArrayList<Employee> employees=new ArrayList<>();
    void displayOfficerAddress(){
        for (Employee employee : employees) {
            if (employee.isOfficer()){
                System.out.println(employee.getFirstName());
                for (String address : employee.addresses) {
                    System.out.println("-->"+address);
                }
            }
        }
    }
}
