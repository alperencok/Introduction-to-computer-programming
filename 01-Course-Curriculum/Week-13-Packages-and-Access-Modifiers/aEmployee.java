package Examples;

public class aEmployee {
    int startYear;
    aDepartment department;
    int salary;

    public int getSalary() {
        return salary;
    }

    public aEmployee(int startYear) {
        this.startYear = startYear;
    }

    public aEmployee() {
    }

    public aEmployee( aDepartment department) {
        this.department = department;
    }

}
