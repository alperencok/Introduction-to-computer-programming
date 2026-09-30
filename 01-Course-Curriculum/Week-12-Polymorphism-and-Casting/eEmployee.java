package Examples;

public class eEmployee {
    static String company;
    String firstName;

    public eEmployee(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return "Employee "+ firstName;
    }

    public static void setCompany(String company) {
        eEmployee.company = company;
    }

    public static String getCompany() {
        return "FSM";
    }

}
