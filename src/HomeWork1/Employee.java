package HomeWork1;

public abstract class Employee {
    private final String salaryDate = "23";
    private int salary = 55000;
    protected String name;
    protected String profession;

    public abstract void work();

    public String getSalaryDate() {
        return salaryDate;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }
}