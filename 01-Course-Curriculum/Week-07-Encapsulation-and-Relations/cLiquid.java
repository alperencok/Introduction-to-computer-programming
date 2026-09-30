package Examples;

public class cLiquid {
    int temperature, totalVolume, boilingPoint;
    void increaseTemperature(){
        temperature++;
        if(temperature>=boilingPoint){
            evoporate();
        }
    }
    void evoporate(){
        if(totalVolume>1){
            totalVolume--;
        }
    }
}
