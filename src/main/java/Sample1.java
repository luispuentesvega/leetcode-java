/*
An array with an odd number of elements is said to be centered if all elements (except the middle one) are strictly greater than the value of the middle element. Note that only arrays with an odd number of elements have a middle element. Write a function that accepts an integer array and returns 1 if it is a centered array, otherwise it returns 0.
 */
public class Sample1 {
    public static void main(String[] args) {
        Sample1 s = new Sample1();
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {3,2,1,4,5};
        int[] nums3 = {3, 2, 1, 4, 1};
        int[] nums4 = {1, 2, 3, 4};
        int[] nums5 = {};
        int[] nums6 = {1};
        System.out.println(s.isCentered(nums1) == 0);
        System.out.println(s.isCentered(nums2) == 1);
        System.out.println(s.isCentered(nums3) == 0);
        System.out.println(s.isCentered(nums4) == 0);
        System.out.println(s.isCentered(nums5) == 0);
        System.out.println(s.isCentered(nums6) == 1);
    }

    public int isCentered(int[] arr) {

        // if the array doesn't have middle element
        if(arr.length%2==0) return 0;
        if(arr.length < 0) return 0;
        if(arr.length == 1) return 1;

        int mid = (1 + arr.length-1)/2;
        // loop left side
        for (int i=0; i < mid; i++) {
            if (arr[i] <= arr[mid]) {
                return 0;
            }
        }

        // loop right side
        for (int i=mid+1; i < arr.length-1; i++) {
            if (arr[i] <= arr[mid]) {
                return 0;
            }
        }
        return 1;
    }
}
