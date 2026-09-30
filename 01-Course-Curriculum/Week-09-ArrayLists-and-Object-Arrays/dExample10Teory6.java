package Examples;

public class dExample10Teory6 {
    public static void main(String[] args) {
        cCar[] cars=new cCar[3];
        cars[0]=new cCar();
        cars[0].price=1000;
        cars[1]=new cCar();
        cars[1].price=2000;
        cars[2]=new cCar();
        cars[2].price=3000;

        int sum=getTotalPrice(cars);
        System.out.println(sum);

        cCar[] car1=createCarListIncludingElements(5);
        changeThePriceOfIndisN(car1,0,1000);
        changeThePriceOfIndisN(car1,1,1000);
        changeThePriceOfIndisN(car1,2,1000);
        changeThePriceOfIndisN(car1,3,1000);
        changeThePriceOfIndisN(car1,4,1000);
        changeThePriceOfIndisN(car1,10,1000);

        System.out.println(getTotalPrice(car1));

    }
    static int getTotalPrice(cCar[] myCars){
        int sum=0;
        for(cCar myCar:myCars){
            sum+=myCar.price;
        }
        return sum;
    }

// *** createCarListIncludingElements it can be final question ***

    static cCar[] createCarListIncludingElements(int n){
        cCar[] cars=new cCar[n];
        for(int i=0; i<n; i++){
            cars[i]=new cCar();
        }
        return cars;
    }
    static void changeThePriceOfIndisN(cCar[] cars,int indis,int price){
        if(indis < cars.length){
        cars[indis].price=price;
        }else{
            System.out.println("Out of bounds");
        }
    }
}
