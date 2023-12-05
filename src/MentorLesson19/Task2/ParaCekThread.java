package MentorLesson19.Task2;

public class ParaCekThread extends Thread{
    static Object lock = new Object();
    BankHesabi bankaHesabi;
    int cekilecekMiktar;

    public ParaCekThread(BankHesabi bankaHesabi, int cekilecekMiktar) {
        this.bankaHesabi = bankaHesabi;
        this.cekilecekMiktar = cekilecekMiktar;
    }

    @Override
    public void run() {
<<<<<<< HEAD
        synchronized (lock){
        if(cekilecekMiktar< bankaHesabi.paraMiktari){
            System.out.println("Operation successful, your balance is "+ (bankaHesabi.paraMiktari-cekilecekMiktar));
        } else if(cekilecekMiktar>bankaHesabi.paraMiktari) {
            System.out.println("You do not have enough balance");
        } else {
            try {
            }catch (Exception e){
                System.out.println("İnvalid input,Please try again :)");
            }
        }
           lock.notify();

        }
=======
//        synchronized (lock){
//        if(cekilecekMiktar< bankaHesabi.paraMiktari){
//            System.out.println("Operation successful, your balance is "+ (bankaHesabi.paraMiktari-cekilecekMiktar));
//        } else if(cekilecekMiktar>bankaHesabi.paraMiktari) {
//            System.out.println("You do not have enough balance");
//        } else {
//            try {
//            }catch (Exception e){
//                System.out.println("İnvalid input,Please try again :)");
//            }
//        }
//           lock.notify();
//
//        }
        bankaHesabi.paraCek(cekilecekMiktar);

>>>>>>> 9e14541 (Initial commit2)
    }

}
