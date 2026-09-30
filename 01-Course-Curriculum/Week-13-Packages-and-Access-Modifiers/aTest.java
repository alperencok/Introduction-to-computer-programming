package Examples;
import java.util.Arrays;
public class aTest {
     public static void main(String[] args) {
        aFactory f=new aFactory();
        f.addEmployee(new aEmployee(2000));
        f.addEmployee(new aStaff(2005));
        f.addEmployee(new aStaff(2000));
        f.addEmployee(new aStaff(1995));
        f.addEmployee(new aClerk(2000));
        f.addEmployee(new aWorker(2000));
        String typeNumbers[]=f.getEmployeeTypeNumbers();
        System.out.println(Arrays.toString(typeNumbers));
        aEmployee longestWorkingEmployee=f.getLongestWorkingEmployee();
        System.out.println(longestWorkingEmployee.startYear);

        f.addEmployee(new aEmployee(new aDepartment("HR")));
        f.addEmployee(new aEmployee(new aDepartment("IT")));
        f.addEmployee(new aEmployee(new aDepartment("IT")));
        System.out.println(f.getEmployeeCount());

    }
}
