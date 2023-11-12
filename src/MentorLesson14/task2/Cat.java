package MentorLesson14.task2;

public class Cat extends Animal{

    String color;

    public Cat(String color) {
        this.color = color;
    }

    public Cat(String name, String sound, String color) {
        super(name, sound);
        this.color = color;
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println(color+ " cat sounds: "+ sound);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
