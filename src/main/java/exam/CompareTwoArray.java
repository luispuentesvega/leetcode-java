package exam;

import java.util.HashMap;
import java.util.Map;

public class CompareTwoArray {
    public static void main(String args[]) {
        CompareTwoArray compareTwoArray = new CompareTwoArray();
        int[] array1 = new int[]{1, 1, 1, 1, 1, 1};
        int[] array2 = new int[]{1, 1, 1, 1, 1, 2};
        int res = compareTwoArray.equivalentArrays(array1, array2);
        System.out.println("The response is: " + res);
    }

    public static int equivalentArrays(int[] a1, int[] a2) {
        Map<Integer, Integer> count1 = new HashMap<>();
        Map<Integer, Integer> count2 = new HashMap<>();
        for (int i = 0; i < a1.length; i++) {
            count1.put(a1[i], count1.getOrDefault(a1[i], 0) + 1);
        }
        for (int i = 0; i < a2.length; i++) {
            count2.put(a2[i], count2.getOrDefault(a2[i], 0) + 1);
        }

        Map<Integer, Integer> countFinal = count1.size() < count2.size() ? count1 : count2;

        for (Map.Entry<Integer, Integer> entry : countFinal.entrySet()) {
            boolean value1 = count1.containsValue(entry.getValue());
            boolean value2 = count2.containsValue(entry.getValue());
            if (value1 != value2) {
                return 0;
            }
        }
        return 1;
    }
}
