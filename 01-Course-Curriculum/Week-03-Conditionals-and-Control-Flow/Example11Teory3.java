package Examples;

public class Example11Teory3 {

    public static void main(String[] args) {
        int monthNumber = 5;
        switch (monthNumber) {
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            default:
                System.out.println("Default");
            //    throw new AssertionError();
            // if you do not use break: loop cannot work
        }
        System.out.println("Finished");
    }
}
