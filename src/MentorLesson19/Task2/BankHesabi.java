package MentorLesson19.Task2;

public class BankHesabi {
<<<<<<< HEAD
    int paraMiktari;
    String hesapSahibi;

    int miktar;

    public BankHesabi(int paraMiktari, String hesapSahibi) {
        this.paraMiktari = paraMiktari;
        this.hesapSahibi = hesapSahibi;
    }

    public void paraCek(){

        if(miktar<paraMiktari){
            System.out.println("Operation successful, your balance is "+ (paraMiktari-miktar));
        } else if(miktar>paraMiktari) {
=======
     int balans;
    String hesapSahibi;



    public BankHesabi(int balans, String hesapSahibi) {
        this.balans = balans;
        this.hesapSahibi = hesapSahibi;
    }

    public synchronized void paraCek(int miktar){

        if(miktar< balans){
            balans = balans - miktar;
            System.out.println("Withdrawed amount- "+miktar);
            System.out.println("Operation successful, your balance is "+ (balans));


        } else if(miktar> balans) {
>>>>>>> 9e14541 (Initial commit2)
            System.out.println("You do not have enough balance");
        } else {
            try {
            }catch (Exception e){
                System.out.println("İnvalid input,Please try again :)");
            }
        }
<<<<<<< HEAD
=======

>>>>>>> 9e14541 (Initial commit2)
    }
}
