package Examples;

public class fFactoryTest {
    public static void main(String[] args) {
        fFactory f= new fFactory();
        fCar c1= f.createCar();
        System.out.println(c1.maxSpeed);

        fCar c2= f.createCarWithmaxSpeed200();
        System.out.println(c2.maxSpeed);

        fCar c3=f.createCarWithSpecialmaxSpeed(400);
        System.out.println(c3.maxSpeed);

        fCar c4=f.modifyCarmaxSpeed(c3, 300);
        System.out.println(c4.maxSpeed);

        f.modifyCarmaxSpeedWithoutReturn(c4, 250);
        System.out.println(c4.maxSpeed);

        fCar target=f.copyCar(c4);
        System.out.println(target.maxSpeed);
        c4.maxSpeed=500;
        System.out.println(target.maxSpeed);

        System.out.println("-----");

        System.out.println(c4);
        System.out.println(target);
        System.out.println(c4 == target);

        System.out.println("-----");

        fCar c5=new fCar();
        fCar c6=f.modifyCarmaxSpeed(c5, 555);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c5 == c6);
    }
}
