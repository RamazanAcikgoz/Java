package absraction;
// Every employee means person thus lets extends from Person class
// But each company's has different algorithm for calculated salary
// So let's write superclass abstraction and see how behave to others
public abstract class AbstractEmployee extends Person {
    private String jobTitle;

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    //Abstract method without body
    public abstract float calculateSalary();
}
