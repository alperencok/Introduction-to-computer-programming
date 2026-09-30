package Examples;

public class Example17Teory9 {
    public static void main(String[] args) {
        int startYear=2005;
        double salary=8000;
        double newSalary=10000;  // in local it can be in object it will be 0
        if (startYear < 2010) {
            newSalary=1.1 * salary;
            if (salary <= 10000) {
                salary = 1.1 * salary;
            }
        }else {
            System.out.println(newSalary);
            salary = 1.05 * salary;
        }
        System.out.println(salary);
    }
}
