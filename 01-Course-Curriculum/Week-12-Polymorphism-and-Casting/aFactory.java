package Examples;
import java.util.ArrayList;
public class aFactory {
    ArrayList<aEmployee> employees=new ArrayList<>();
    ArrayList<aManager> managers=new ArrayList<>();
    void addEmployee(String firstName, String lastName, aRole r,String type, int duration){
        if (type.equals("EMPLOYEE")){
            aEmployee e=new aEmployee();
            e.firstName=firstName;
            e.lastName=lastName;
            e.role=r;
            e.workDuration=duration;
            employees.add(e);
        }else if (type.equals("MANAGER")){
            aManager m=new aManager();
            m.firstName=firstName;
            m.lastName=lastName;
            m.role=r;
            m.workDuration=duration;
            managers.add(m);
        }

    }

    void printEmployeeNumberInRole(){
        int[] roleNumbers=new int [aRole.roles.length];
        for (int i = 0; i < aRole.roles.length; i++) {
           for (aEmployee employee : employees) {
                if (employee.role.name.equals(aRole.roles[i].name)){
                    roleNumbers[i]++;
                }
            }
        }

        for (int i = 0; i < aRole.roles.length; i++) {
           for (aManager manager : managers) {
                if (manager.role.name.equals(aRole.roles[i].name)){
                    roleNumbers[i]++;
                }
            }
        }
        for (int i = 0; i < aRole.roles.length; i++) {
            System.out.println(aRole.roles[i].name+" "+roleNumbers[i]);
        }

    }

    int getTotalSalary(){
        int totalSalary=0;
        for (aEmployee employee : employees) {
            totalSalary+=employee.getSalary();
        }
        for (aManager manager : managers) {
            totalSalary+=manager.getSalary();
        }
        return totalSalary;
    }

}
