package Examples;

import java.util.ArrayList;

public class fExample14Teory10 {
    public static void main(String[] args) {
        ArrayList<cCar> cars=new ArrayList<>();
        cCar c=new cCar();
        c.price=1000;
        cars.add(c);
        cCar c1=new cCar();
        c1.price=2000;
        cars.add(c1);
        System.out.println(cars);

        int sum=0;
        for(cCar car:cars){
            sum+=car.price;
        }
        System.out.println(sum);

        cCar c2=cars.get(1);
        c2.price=5000;

        cars.get(1).price=5000;

        sum=0;
        for(cCar car:cars){
            sum+=car.price;
        }
        System.out.println(sum);

        System.out.println(getSum(cars));

        ArrayList<cCar> myCars=createCarsArrayList(10);
        System.out.println(myCars.size());
    }

    static int getSum(ArrayList<cCar> cars){
        int sum=0;
        for(cCar car:cars){
            sum+=car.price;
        }
        return sum;
    }

    static ArrayList<cCar> createCarsArrayList(int n){
        ArrayList<cCar> cars=new ArrayList<cCar>();
        for (int i = 0; i < n; i++) {
            cars.add(new cCar());
        }
        return cars;
    }
}
