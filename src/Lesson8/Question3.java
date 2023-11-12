package Lesson8;

import java.util.Scanner;

public class Question3 {

    // 1 2 3
    // 8


    String q1 = "To which country Napoleon Bonaparte did not make any campaign?: ";
    String[] a1 = {"Egypt", "Russia", "Ottomans"};
    String q2 = "Which is most populated country in the world right now?: ";
    String[] a2 = {"India", "China", "USA"};
    String q3 = "How much time does it take for light to travel from Sun to Earth?: ";
    String[] a3 = {"3.45 minutes", "1.5 hours", "8 minutes"};
    String q4 = "Which sides fought in the Pearl Harbor?";
    String[] a4 = {"USA vs Japan", "Philippines vs Mexico", "Soviet Union vs Japan"};
    String Questions[] = {q1, q2, q3, q4};
    String Answers[][] = {a1, a2, a3, a4};
    int correctAnswer[] = {3,1,3,1};
    int playerScore =0;

    void quiz3() {
        for (int i = 0; i < Questions.length; i++) {
            System.out.println(Questions[i]);
            for (int j = 0; j < Answers[i].length; j++) {
                System.out.println((j+1) +" "+Answers[i][j]);
            }
                System.out.println("Please enter you answer");
                Scanner scanner = new Scanner(System.in);
                int answerQ1 = scanner.nextInt();


            boolean existsInArray = false;
            for (int j = 0; j < correctAnswer.length; j++) {
                if (correctAnswer[i] == answerQ1) {
                    existsInArray = true;
                    break;
                }
            }

                if (answerQ1== correctAnswer[i]) {
                    System.out.println("True");
                    playerScore++;
                } else if(existsInArray){
                    System.out.println("Wrong answer.Correct answer was " +correctAnswer[i]);
                }

                /*else if (answerQ1 == ) {
                    System.out.println("Your answer is wrong");
                } */ else {
                    System.out.println("Invalid input.Correct answer was " +correctAnswer[i]);

                }
            System.out.println();
            }
        System.out.println("Your score is " + playerScore);
        }
    }



