package Examples;

public class cTestDownCast1 {
    public static void main(String[] args) {
        cCar c=new cSportCar();
       // cSportCar s=(cSportCar)c;
       // s.startTurbo();

        ((cSportCar)c).startTurbo();

    }
}
