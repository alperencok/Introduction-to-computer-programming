package Examples;

public class aManager extends aEmployee{
     int commission;
    public aManager(String firstName, String lastName, int workDuration, int salary, aRole role, aManager manager, String department,int commission) {
       super(firstName, lastName, workDuration, salary, role, manager, department);
       this.commission=commission;
    }

    public aManager() {
    }

    @Override
    int getSalary() {
        return super.getSalary() + this.commission;
    }

}
