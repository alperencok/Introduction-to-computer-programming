package Examples;

public class bTest {
    public static void main(String[] args) {
        bIMove car=(bIMove)(new bCar(10));
        car.changeLocation(50);
        System.out.println(car.getLocation());
    }
}
