package Examples;
import java.util.ArrayList;
public class cGalery {
    ArrayList<cCar> cars=new ArrayList<>();
    ArrayList<cSedan> sedans=new ArrayList<>();
    ArrayList<cSportCar> sports=new ArrayList<>();
    int getTotalPrice(){
            int total=0;
            for (cCar car : cars) {
                total+=car.price;
            }
            for (cSedan sedan : sedans) {
                total=total+sedan.price;
            }
             for (cSportCar sport : sports) {
                total=total+sport.price;
            }
            return total;
    }
}
