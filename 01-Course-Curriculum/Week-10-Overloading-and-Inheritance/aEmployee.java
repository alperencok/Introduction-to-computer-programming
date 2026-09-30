package Examples;

import java.util.ArrayList;

public class aEmployee {
    String firstName,lastName,title;
    int salary;
    ArrayList<aCar> cars=new ArrayList<>();
    int getTotalCarPrice(){
        int sum=0;
        for (aCar car : cars) {
            sum+=car.price;
        }
        return sum;
    }
}
