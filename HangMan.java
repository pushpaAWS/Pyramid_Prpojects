package assignments.section4;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class HangMan {
    public static void main(String[] args) throws Exception{
        System.out.println("\n*********************");
        System.out.println("Welcome To HangMan Game");
        System.out.println("*********************");
        System.out.println("\nI'm thinking of some word. \n" + "You need to guess the word, letter by letter.\n"+"You have 6 lives in total.\n"+"Let's play the game...\n");
        String missedLetters ="";
        File dictionary = new File("C:/Pushpa/pyramid-curriculum-2.0/src/assignments/section4/dictionary.txt");
        Scanner textScanner = new Scanner(dictionary);
        Scanner input = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();
        while (textScanner.hasNext()){
            words.add(textScanner.nextLine());
        }
        String hidden_text = words.get((int)(Math.random()*words.size()));
        char[] textArray = hidden_text.toCharArray();

        char[] myAnswers = new char[textArray.length];
        for(int i=0; i<textArray.length; i++){
            myAnswers[i] = '?';
        }

        boolean finished =false;
        int lives =6;
        while (finished == false){
            System.out.println("*********************");
//            hidden_text = words.get((int)(Math.random()*words.size()));
//            textScanner = new Scanner(dictionary);
//            input = new Scanner(System.in);
            String letter =input.next();
            //checks for valid input
            while(letter.length() != 1 || Character.isDigit(letter.charAt(0))){
                System.out.println("Error Input -Try Again");
                letter = input.next();
            }
            //checks if letter is in the word
            boolean found = false;
            for(int i = 0; i < textArray.length; i++){
                if(letter.charAt(0) == textArray[i]){
                    myAnswers[i] = textArray[i];
                    found = true;
                }
            }
            if(!found){
                lives--;
                missedLetters += letter + " ";
                System.out.println("Missed letters: " +missedLetters);

            }
            boolean done =true;
            for (int i=0; i< myAnswers.length; i++){
                if (myAnswers[i] == '?'){
                    System.out.print(" -");
                    done = false;
                }
                else {
                    System.out.print(" "+ myAnswers[i]);

                }
            }
            System.out.println("\n"+ "Lives Left: "+ lives);

            drawHangman(lives);
            //check if the game ends
            if (done){
                System.out.println("Congrats, You have won! You Found The word");
                System.out.println("The secret word is "+hidden_text+".");
//                System.out.println("Would you like to play again? (y or n) ");
//                finished = input.next().equalsIgnoreCase("n");
//                hidden_text = words.get((int)(Math.random()*words.size()));
//                textScanner = new Scanner(dictionary);
//                input = new Scanner(System.in);


                finished = true;
            }
            if(lives <=0){
                System.out.println("You are dead! Study your English");
                System.out.println("The secret word is "+hidden_text+".");
                finished = true;
            }
        }
      //  System.out.println("Yes! The secret word is "+hidden_text+"! You have won!");

    }
    public static void drawHangman(int l) {
        if(l == 6) {
            System.out.println("|----------");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if(l == 5) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if(l == 4) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|    |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if(l == 3) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|   -|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if(l == 2) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|   -|-");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if(l == 1) {
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|   -|-");
            System.out.println("|   /");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else{
            System.out.println("|----------");
            System.out.println("|    O");
            System.out.println("|   -|-");
            System.out.println("|   /|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
    }

}
