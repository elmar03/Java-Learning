package MentorLesson19.Task2;

public class BankHesabi {
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
            System.out.println("You do not have enough balance");
        } else {
            try {
            }catch (Exception e){
                System.out.println("İnvalid input,Please try again :)");
            }
        }
    }
}
