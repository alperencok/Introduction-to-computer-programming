package Examples;

public class eEmployee {
    int salary;

    public static void main(String[] args) {
        int parameter=5;
        System.out.println(parameter);
        setValue(parameter);
        System.out.println(parameter);
        eEmployee e1=new eEmployee();
        e1.salary=5000;
        changeSalary(e1);
        System.out.println(e1.salary);
    }
    //Change an existing employee's salary
    static void changeSalary(eEmployee e){
        e.salary=10000;
    }

    static void setValue(int p){
        p=10;
    }
}
