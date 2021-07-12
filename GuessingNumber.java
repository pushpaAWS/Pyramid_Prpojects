package assignments.section3;
import java.util.*;

public class GuessingNumber {
    public static void main(String[] args) {

        Random rand = new Random();
        int randomNumber = rand.nextInt(20)+1;
        System.out.println(randomNumber);

        System.out.println("Hello! What is your name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Well, " + name + ", I am thinking of a number between 1 and 20.\n" + "\n" + "Take a guess.");
        int counter =0;
        Boolean play = true;
        while(play) {

            counter++;
            System.out.println("Please enter the number between 1-20: ");

            int playerGuessedNumber = scan.nextInt();

            if (playerGuessedNumber == randomNumber) {
                System.out.println("Good job," + name + "! You guessed my number in " + counter + " guesses!");
                System.out.println("Would you like to play again? (y or n) ");
                play = scan.next().equalsIgnoreCase("y");
                randomNumber = rand.nextInt(20)+1;
                System.out.println(randomNumber);
                counter =0;
               // System.out.println("text: " +play);

            } else if (randomNumber > playerGuessedNumber)
                System.out.println("Your guess is too low.\n" + "\n" + "Take a guess.");
            else
                System.out.println("Your guess is too high.\n" + "\n" + "Take a guess.");
        }
    }

}




