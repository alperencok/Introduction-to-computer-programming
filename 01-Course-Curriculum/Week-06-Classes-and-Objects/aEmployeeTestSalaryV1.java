package Examples;

public class aEmployeeTestSalaryV1 {

    public static void main(String[] args) {
        //If employee is developer and workingyear is
        //more than 10, the salary is -> 10000
        //If employee is developer and working year is
        //less than 10, the salary is -> 5000
        //For other employee types the salary is = 3000
        aEmployee e1 = new aEmployee();
        e1.job = 'D';
        e1.workingYear = 15;
        if (e1.job == 'D' && e1.workingYear > 10) {
            e1.salary = 10000;
        } else if (e1.job == 'D' && e1.workingYear <= 10) {
            e1.salary = 5000;
        } else {
            e1.salary = 3000;
        }
        System.out.println(e1.salary);

        aEmployee e2 = new aEmployee();
        e2.job = 'C';
        e2.workingYear = 8;

        if (e2.job == 'D' && e2.workingYear > 10) {
            e2.salary = 10000;
        } else if (e2.job == 'D' && e2.workingYear <= 10) {
            e2.salary = 5000;
        } else {
            e2.salary = 3000;
        }
        System.out.println(e2.salary);
    }
}
