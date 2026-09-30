package Examples;

public class cEmployee {
    String firstName, lastName;
    int age;
    int salary;
    cEmployee(){
        System.out.println("Initialized");
    }
    cEmployee(int salary){
        if(salary<25000){
            this.salary=25000;
        }else{
            this.salary=salary;
        }
    }
    //Insert Code
    public cEmployee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

}
