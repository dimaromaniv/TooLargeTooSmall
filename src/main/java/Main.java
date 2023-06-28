

/**
 * Created by iyasuwatts on 10/17/17.
 */


import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        System.out.println("Hello ! Lets play a game");

        Scanner scanner = new Scanner(System.in);
        Random randomFn = new Random();

        int min = 1;
        int max = 100;

        int randomNumber = randomFn.nextInt((max - min + 1) + min );
        boolean hasRightAnswer = false;
        int countOfWrongGesses = 0;

        do{ System.out.print("What is your number ?");
            int gess = scanner.nextInt();


            if (gess < randomNumber) {
                countOfWrongGesses++;

                System.out.println("Too small ." + "Count of wrong guesses " + countOfWrongGesses);

            }
            else if (gess > randomNumber) {
                countOfWrongGesses++;

                System.out.println("Too big . "  + "Count of wrong guesses " + countOfWrongGesses);

            }
            else {
                System.out.println("Your guess is right");
                hasRightAnswer = true;
            }
        }
        while (!hasRightAnswer);
        scanner.close();
    }
    }
