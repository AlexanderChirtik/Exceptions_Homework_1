package org.example;

import static org.example.Task1.*;
import static org.example.Task2.subtractArrays;
import static org.example.Task3.divideArrays;

public class Main {
    public static void main(String[] args) {

        String[] stringArray = {"One", "Second", null, "Third"};
        int [] array1 = {12, 6, 77, 98, 1, 92, 18};
        int [] array2 = {16, 6, 44, 1, 18, 90, 12};

        //Task 1

        division(75, 0);
        printValueByIndex(array1,15);
        printStringArray(stringArray);

        //Task 2

        int [] finalArray = subtractArrays(array1, array2);

        for (int i = 0; i < finalArray.length; i++) {
            System.out.print(finalArray[i] + " ");
        }

        // Task 3

        int [] finalArray2 = divideArrays(array1, array2);

        for (int i = 0; i < finalArray.length; i++) {
            System.out.print(finalArray[i] + " ");
        }
    }
}