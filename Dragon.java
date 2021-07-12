package assignments.section4;

import java.util.Scanner;

public class Dragon {
    public static void main(String[] args) {
        System.out.println("You are in a land full of dragons. In front of you,\n" +
                "\n" +
                "you see two caves. In one cave, the dragon is friendly\n" +
                "\n" +
                "and will share his treasure with you. The other dragon\n" +
                "\n" +
                "is greedy and hungry and will eat you on sight.");

        System.out.println("Which cave will you go into? (1 or 2)");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        if(choice ==1)
            System.out.println("You approach the cave...\n" +
                    "\n" +
                    "It is dark and spooky...\n" +
                    "\n" +
                    "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                    "\n" +
                    "Gobbles you down in one bite!\n" +
                    "\n" +
                    "\n");
        else
            System.out.println("You approach the cave...\n" +
                    "\n" +
                    "It is dark and spooky..." +
                    "The dragon is friendly\n" +
                    "\n" +
                    "and will share his treasure with you. ");



    }

}
