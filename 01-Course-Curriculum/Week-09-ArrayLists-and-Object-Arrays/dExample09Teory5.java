package Examples;

public class dExample09Teory5 {
    public static void main(String[] args) {
        cCar[] cars=new cCar[3];
        cCar c=new cCar();
        c.price=3;
        cars[0]=c;
        cars[1]=c;
        cars[2]=c;
        int sum=0;
        cars[0].price=5;  //c.price=2;
        for(cCar car:cars){
            sum+=car.price;
        }
        System.out.println(sum);
    }
}
