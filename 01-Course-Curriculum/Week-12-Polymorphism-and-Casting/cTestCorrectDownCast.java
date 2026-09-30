package Examples;

public class cTestCorrectDownCast {
    public static void main(String[] args) {
        cCar c=new cSedan();
        //downcast
        cSedan s=(cSedan)c;
        s.whoIam();
        c.whoIam();
    }
}
