package HomeWork1;

import HomeWork1.Employee;

public class TeamLead extends Employee implements Manager {
    private String name;
    private int salary;
    private boolean isBusy;

    public TeamLead(String name, int salary, boolean isBusy) {
        this.name = name;
        this.salary = salary;
        this.isBusy = isBusy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }

    public void changeSalary(Employee employee, int salary){
        employee.setSalary(salary);
    }

    public Trainee hireNewEmployee(Trainee trainee){
        return new Trainee(trainee.getName(), trainee.getUniversity(), trainee.isFinished());
    }

    @Override
    public void work() {
        System.out.println("Раздаю задачи, мотивирую команду");
    }

    @Override
    public void checkTime() {
        System.out.println("Еще рано");
    }

    @Override
    public void goToWork() {
        System.out.println("Опять работать");
    }
}