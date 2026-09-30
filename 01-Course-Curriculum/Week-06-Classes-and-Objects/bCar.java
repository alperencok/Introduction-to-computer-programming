package Examples;

public class bCar {
    int currentSpeed;
    int maxSpeed;
    //increase speed and return the current speed
    int increaseSpeed(int increment) {
        if (currentSpeed + increment < maxSpeed) {
            currentSpeed += increment;
        } else {
            currentSpeed=maxSpeed;
            System.out.println("It is not possible to exceed mas speed");
        }
        return currentSpeed;
    }
}
