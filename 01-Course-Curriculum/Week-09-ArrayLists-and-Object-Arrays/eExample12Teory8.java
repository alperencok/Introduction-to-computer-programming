package Examples;

import java.util.ArrayList;

public class eExample12Teory8 {
    public static void main(String[] args) {
        ArrayList cities=new ArrayList();
        cities.add("Ankara");
        cities.add("Istanbul");
        cities.set(1, "Izmir");
        System.out.println(cities);
        cities.add(new cCar());
    }
}
