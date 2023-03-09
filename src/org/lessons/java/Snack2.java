package org.lessons.java;

import java.util.Random;

public class Snack2 {

    public static void main(String[] arg){

        String[] names = {"Jay", "Daisy", "Jordan", "George", "Nick", "Klipspringer"};
        String[] surnames = {"Gatsby", "Buchanan", "Wilson", "Carraway", "Wolfshiem", "McKee"};

        Random rand = new Random();

        for (int i = 0; i < 15; i++) {
            String name = names[rand.nextInt(names.length)];
            String surname = surnames[rand.nextInt(surnames.length)];
            System.out.println(name + " " + surname);
        }

    }

}
