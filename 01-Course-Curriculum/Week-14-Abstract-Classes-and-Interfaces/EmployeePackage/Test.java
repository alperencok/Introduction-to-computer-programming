package Examples.EmployeePackage;
import Examples.JobPackage.Job;
public class Test {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setFirstName("John");
        e.addresses.add("Fatih");
        e.addresses.add("Sultan");

        Job[] jobs={new Job(1000,"IT"),new Job(2000,"DEV"),new SpecialJob(1000,"IT")};
        e.setJobs(jobs);
        e.setJobSalary(new Job(100, "IT"), 1000);
        System.out.println("Total salary = "+ e.getEmployeeSalary());

        e.writeJobCount();
    }
}
