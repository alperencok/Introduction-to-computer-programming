package Examples;

public class bCar implements bICar{
    int location;
    int speed;

    public bCar(int location) {
        this.location = location;
    }

    @Override
    public void changeLocation(int x) {
        location=location+x;
    }

    @Override
    public int getLocation() {
        return location;
    }

    @Override
    public void setLocation(int x) {
        location=x;
    }

    @Override
    public void increaseSpeed() {
        speed++;
    }

    @Override
    public void decreaseSpeed() {
        speed--;
    }

}
