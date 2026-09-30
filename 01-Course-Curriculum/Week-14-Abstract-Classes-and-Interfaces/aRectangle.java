package Examples;

public class aRectangle implements aIShape{
    int a,b;

    public aRectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int getArea() {
        return a*b;
    }

}
