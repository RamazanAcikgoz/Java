package polymoprhism;

public class Employee extends Person{
    private String jobTittle;
    private long salary;

    public String getJobTittle(){
        return jobTittle;
    }

    public void setJobTittle(String jobTittle) {
        this.jobTittle = jobTittle;
    }
    public long getSalary(){
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
