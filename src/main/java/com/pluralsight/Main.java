package com.pluralsight;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Arrays Methods test scores
// -------------------------------------- Shorter way to find average, highest and lowest -----------------------------------
        int[] testScores = {100, 63, 94, 88, 55, 100, 98, 80, 90, 73};
        System.out.println("Avarage test score: " + Arrays.stream(testScores).average().getAsDouble());
        System.out.println("Highest grade: " + Arrays.stream(testScores).max().getAsInt());
        System.out.println("Lowest grade: " + Arrays.stream(testScores).min().getAsInt());
        // Technically I don't need to ass the ".getAsDouble() or .getAsInt()"  ^ ^ ^      ^ ^ ^


//----------------------------------------- This way is not working for some reason -----------------------------------------
        /*
       int[] testScores = {90, 78, 88, 99, 76, 55, 66, 83, 93, 81};
       int sum = 0;

       for (int i = 0; i < testScores.length; i++) {
           sum += testScores[i];
       }
       double average = (double) sum / testScores.length;
        System.out.println("Average: " + average);

        int max = testScores[0];

        for (int i = 0; 1 < testScores.length; i++) {
            if (testScores[i] > max) {
                max = testScores[i];

            }
        }
        System.out.println("Highest score: " + max);

        int min = testScores[0];

        for (int i = 0; 1 < testScores.length; i++) {
            if (testScores[i] < min) {
                min = testScores[i];
            }
        }
        System.out.println("Lowest Score: ");   */

    }
}