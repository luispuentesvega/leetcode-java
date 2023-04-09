package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        IntersectionOfTwoArrays i = new IntersectionOfTwoArrays();
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        int[] res = i.intersection(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        // define a Set
        HashSet<Integer> inter = new HashSet<Integer>();

        // find the longest array
        int[] longestArray = new int[0];
        int[] smallestArray = new int[0];
        if (nums1.length > nums2.length) {
            longestArray = nums1;
            smallestArray = nums2;
        } else {
            longestArray = nums2;
            smallestArray = nums1;
        }

        // loop the longest array
        for (int i = 0; i < longestArray.length; i++) {
            int currentNum = longestArray[i];
            // find if each element is in the remaining array
            for (int j = 0; j < smallestArray.length; j++) {
                // if, it is in the array, add to the set
                if (currentNum == smallestArray[j]) {
                    inter.add(currentNum);
                }
            }
        }
        //return the set in array format
        int[] res = new int[inter.size()];
        int i = 0;
        for (int num : inter) {
            res[i++] = num;
        }
        return res;
    }
}
