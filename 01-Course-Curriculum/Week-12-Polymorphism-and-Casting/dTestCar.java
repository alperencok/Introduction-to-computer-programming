package Examples;
import java.util.ArrayList;
public class dTestCar {

    public static void main(String[] args) {
        //Get total price of all cars.
        ArrayList cars = new ArrayList();
        cars.add(new dCar(1000));
        cars.add(new dCar(2000));
        cars.add("I am really a car");
        cars.add(new dCar(1000));
        int sum = 0;
        for (Object car : cars) {
            if (car instanceof dCar) {
                sum += ((dCar) car).getPrice();
            } else {
                System.out.println(car);
            }
        }
        System.out.println("Sum : " + sum);

    }
}
