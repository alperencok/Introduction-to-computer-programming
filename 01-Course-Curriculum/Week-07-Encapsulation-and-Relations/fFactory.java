package Examples;

public class fFactory {
    //Create a car with no attribute assigned
    fCar createCar(){
        fCar c=new fCar();
        return c;
        //return new fCar();
    }
    //Create a car with maxSpeed = 200
    fCar createCarWithmaxSpeed200(){
        fCar c=new fCar();
        c.maxSpeed=200;
        return c;

    }
    //Create a car with special maxSpeed defined by caller
    fCar createCarWithSpecialmaxSpeed(int specialMaxSpeed){
        fCar c=new fCar();
        c.maxSpeed=specialMaxSpeed;
        return c;
    }
    //Modify car with a special speed
    fCar modifyCarmaxSpeed(fCar c, int specialmaxSpeed){
        c.maxSpeed=specialmaxSpeed;
        return c;
    }
    void modifyCarmaxSpeedWithoutReturn(fCar c, int specialmaxSpeed){
        c.maxSpeed=specialmaxSpeed;
    }
    //Create a copy of existing Car as a new object
    fCar copyCar (fCar source){
        fCar copy=new fCar();
        copy.maxSpeed=source.maxSpeed;  // If copy=source, they reference the same object; copy values instead
        return copy;
    }
}
