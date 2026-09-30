package Examples;

public class Example13Teory5 {
    public static void main(String[] args) {
        int startYear=2020;
        double salary=10000;
        boolean isIncrease10Percent=(startYear<2010);
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
