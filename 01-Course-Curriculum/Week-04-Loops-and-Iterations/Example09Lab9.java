package Examples;

public class Example09Lab9 {
    public static void main(String[] args) {
        int number=12;
        //binary
        String bNumber="";
        while (number>0){
            bNumber=(number%2)+bNumber;
            number=number/2;
        }
        System.out.println(bNumber);
    }
}
