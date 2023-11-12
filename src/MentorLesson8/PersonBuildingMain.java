package MentorLesson8;

import Lesson8.Person;

public class PersonBuildingMain {
    public static void main(String[] args) {
        Building building1= new Building(1,"Hamza",10,7,"Salam",false);
        Person person1 = new Person(1,"Elmar","Soltanov",25,"Risk",1,building1);
        System.out.println(person1);
    }
}
