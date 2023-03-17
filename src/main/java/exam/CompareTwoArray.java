package exam;

import java.util.HashMap;
import java.util.Map;

public class CompareTwoArray {
    public static void main(String args[]) {
        CompareTwoArray compareTwoArray = new CompareTwoArray();
        int[] array1_1 = new int[]{0, 1, 2};
        int[] array2_1 = new int[]{2, 0, 1};
        int res1 = compareTwoArray.equivalentArrays(array1_1, array2_1);
        System.out.println("Test 1: " + res1);//1

        int[] array1_2 = new int[]{0, 1, 2, 1};
        int[] array2_2 = new int[]{2, 0, 1};
        int res2 = compareTwoArray.equivalentArrays(array1_2, array2_2);
        System.out.println("Test 2: " + res2);//1

        int[] array1_3 = new int[]{2, 0, 1};
        int[] array2_3 = new int[]{0, 1, 2, 1};
        int res3 = compareTwoArray.equivalentArrays(array1_3, array2_3);
        System.out.println("Test 3: " + res3);//1

        int[] array1_4 = new int[]{0, 5, 5, 5, 1, 2, 1};
        int[] array2_4 = new int[]{5, 2, 0, 1};
        int res4 = compareTwoArray.equivalentArrays(array1_4, array2_4);
        System.out.println("Test 4: " + res4); //1

        int[] array1_5 = new int[]{5, 2, 0, 1};
        int[] array2_5 = new int[]{0, 5, 5, 5, 1, 2, 1};
        int res5 = compareTwoArray.equivalentArrays(array1_5, array2_5);
        System.out.println("Test 5: " + res5);//1

        int[] array1_6 = new int[]{0, 2, 1, 2};
        int[] array2_6 = new int[]{3, 1, 2, 0};
        int res6 = compareTwoArray.equivalentArrays(array1_6, array2_6);
        System.out.println("Test 6: " + res6);//0

        int[] array1_7 = new int[]{3, 1, 2, 0};
        int[] array2_7 = new int[]{0, 2, 1, 0};
        int res7 = compareTwoArray.equivalentArrays(array1_7, array2_7);
        System.out.println("Test 7: " + res7);//0

        int[] array1_8 = new int[]{1, 1, 1, 1, 1, 1};
        int[] array2_8 = new int[]{1, 1, 1, 1, 1, 2};
        int res8 = compareTwoArray.equivalentArrays(array1_8, array2_8);
        System.out.println("Test 8: " + res8);//0

        int[] array1_9 = new int[]{};
        int[] array2_9 = new int[]{3, 1, 1, 1, 1, 2};
        int res9 = compareTwoArray.equivalentArrays(array1_9, array2_9);
        System.out.println("Test 9: " + res9);//0

        int[] array1_10 = new int[]{};
        int[] array2_10 = new int[]{};
        int res10 = compareTwoArray.equivalentArrays(array1_10, array2_10);
        System.out.println("Test 9: " + res10);//1
    }

    public static int equivalentArrays(int[] a1, int[] a2) {
        Map<Integer, Boolean> count1 = new HashMap<>();
        Map<Integer, Boolean> count2 = new HashMap<>();
        for (int i = 0; i < a1.length; i++) {
            count1.put(a1[i], true);
        }
        for (int i = 0; i < a2.length; i++) {
            count2.put(a2[i], true);
        }

        // compare the array of the hashmaps with unique keys, and not the length of the original arrays
        return count1.size() == count2.size() ? 1 : 0;
    }
}
