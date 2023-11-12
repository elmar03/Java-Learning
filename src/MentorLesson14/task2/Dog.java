package MentorLesson14.task2;

import java.sql.SQLOutput;

public class Dog extends Animal {
    String breed;



    public Dog(String name, String sound, String breed) {
        super(name,sound);
        this.breed = breed;
    }


    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("The sound of " +breed+ " is: "+sound );
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
