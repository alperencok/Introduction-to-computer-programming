package Examples;

import java.util.ArrayList;

public class gCompany {
    ArrayList<gEmployee> employees=new ArrayList<>();
     void displayEmployeesCarPrice(){
         for (gEmployee e:employees){
             for (cCar c:e.cars){
                    System.out.println(c.price);

             }

         }
     }

      void displayAllDriverName(){
         for (gEmployee e:employees){
             for (cCar c:e.cars){
                    System.out.println(c.driver.fullName);
             }
         }
     }
}
