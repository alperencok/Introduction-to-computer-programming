package Examples;

public class fTest {
    public static void main(String[] args) {
        fEmployee e=new fEmployee();
        e.hireYear=1999;
        System.out.println(e.getSalary());

        fManager m=new fManager();
        m.hireYear=1999;
        System.out.println(m.getSalary());
    }
}
