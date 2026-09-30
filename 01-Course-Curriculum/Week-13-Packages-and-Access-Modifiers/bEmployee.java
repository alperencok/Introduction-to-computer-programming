package Examples;

public class bEmployee {
    private int salary;
    private String firstName;

    public bEmployee() {
    }

    public bEmployee(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setSalary(int salary) {
        if (salary<0)
            System.out.println("Incorrect salary");
        else
            this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

}
