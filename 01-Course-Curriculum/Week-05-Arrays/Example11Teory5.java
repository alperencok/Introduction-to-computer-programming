package Examples;

public class Example11Teory5 {
    public static void main(String[] args) {
        // we call old memory
        Example10Teory4 car1=new Example10Teory4();  //Example10Teory4=car
        car1.brand='T';
        car1.currentSpeed=100;
        car1.maxSpeed=180;

        System.out.println(car1.brand);

        Example10Teory4 car2=car1;
        System.out.println(car2.maxSpeed);
        car2.maxSpeed=200;
        System.out.println(car1.maxSpeed);

        Example10Teory4 car3;
        car3=car1;
        car3.maxSpeed=500;
        System.out.println(car1.maxSpeed);
        System.out.println(car2.maxSpeed);
        System.out.println(car3.maxSpeed);

        System.out.println(car1);
        System.out.println(car1);
        System.out.println(car1);
    }
}
