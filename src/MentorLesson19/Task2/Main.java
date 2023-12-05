package MentorLesson19.Task2;

public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        BankHesabi bankHesabi1 = new BankHesabi(1000,"Jack Sparrow");
        ParaCekThread thread = new ParaCekThread(bankHesabi1,30);
        ParaCekThread thread1 = new ParaCekThread(bankHesabi1,40);
        ParaCekThread thread2 = new ParaCekThread(bankHesabi1,50);
=======
        BankHesabi bankHesabi1 = new BankHesabi(1000, "Jack Sparrow");
        ParaCekThread thread = new ParaCekThread(bankHesabi1, 30);
        ParaCekThread thread1 = new ParaCekThread(bankHesabi1, 40);
        ParaCekThread thread2 = new ParaCekThread(bankHesabi1, 50);
        ParaCekThread thread3 = new ParaCekThread(bankHesabi1, 100);


>>>>>>> 9e14541 (Initial commit2)

        thread.start();
        thread1.start();
        thread2.start();
<<<<<<< HEAD

        try {
            Object BankHesabi;
            synchronized (bankHesabi1) {
                bankHesabi1.wait();
            }

        try{
            thread.join();
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }}
=======
        thread3.start();

//        try {
//            Object BankHesabi;
//            synchronized (bankHesabi1) {
//                bankHesabi1.wait();
//            }

//        try{
//            thread.join();
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//
//    } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
    }
}
>>>>>>> 9e14541 (Initial commit2)
