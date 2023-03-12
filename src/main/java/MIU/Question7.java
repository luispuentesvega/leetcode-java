package MIU;

/*
Question 7
Write a function nextPerfectSquare that returns the first perfect square that is greater than
it's integer argument. A perfect square is an integer that is equal to some integer squared.

For example 16 is a perfect square because 16 = 4*4. However 15 is not a perfect square because
there is no integer n such that 15 = n*n.

The signature of the function is
int isPerfectSquare(int n)
Examples
 -------------------------|--------------------------------------------------------------
| n                       | next perfect square                                          |
|-------------------------|--------------------------------------------------------------|
| 6                       | 9                                                            |
|-------------------------|--------------------------------------------------------------|
| 36                      | 49                                                           |
|-------------------------|--------------------------------------------------------------|
| 0                       | 1                                                            |
|-------------------------|--------------------------------------------------------------|
| -5                      | 0                                                            |
 -------------------------|---------------------------------------------------------------
 */

public class Question7 {
    public static void main(String[] args) {
        Question7 q7 = new Question7();
        System.out.println("1:" + q7.isPerfectSquare(6));
        System.out.println("2:" + q7.isPerfectSquare(36));
        System.out.println("3:" + q7.isPerfectSquare(0));
        System.out.println("4:" + q7.isPerfectSquare(-5));
    }

    public int isPerfectSquare(int n) {
        int i = n + 1;
        while (true) {
            int root = (int) Math.sqrt(i);
            if (root * root == i) return i;
            i++;
        }
    }
}
