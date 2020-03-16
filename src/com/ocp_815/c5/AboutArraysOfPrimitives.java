package com.ocp_815.c5;

import java.util.Arrays;

public class AboutArraysOfPrimitives {
    private static void print(Object string) {
        System.out.println(string);
    }

    public static void main(String[] args) {
        /* TODO:
            Declarations
        */
        int[] numAnimals;
        int [] numAnimals2;
        int []numAnimals3;
        int numAnimals4[];
        int numAnimals5 [];

        int[] numAnimals6, types;   // array of int, int (because there is no brackets)

        /* TODO:
            Casting
        */
//        String[] strings_1 = {"stringValue"};
//        Object[] objects_1 = strings_1;
//        String[] strings_2 = (String[]) objects_1;
////        strings_2[0] = new StringBuilder();     // DOES NOT COMPILE
//        objects_1[0] = new StringBuilder();       // we have a String[] at runtime it throws ArrayStoreException

        /* TODO:
            Sorting
            Arrays.sort
            import java.util.*;
            import java.util.Arrays;
        */
//        int[] numbers_1 = { 6, 9, 1 };
//        Arrays.sort(numbers_1);
//        for (int i = 0; i < numbers_1.length; i++) {
//            print(numbers_1[i] + " ");
//        }


        /* TODO:
            Searching
            Arrays.binarySearch
            --
            Found           = index of match
            Not Found       = Negative value showing one smaller than the negative of the index,
                              where match needs to be inserted to preserve sorted order
            Unsorted Array  = Result is not predictable
        */
//        int[] numbers_2 = {2, 4, 6, 8 };
//        print(Arrays.binarySearch(numbers_2, 2));   // 0
//        print(Arrays.binarySearch(numbers_2, 4));   // 1
//        print(Arrays.binarySearch(numbers_2, 1));   // -1
//        print(Arrays.binarySearch(numbers_2, 3));   // -2
//        print(Arrays.binarySearch(numbers_2, 9));   // -5

        /* TODO:
            Comparing
            compare()
            --
            Array1 Length > Array2 Length           = +number
            Array1 Exact Match Array2               = 0
            Array1 substring of Array2              = -number
            Uppercase is smaller than lowercase     = +number
            null is smaller than a letter           = +number
        */

//        // Array1 Length > Array2 Length           = +number
//        print(Arrays.compare(new int[] { 1, 2 }, new int[] { 1 }));             // 1
//        // Array1 Exact Match Array2               = 0
//        print(Arrays.compare(new int[] { 1, 2 }, new int[] { 1, 2 }));          // 0
//        // Array1 substring of Array2              = -number
//        print(Arrays.compare(new String[] { "a" }, new String[] { "aa" }));     // -1
//        // Uppercase is smaller than lowercase     = +number
//        print(Arrays.compare(new String[] { "a" }, new String[] { "A" }));      // 32
//        // null is smaller than a letter           = +number
//        print(Arrays.compare(new String[] { "a" }, new String[] { null }));     // 1


        /* TODO:
            mismatch()
            --
            Array1 Equal Array2             = -1
            Array1 Not Equal Array2         = First index where they differ
        */
//        print(Arrays.mismatch(new int[] { 1 }, new int[] { 1 }));               // -1
//        print(Arrays.mismatch(new String[] { "a" }, new String[] { "A" }));     // 0 (First entry are not equal)
//        print(Arrays.mismatch(new int[] { 1, 2 }, new int[] { 1 }));            // 1
//        print(Arrays.mismatch(new int[] { 1 }, new int[] { 1, 2 }));            // 1
    }
}
