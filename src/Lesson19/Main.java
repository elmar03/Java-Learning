package Lesson19;

import java.sql.SQLOutput;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        Colors color = Colors.RED;
        Colors color1 = Colors.BLUE;
        Colors color2 =Colors.YELLOW;
        colorMethod(color);

    }
        public static void colorMethod(Colors color){
            switch (color) {
                case RED:
                    System.out.println("My blood is red,my heart is on the left");
                break;
                case BLUE:
                    System.out.println("Owls are the only birds who can see the color blue!");
                break;
                case YELLOW:
                    System.out.println("In February 2016, the Malaysian government banned yellow t-shirts, " +
                            "as they were being worn by protestors demanding the resignation " +
                            "of the nation’s Prime Minister.");
                    break;
                default:
                    System.out.println("Color is not known");
                    break;

            }
        }
    }

