package MentorLesson14.task2;

public class Animal {

    String name;
    String sound;

    public Animal() {
    }

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void makeSound(){
        System.out.println("The animal makes the sound");
    }
}
