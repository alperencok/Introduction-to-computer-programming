package Examples;

public class Example12Teory6 {
    public static void main(String[] args) {
        Example10Teory4 car1=new Example10Teory4();
        car1.currentSpeed=100;
        car1.increaseSpeed();
        System.out.println(car1.currentSpeed);

        System.out.println("---");

        Example10Teory4 car2=new Example10Teory4();
        car2.currentSpeed=100;
        car2.increaseSpeed();
        car2.increaseSpeed();
        System.out.println(car2.currentSpeed);
        System.out.println(car1.currentSpeed);

    }
}
