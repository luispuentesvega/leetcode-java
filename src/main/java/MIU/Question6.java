package MIU;

/*
Question 6
Consider an array A with n of positive integers. An integer idx is called
a POE (point of equilibrium) of A, if A[0]+A[1]+...+A[idx-1] is equal to A[idx+1]+A[idx+2]+...+A[n-1].
Write a function to return POE of an array, if it exists and -1 otherwise.

The signature of the function is:
int f(int[] a)

Examples
 -------------------------|--------------------------------------------------------------
| if the input arrays are | return                                                       |
|-------------------------|--------------------------------------------------------------|
| {1,8,3,7,10,2}          | 3 Reason: a[0]+a[1]+a[2] is equal to a[4]+a[5]               |
|-------------------------|--------------------------------------------------------------|
| {1,5,3,1,1,1,1,1,1}     | 2 Reason: a[0]+a[1] is equal to a[3]+a[4]+a[5]+a[6]+a[7]+a[8]|
|-------------------------|--------------------------------------------------------------|
| {2,1,1,1,2,1,7}         | 5 Reason: a[0]+a[1]+a[2]+a[3]+a[4] is equal to a[6]          |
|-------------------------|--------------------------------------------------------------|
| {1,2,3}                 | -1 Reason: No POE                                            |
|-------------------------|--------------------------------------------------------------|
| {3,4,5,10}              | -1 Reason: No POE                                            |
|-------------------------|--------------------------------------------------------------|
| {1,2,10,3,4}            | -1 Reason: No POE                                            |
 -------------------------|--------------------------------------------------------------


 */

public class Question6 {

    public static void main(String[] args) {
        Question6 q6 = new Question6();
        int a[] = new int[]{1, 8, 3, 7, 10, 2};
        System.out.println(q6.f(a));
        int b[] = new int[]{1, 5, 3, 1, 1, 1, 1, 1, 1};
        System.out.println(q6.f(b));
        int c[] = new int[]{2, 1, 1, 1, 2, 1, 7};
        System.out.println(q6.f(c));
        int d[] = new int[]{1, 2, 3};
        System.out.println(q6.f(d));
        int e[] = new int[]{3, 4, 5, 10};
        System.out.println(q6.f(e));
        int f[] = new int[]{1, 2, 10, 3, 4};
        System.out.println(q6.f(f));
    }

    public int f(int[] a) {
        if (a.length < 4) return -1;

        int left_pos = 1;
        int right_pos = a.length - 1;

        int left = a[0] + a[1];
        int right = a[a.length - 1];

        boolean shall_increase_left = false;
        boolean shall_decrease_right = false;
        while (left_pos < right_pos) {
            if (shall_increase_left) {
                left += a[left_pos];
                shall_increase_left = false;
            }
            if (shall_decrease_right) {
                right += a[right_pos];
                shall_decrease_right = false;
            }

            if (left == right) {
                return left_pos + 1;
            } else if (left < right) {
                shall_increase_left = true;
                left_pos++;
            } else {
                shall_decrease_right = true;
                right_pos--;
            }
        }
        return -1;
    }
}
