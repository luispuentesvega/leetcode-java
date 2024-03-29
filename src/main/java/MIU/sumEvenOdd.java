package MIU;
/*
Question 2
Write a function that takes an array of integers as an argument and returns a
value based on the sums of the even and odd numbers in the array. Let X = the sum of the odd
numbers in the array and let Y = the sum of the even numbers. The function should return X - Y
The signature of the function is:
int f(int[] a)
Examples:
 -----------------------|-----------------------------------------------------------------------
| if input array is     | return                                                                |
|-----------------------|-----------------------------------------------------------------------|
| {1}                   | 1                                                                     |
|-----------------------|-----------------------------------------------------------------------|
| {1,2}                 | -1                                                                    |
|-----------------------|-----------------------------------------------------------------------|
| {1,2,3}               | 2                                                                     |
|-----------------------|-----------------------------------------------------------------------|
| {1,2,3,4}             | -2                                                                    |
|-----------------------|-----------------------------------------------------------------------|
| {3,3,4,4}             | -2                                                                    |
|-----------------------|-----------------------------------------------------------------------|
| {}                    | 0                                                                     |
 -----------------------------------------------------------------------------------------------

 */

import java.lang.reflect.Array;
import java.util.ArrayList;


public class SumEvenOdd {
    public static void main(String[] args) {
        SumEvenOdd sum = new SumEvenOdd();

    }

    public int calculateSum(int[] nums) {
        int[] res = new int[]{0,0};
        for(int num: nums) {
            if (num % 2 == 0) {
                res[1] = res[1] + num;
            } else {
                res[0] = res[0] + num;
            }
        }
        return res[0] - res[1];
    }
}
