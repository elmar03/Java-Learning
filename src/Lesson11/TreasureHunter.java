package Lesson11;

public class TreasureHunter {
    String secretCode;

    public void revealSecretCode(){
        System.out.println(this.secretCode);
    }

    public TreasureHunter(String secretCode) {
        this.secretCode = secretCode;
    }

}
