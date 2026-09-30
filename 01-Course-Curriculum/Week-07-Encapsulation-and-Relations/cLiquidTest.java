package Examples;

public class cLiquidTest {
    public static void main(String[] args) {
        cLiquid l=new cLiquid();
        l.boilingPoint=100;
        l.temperature=98;
        l.totalVolume=50;
        l.increaseTemperature();
        System.out.println(l.totalVolume + " " + l.temperature);
        l.increaseTemperature();
        System.out.println(l.totalVolume + " " + l.temperature);
    }
}
