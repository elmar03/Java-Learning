package MentorLesson14.task1;

public class Developer extends Employee {
    String programmingLanguage;

    public Developer(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public Developer(String name, Double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Language the developer specializes in: "+programmingLanguage);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
