package Examples;

public class cTestProblematicalDownCast {
    public static void main(String[] args) {
        cCar c=new cSportCar();
        cSedan s=(cSedan)c;
        s.whoIam();
    }
}
