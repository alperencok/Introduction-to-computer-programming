package Examples;

public class gCar {
    int maxSpeed;
    String brand;

    public gCar(int maxSpeed, String brand){
            this.maxSpeed=maxSpeed;
            this.brand=brand;
    }

    public gCar(int maxSpeed){
        System.out.println("Car constructor is called");
    }
    public gCar(){
    }
}
