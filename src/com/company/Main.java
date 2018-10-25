package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String [] array = {"Mario", "Luigi", "Princess Peach", "Bowser", "Yoshi", "Wario", "Game & Watch", "Donkey Kong", "Diddy Kong", "Link", "Princess Zelda", "Sheik", "Ganondorf", "Toon Link", "Samus", "Zero Suit Samus", "Pit", "Marth", "Ike" , "Kirby", "King DeDeDe", "Meta Knight", "Fox", "Falco", "Pikachu", "Lucario", "Jigglypuff", "Charizard", "ROB", "Ness", "Captain Falcon", "Olimar", "Dr. Mario", "Sonic", "Rosalina", "Bowser Jr.", "Palutena", "Robin", "Little Mac", "Greninja", "Duck Hunt Dog", "Villager", "Wii Fit Trainer", "Dark Pit", "Lucina", "Shulk", "Mega Man", "Pac-Man", "Luca", "Shnoober" };

        Scanner kbRead = new Scanner(System.in);
        int ranNum = (int)(Math.random() * 26) + 97;

        System.out.println("Are you ready to pick a name? Type in 'yes' to get a name");
        String s = kbRead.next().toLowerCase();

        if (s.equals("yes")) {
            
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }

            String smashName = kbRead.next();
            boolean bool = true;

            while (true) {
                System.out.println("Please, enter a letter that you think " + smashName + " has been assigned");

                char ranChar = (char) ranNum;
                String StringGuess = kbRead.next().toLowerCase();
                char charGuess = StringGuess.charAt(0);
                int intGuess = (int) charGuess;

                if (ranNum < 109 && intGuess != ranNum) {
                    System.out.println("The letter is closer to A");
                }
                else if (ranNum > 109 && intGuess != ranNum) {
                    System.out.println("The letter is closer to Z");
                }
                else if (intGuess == ranNum) {
                    System.out.println("That is correct! Good job and goodbye");
                    break;
                }
                else {
                    System.out.println("Sorry I didn't get that. Please try again.");
                }

            }
        }
        else {
            System.out.println("ok lol bye");
        }
    }
}
