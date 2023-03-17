package exam;

public class OneTwoThreeArray {
    public static void main(String args[]) {
        OneTwoThreeArray oneTwoThreeArray = new OneTwoThreeArray();
        int[] arr1 = new int[]{1, 2, 3, 3, 2, 1};
        int res1 = oneTwoThreeArray.isValidArray(arr1);
        System.out.println("The response is: " + res1);// 0

        int[] arr2 = new int[]{0, 1, 2, 3, 1, 2, 3};
        int res2 = oneTwoThreeArray.isValidArray(arr2);
        System.out.println("The response is: " + res2);// 0

        int[] arr3 = new int[]{1, 2, 3, 3, 2, 1, 1, 2, 3};
        int res3 = oneTwoThreeArray.isValidArray(arr3);
        System.out.println("The response is: " + res3);// 0

        int[] arr4 = new int[]{1, 2, 3};
        int res4 = oneTwoThreeArray.isValidArray(arr4);
        System.out.println("The response is: " + res4);// 1

        int[] arr5 = new int[]{};
        int res5 = oneTwoThreeArray.isValidArray(arr5);
        System.out.println("The response is: " + res5);// 0
    }

    public int isValidArray(int[] arr) {
        if (arr.length < 3) return 0;

        int i = 0;
        int currentNumber = 1;
        while (i < arr.length) {
            if (arr[i] != currentNumber) {
                return 0;
            }
            currentNumber++;
            if (currentNumber > 3) {
                currentNumber = 1;
            }
            i++;
        }
        return 1;
    }
}
