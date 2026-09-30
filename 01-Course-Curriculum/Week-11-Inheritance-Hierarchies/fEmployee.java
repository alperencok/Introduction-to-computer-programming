package Examples;

public class fEmployee {
    int hireYear;
    int getSalary(){
        if(hireYear<2000){
            return 10000;
        }else{
            return 5000;
        }
    }
}
