package org.lessons.java;

import java.beans.ParameterDescriptor;
import java.util.Random;

public class Snack4 {

    public static void main(String[] arg){

        Random rand = new Random();

        int[] arr1 = {3, 5, 1, 6, 2, 4, 7, 8};
        int[] arr2 = {6, 7, 8, 9};

        int minlength = Math.min(arr1.length, arr2.length);
        int maxlength = Math.max(arr1.length, arr2.length);

        int randomItem = maxlength - minlength;

        for (int i = 0; i < randomItem; i++) {
            System.out.println(rand.nextInt(10));
        }

    }

}
