package HomeWork1;

import HomeWork1.Employee;

import java.util.Date;

public class Developer extends Employee {
    private int experience; //лет в программировании
    private String programLanguage;

    public Developer(String name, int experience, String programLanguage) {
        this.name = name;
        this.experience = experience;
        this.programLanguage = programLanguage;
        this.profession = "Разработчик";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getProgramLanguage() {
        return programLanguage;
    }

    public void setProgramLanguage(String programLanguage) {
        this.programLanguage = programLanguage;
    }

    public void getSalary(Date salaryDate) {
        if (getSalaryDate().equals(salaryDate))
            System.out.println("Получил много денег");
        else
            System.out.println("День зарплаты позже");
    }

    public void makeProgram() {
        System.out.println("println(Hello World!);");
    }

    @Override
    public void work() {
        System.out.println("Пишу код");
    }
}