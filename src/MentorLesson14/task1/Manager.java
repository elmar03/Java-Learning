package MentorLesson14.task1;

public class Manager extends Employee {
    int teamSize;

    public Manager(int teamSize) {
        this.teamSize = teamSize;
    }

    public Manager(String name, Double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void getDetails() {
        //super.getDetails();
        System.out.println("The name of manager: "+name);
        System.out.println("The number of employees managed by the manager: "+teamSize);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "teamSize=" + teamSize +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
