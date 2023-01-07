package MIU;

import java.util.ArrayList;

/*
Question 3
Write a function that accepts a character array, a zero-based start position and
a length. It should return a character array containing lengthCharacters starting with
the startCharacter of the input array. The function should do error checking on the start
position and the length and return null if the either value is not legal.

The function signature is:
char[] f(char[] a, int start, int len)

 --------------------------------|--------------------------------------------------------------
| if the input parameters are is | return                                                       |
|--------------------------------|--------------------------------------------------------------|
| {'a','b','c'}, 0, 4            | null                                                         |
|--------------------------------|--------------------------------------------------------------|
| {'a','b','c'}, 0, 3            | {'a','b','c'}                                                |
|--------------------------------|--------------------------------------------------------------|
| {'a','b','c'}, 0, 2            | {'a','b'}                                                    |
|--------------------------------|--------------------------------------------------------------|
| {'a','b','c'}, 0, 1            | {'a'}                                                        |
|--------------------------------|--------------------------------------------------------------|
| {'a','b','c'}, 1, 3            | null                                                         |
|--------------------------------|--------------------------------------------------------------|
| {'a','b','c'}, 1, 2            | {'b','c'}                                                    |
|--------------------------------|--------------------------------------------------------------|
| {'a','b','c'}, 1, 1            | {'b'}                                                        |
|--------------------------------|--------------------------------------------------------------|
| {'a','b','c'}, 2, 2            | null                                                         |
|--------------------------------|--------------------------------------------------------------|
| {'a','b','c'}, 2, 1            | {'c'}                                                        |
|--------------------------------|--------------------------------------------------------------|
| {'a','b','c'}, 3, 1            | null                                                         |
|--------------------------------|--------------------------------------------------------------|
| {'a','b','c'}, 1, 0            | {}                                                           |
|--------------------------------|--------------------------------------------------------------|
| {'a','b','c'}, -1, 2           | null                                                         |
|--------------------------------|--------------------------------------------------------------|
| {'a','b','c'}, -1, -2          | null                                                         |
|--------------------------------|--------------------------------------------------------------|
| {}, 0, 1                       | null                                                         |
 -----------------------------------------------------------------------------------------------

NOTE: To ease debugging, i will return string containing the characters

 */
public class Question3 {
    public static void main(String[] args) {
        Question3 q3 = new Question3();
        char[] a = new char[]{'a','b','c'};
        int start = 0;
        int len = 1;
        ArrayList<String> s = q3.arrayContaining(a, start, len);
        System.out.println(s);
        for(String b: s) {
            System.out.println(b);
        }
    }

    public static boolean isValidIndex(char[] arr, int index) {
        return index >= 0 && index < arr.length;
    }

    public ArrayList<String> arrayContaining(char[] a, int start, int len) {
        ArrayList<String> myArr = new ArrayList<String>();

        int length = len - 1;
        char[] myChar = new char[len];
//        System.out.println(myChar.toString());

        if (!isValidIndex(a, start)) {
            return null;
        }
        if (!isValidIndex(a, length)) {
            return null;
        }

        int index = 0;
        for (int i = start; i <= x; i++) {
            myChar[index] = a[i];
            index++;
        }
        return myArr;
    }
}
