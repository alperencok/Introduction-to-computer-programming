package Examples.JobPackage;

public class Job {
    private int salary;
    private String jobName;

    public Job(int salary,String jobName ) {
        this.salary = salary;
        this.jobName = jobName;
    }

    public int getJobSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}
