package MentorLesson15.Task3;

public class Weapon1 {
    public String attack(){
        return "Performing a basic attack";
    }
    public String attack(int damage){
        return "Performing a basic attack with " +damage +" damage";
    }

    public String attack(double criticalMultiplier){
        return "Performing a critical attack with the damage multiplier of " +criticalMultiplier ;
    }

    public String attack(String specialMove){
        return "Performing a special attack: " +specialMove ;
    }
}
