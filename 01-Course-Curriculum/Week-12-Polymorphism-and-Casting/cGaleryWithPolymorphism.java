package Examples;
import java.util.ArrayList;
public class cGaleryWithPolymorphism {
    ArrayList<cCar> cars=new ArrayList<>();
    int getTotalPrice(){
            int total=0;
            for (cCar car : cars) {
                total+=car.getPrice();
            }
            return total;
    }
    void addCar(cCar c){
        cars.add(c);
    }
    void displayAllCarsPrice(){
        for (cCar car : cars) {
            System.out.println(car.getPrice());
        }

    }

}
