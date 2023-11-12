package MentorLesson14.task1;

public class Employee {
    String name;
    Double salary;

    public Employee() {
    }

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void getDetails(){
        System.out.println("Name of employee: "+name);
        System.out.println("Salary of employee: "+salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
