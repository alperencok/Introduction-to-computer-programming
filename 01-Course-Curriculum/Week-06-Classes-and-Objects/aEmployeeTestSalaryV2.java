package Examples;

public class aEmployeeTestSalaryV2 {
    public static void main(String[] args) {
        aEmployee e1=new aEmployee();
        e1.job='D';
        e1.workingYear=15;
        e1.calculateSalary();
        System.out.println(e1.salary);

        aEmployee e2=new aEmployee();
        e2.job='C';
        e2.workingYear=8;
        e2.calculateSalary();  // if delete this output=0
        System.out.println(e2.salary);
        System.out.println(e2.getSalary());
    }
}
