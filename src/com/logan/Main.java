package com.logan;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("I'm Tiny Rick!!!! Ask me a question! Not about school though, because school is lame! ");
        Random words = new Random();
        String[] phrases = {
                "oh yeah!", "dont stop til you get that schezuan sauce!", "wubba lubba dub dub! uhh thats a yes", "oh boy! thats a for sure jerry", "YES!", "Heckle yeah!", "Oh jeez Rick you sure are right!", "maybe...haha gotcha its a yes", "you wont die! its a forsure yes", "go ahead you will do it anyways",
                "Give me time to think Morty", "I'm Tiny Rick!!!! Wait what was the question again?", "Uhhhhh..", "Im busy right now Morty", "Out on an adventure be back whenever",
                "existence is pain!", "Look at me! THAT'S A NO!", "Nobody exists on purpose, aka no", "go ahead and do it, but i will say you will fail", "failure like Jerry and Beth "
        };

        Scanner scanner = new Scanner(System.in);
        label:
        while (true) {
            int randomPhrase = words.nextInt(phrases.length);
            String myInput = scanner.nextLine();
            switch (String.valueOf(myInput)) {
                case "":
                    System.out.println("That's not a question! Try again!!");
                    break;
                case "jerry":
                    System.out.println("HAHA ANY TIME YOU NEED TINY RICK, ILL BE HERE!");
                    break label;
                default:
                    System.out.println(phrases[randomPhrase]);
                    break;
            }
        }
    }

}
