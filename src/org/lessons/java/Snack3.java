package org.lessons.java;

public class Snack3 {

    public static void main(String[] arg){

        int[] numbers = {5, 12, 16, 4, 9, 32, 55, 2, 28, 7};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            if ((i % 2) != 0){

                sum += numbers[i];

            }

        }

        System.out.println("Sum: " + sum);

    }

}
