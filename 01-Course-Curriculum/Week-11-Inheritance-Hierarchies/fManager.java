package Examples;

public class fManager extends fEmployee{
    // a manager has additional salary 5000;
    int getSalary(){
    return super.getSalary()+5000;

    /* suboptimal
    int getSalary(){
        if(hireYear<2000){
            return 10000+5000;
        }else{
            return 5000+5000;
    */

    }
}
