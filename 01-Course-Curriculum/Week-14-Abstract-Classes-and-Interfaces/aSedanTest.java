package Examples;

public class aSedanTest {
    public static void main(String[] args) {
       aSedan sedan=new aSedan(100);
       aICar car=sedan;
       System.out.println(car.getMaxSpeed());
       car.setMaxSpeed(200);
       System.out.println(car.getMaxSpeed());
       aIShape shape=sedan;
       System.out.println(shape.getArea());
    }
}
