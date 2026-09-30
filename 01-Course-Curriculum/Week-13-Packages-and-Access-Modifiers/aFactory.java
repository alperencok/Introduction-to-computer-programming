package Examples;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class aFactory {
    ArrayList<aEmployee> employees=new ArrayList<>();
    aDepartment[] departments={new aDepartment("IT"),new aDepartment("HR")};
    void addEmployee(aEmployee e){
        employees.add(e);
    }

    int getHighClerkSalary(){
        int maxClerkSalary=0;
        for (aEmployee employee : employees) {
            if (employee instanceof aClerk
                && employee.getSalary()+((aClerk)employee).getCommission()>maxClerkSalary){
                maxClerkSalary=employee.getSalary()+((aClerk)employee).getCommission();
            }
        }
        return maxClerkSalary;

    }

    ArrayList<String> getEmployeeCount(){
        ArrayList<String> deptCount=new ArrayList<>();
        int[] countofEmployees=new int[departments.length];
        int i=0;
        for (aDepartment department : departments) {
            for (aEmployee employee : employees) {
                if(employee.department!=null && employee.department.name.equals(department.name)){
                    countofEmployees[i]++;
                }
            }
            i++;
        }
        for (int j = 0; j < countofEmployees.length; j++) {
            deptCount.add(departments[j].name+" "+countofEmployees[j]);
        }
        return deptCount;
    }
    aEmployee getLongestWorkingEmployee(){
        aEmployee e=employees.get(0);
        int minStartYear=e.startYear;
        for (aEmployee employee : employees) {
            if (employee.startYear<minStartYear){
                minStartYear=employee.startYear;
                e=employee;
            }
        }
        return e;
    }
    String [] getEmployeeTypeNumbers(){
        String [] employeeTypes=new String[4];
        int empCount=0,staffCount=0,workerCount=0,clerkCount=0;
        for (aEmployee employee : employees) {
            if (employee instanceof aWorker)
                workerCount++;
            else if (employee instanceof aClerk)
                clerkCount++;
            else if (employee instanceof aStaff)
                staffCount++;
            else if (employee instanceof aEmployee)
                empCount++;

        }
        employeeTypes[0]="Employee "+empCount;
        employeeTypes[1]="Staff "+staffCount;
        employeeTypes[2]="Worker "+workerCount;
        employeeTypes[3]="Clerk "+clerkCount;

        return employeeTypes;
    }

}
