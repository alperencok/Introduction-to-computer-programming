package Examples;

import java.util.ArrayList;

public class aEmployee {
    String firstName, lastName;
    int salary;
    ArrayList<cProduct> products=new ArrayList<>();

    public aEmployee(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public aEmployee() {
    }
}
