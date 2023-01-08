package MIU;
/*
Question 5
Write a function to return an array containing all elements common to two
given arrays containing distinct positive integers. You should not use any inbuilt
methods. You are allowed to use any number of arrays.

The signature of the function is:
int[] f(int[] first, int[] second)

Examples:
 --------------------------------|--------------------------------------------------------------
| if the input parameters are    | return                                                       |
|--------------------------------|--------------------------------------------------------------|
| {1,8,3,2},{4,2,6,1}            | {1,2}                                                        |
|--------------------------------|--------------------------------------------------------------|
| {1,8,3,2,6},{2,6,1}            | {2,6,1}                                                      |
|--------------------------------|--------------------------------------------------------------|
| {1,3,7,9},{7,1,9,3}            | {1,3,7,9}                                                    |
|--------------------------------|--------------------------------------------------------------|
| {1,2}, {3,4}                   | {}                                                           |
|--------------------------------|--------------------------------------------------------------|
| {}, {1,2,3}                    | {}                                                           |
|--------------------------------|--------------------------------------------------------------|
| {1,2}, {}                      | {}                                                           |
|--------------------------------|--------------------------------------------------------------|
| {1,2}, null                    | null                                                         |
|--------------------------------|--------------------------------------------------------------|
| null, {}                       | null                                                         |
|--------------------------------|--------------------------------------------------------------|
| null, null                     | null                                                         |
 --------------------------------|--------------------------------------------------------------

NOTE: To ease debugging, Will return a string array.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {
        Question5 q5 = new Question5();
        int[] first = new int[]{1,3,7,9};
        int[] second = new int[]{7,1,9,3};
        System.out.println(q5.f(null, null));
    }

    public ArrayList<Integer> f(int[] first, int[] second) {
        ArrayList<Integer> output = new ArrayList<>();
        // if first array is null or its length is zero -> return null
        if (first == null || first.length == 0) return null;
        // if second array is null or its length is zero -> return null
        if (second == null || second.length == 0) return null;

        // sort array1
        Arrays.sort(first);//1,2,3,8
        // sort array2
        Arrays.sort(second);//1,2,4,6
        // loop both array
        for (int i = 0; i < first.length; i++) {
            int currentI = first[i];
            for (int j=0; j < second.length; j++) {
                int currentJ = second[j];
                if (currentI == currentJ) {
                    output.add(currentI);
                    break;
                }
            }
        }
        // if the current number is in both, then add to arr response
        return output;
    }
}
