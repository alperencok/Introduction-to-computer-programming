package Examples;

public class aEmployee {
    String firstName, lastName;
    int salary;
    int workingYear;
    char job;
    void displayInfo(){
    }
    void calculateSalary(){
        if (job == 'D' && workingYear > 10) {
            salary = 10000;
        } else if (job == 'D' && workingYear <= 10) {
            salary = 5000;
        } else {
            salary = 3000;
        }
    }
    int getSalary(){
         if (job == 'D' && workingYear > 10) {
            salary = 10000;
        } else if (job == 'D' && workingYear <= 10) {
            salary = 5000;
        } else {
           salary = 3000;
        }
        return salary;
    }
}
