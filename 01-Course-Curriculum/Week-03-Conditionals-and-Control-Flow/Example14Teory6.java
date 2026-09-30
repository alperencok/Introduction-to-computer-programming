package Examples;

public class Example14Teory6 {
    public static void main(String[] args) {
       int startYear=2005;
        double salary=8000;
        boolean isIncrease10Percent=(startYear<2010 && salary <= 10000);
        //if (startYear<2010)
        //if (isIncrease10Percent==true){
        if (isIncrease10Percent){
            salary=1.1*salary;
        }else{
            salary=1.05*salary;
        }
        System.out.println(salary);
    }
}
