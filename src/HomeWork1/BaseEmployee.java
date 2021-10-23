package HomeWork1;

import HomeWork1.Employee;

public class BaseEmployee extends Employee {
    private String name;
    private int age;
    private boolean sex; //true = male, false = female;

    public BaseEmployee(String name, int age, boolean sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void goHome(){
        System.out.println("Пошел домой");
    }

    public String makeCoffee(){
        return "Делаю коффе";
    }

    @Override
    public void work() {
        System.out.println("Делаю работу");
    }
}

