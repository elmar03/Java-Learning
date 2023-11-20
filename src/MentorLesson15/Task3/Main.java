package MentorLesson15.Task3;

public class Main  {
    public static void main(String[] args) {
        Weapon1 sword= new Weapon1();
        System.out.println(sword.attack());
        System.out.println(sword.attack(45));
        System.out.println(sword.attack(3.5));
        System.out.println(sword.attack("Eruption"));

        Weapon1 weapon1 = new Weapon1();
        System.out.println(weapon1.attack());
        System.out.println(weapon1.attack(35));
        System.out.println(weapon1.attack(3));
        System.out.println(weapon1.attack("Terror"));
    }

}
