package MentorLesson16.Task3;

public class Dog implements Fly,Swim,Walk{
    @Override
    public void fly() {
        System.out.println("Oops,Dogs can not fly");
    }

    @Override
    public void swim() {
        System.out.println("Can swim");
    }

    @Override
    public void walk() {
        System.out.println("Dog can walk");
    }
}
