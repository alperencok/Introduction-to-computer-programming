package Examples;

public class bCarTest {
    public static void main(String[] args) {
        bCar c = new bCar();
        c.maxSpeed=150;
        System.out.println(c.increaseSpeed(50));
        System.out.println(c.increaseSpeed(50));
        System.out.println(c.increaseSpeed(55));

    }
}
