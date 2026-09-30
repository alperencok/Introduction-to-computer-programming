package Examples;

public class aEmployee {

    String firstName, lastName;
    int workDuration, salary;
    aRole role;
    aManager manager;
    String department;

    public aEmployee(String firstName, String lastName, int workDuration, int salary, aRole role, aManager manager, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.workDuration = workDuration;
        this.salary = salary;
        this.role = role;
        this.manager = manager;
        this.department = department;
    }

    public aEmployee() {
    }

    int getSalary() {
        if (workDuration < 5) {
            this.salary = 3000;
        } else {
            this.salary = 5000;
        }
        return this.salary;

    }

}
