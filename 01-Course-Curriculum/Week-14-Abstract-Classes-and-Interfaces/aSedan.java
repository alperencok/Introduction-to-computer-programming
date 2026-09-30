package Examples;

public class aSedan extends aCar implements aIShape, aICar{
    int maxSpeed;

    public aSedan(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int getArea() {
        return 1000;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed=maxSpeed;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }
}
