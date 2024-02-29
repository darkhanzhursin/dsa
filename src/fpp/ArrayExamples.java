package fpp;

import java.util.Arrays;

public class ArrayExamples {

    static void splitWords(String str) {
        // to use more than one separator in s split we use ('|')
        // To indicate a dot, use \\. instead of just .
        String[] arr = str.split(" |,|\\. |\\.");
        System.out.println(Arrays.toString(arr));
    }

    static void copyArrExample() {
        int[] smallPrimes = {2, 3, 5, 7, 11};
        int[] copy = new int[5];
        System.arraycopy(smallPrimes, 0, copy, 0, 5);
        System.out.println(Arrays.toString(copy));
    }

    static void sortExample() {
        int[] luckyNums = {350, 400, 150, 3, 5};
        Arrays.sort(luckyNums);
        System.out.println(Arrays.toString(luckyNums));
    }

    static void solution(String[] arr1, String[] arr2) {
        String[] copy = new String[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, copy, 0, arr1.length);
        System.arraycopy(arr2, 0, copy, arr1.length, arr2.length);
        System.out.println(Arrays.toString(copy));
    }
    public static void main(String[] args) {

        // specifies a 3 x 4 array
        // teams.length is 3
        // teams[i].length is 4 (whenever 0 <= i <= 2)
        // teams[1][2] has value "David" (row 1, column2)
         String[][] teams = {
                {"Joe", "Bob", "Frank", "Steve"},
                {"Jon", "Tom", "David", "Ralph"},
                {"Tim", "Bev", "Susan", "Dennis"}
        };

        String string = "Hello,strings can be fun. They have many uses.";
        //splitWords(string);
        //copyArrExample();
        //sortExample();
        solution(new String[] {"Aa", "Bb", "Cc"}, new String[] {"Dd", "Ee", "Ff", "Gg"});
    }
}
