package Examples;

public class sSportsCar {
    final int tyreNumber;
    static final double PI;
    static{
        PI=3.14;
        System.out.println("The Static Block is worked");
    }

    public sSportsCar() {
        tyreNumber=4;
    }

    public void setTyreNumber(int tyreNumber) {
       // this.tyreNumber = tyreNumber;
    }

     public int getTyreNumber() {
        final int tyre;
        tyre=5;

        return tyreNumber;
    }
}
