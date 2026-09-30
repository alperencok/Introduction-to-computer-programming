package Examples;

public class cTestGaleryWithPolymorphism {

    public static void main(String[] args) {
        cGaleryWithPolymorphism g = new cGaleryWithPolymorphism();
        g.addCar(new cCar());
        g.addCar(new cSedan());
        g.addCar(new cSedan());
        g.addCar(new cSportCar());
        g.addCar(new cSportCar());
        g.addCar(new cSportCar());
        g.displayAllCarsPrice();
        System.out.println(g.getTotalPrice());
    }
}
