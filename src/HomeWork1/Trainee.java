package HomeWork1;

public class Trainee extends Employee {
    private String university;
    private boolean isFinished; // Закончил университет ли университет

    public Trainee(String name, String university, boolean isFinished) {
        this.name = name;
        this.university = university;
        this.isFinished = isFinished;
        this.profession = "Стажер";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public void makeBadCode(){
        System.out.println("PrinLN(HeloWorld]");
    }

    public boolean canSleep(){
        return false;
    }

    @Override
    public void work() {
        System.out.println("Спрашиваю страшего сотрудника как создать копию Google");
    }
}