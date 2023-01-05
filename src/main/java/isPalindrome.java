public class isPalindrome {
    public static void main(String[] args) {
        isPalindrome isP = new isPalindrome();
        boolean isPal = isP.isPalindrome(121);
        System.out.println(isPal == true);
    }
    public boolean isPalindrome(int x) {
        String s[] = Integer.toString(x).split("");
        int left = 0;
        int right = s.length - 1;

        if (s.length == 1) return true;

        boolean is = false;
        while(true) {
            System.out.println(left+" == "+right);
            if(left+1 == right) {
                System.out.println("IF");
                is = s[left].equals(s[right]);
                break;
            } else if (left == right) {
                is = false;
                break;
            }
            else if (s[left].equals(s[right])) {
                System.out.println("ELSE IF 1");
                left++;
                right--;
                System.out.println("HERE::::"+left+" == "+right);
                System.out.println(left == right);
                if (left == right) {
                    is = left == right;
                    break;
                }
                continue;
            } else if(left > right) {
                System.out.println("ELSE IF 2");
                is = true;
                break;
            }
            System.out.println("END");
            break;
        }
        return is;
    }
}

