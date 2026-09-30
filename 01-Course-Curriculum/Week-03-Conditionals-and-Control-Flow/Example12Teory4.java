package Examples;

public class Example12Teory4 {
    public static void main(String[] args) {
        int startYear=2018;
        double salary=10000;
        if (startYear<=2010) {
            salary=1.1*salary;
        } else if (startYear<=2015) {
            salary=1.5*salary;
        }
        System.out.println(salary);
    }
}
