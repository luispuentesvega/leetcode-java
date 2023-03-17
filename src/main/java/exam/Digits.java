package exam;

public class Digits {
    public static void main(String args[]) {
        Digits digits = new Digits();
        System.out.println("Response 1: " + digits.isDigitIncreasing(7));//1
        System.out.println("Response 2: " + digits.isDigitIncreasing(36));//1
        System.out.println("Response 3: " + digits.isDigitIncreasing(984));//1
        System.out.println("Response 4: " + digits.isDigitIncreasing(7404));//1
        System.out.println("Response 5: " + digits.isDigitIncreasing(37));//0
    }

    public int isDigitIncreasing(int n) {
        int i = 1;
        while (i <= 9) {
            int sum = 0;
            int multiply = 0;

            while (sum < n) {
                multiply = (multiply * 10) + i;
                sum += multiply;
            }

            // if the sum is equal to the number, return 1
            if (sum == n) return 1;
            i++;
        }
        return 0;
    }

}
