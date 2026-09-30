package Examples;

public class eStaff extends eEmployee{

    public eStaff(String firstName) {
        super(firstName);
    }
    public String getFirstName() {
        return "Staff"+firstName;
    }

    public static void setCompany(String company) {
        eEmployee.company = company;
    }

    public static String getCompany() {
        return "FSM Software";
    }
}
