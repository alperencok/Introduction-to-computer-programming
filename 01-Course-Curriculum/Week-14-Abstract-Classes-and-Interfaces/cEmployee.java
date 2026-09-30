package Examples;

public abstract class cEmployee implements cIOverTime{
    String firstName;
    int salary;
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public abstract void setSalary(int salary);
     public abstract int setOverTimeAmount(int i);

}
