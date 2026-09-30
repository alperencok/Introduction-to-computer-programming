package Examples;

public class cCarTest {

    public static void main(String[] args) {
        cCar[] cars = new cCar[3];
        cars[0] = new cCar();
        cCar c = new cCar();
        c.price = 5000;
        cars[1] = c;
        int sum = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                sum += cars[i].price;
            }
        }
        System.out.println(sum);
    }
}
