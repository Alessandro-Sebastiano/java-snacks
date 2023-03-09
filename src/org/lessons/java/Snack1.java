package org.lessons.java;

import java.util.Scanner;

public class Snack1 {

    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci un numero.");
        System.out.print("Number: ");
        int inputNumber = Integer.parseInt(input.nextLine());
        input.close();

        System.out.println((inputNumber % 2) == 0 ? inputNumber : ++inputNumber);

    }

}
