import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main m = new Main();
        m.test();
        System.out.printf("This is one example %d", 1);
        System.out.printf("This is a float number %n %.3f", 1.23456);
        System.out.printf("%8d", 1);
        Scanner input = new Scanner(System.in);
        System.out.println("Type the number");
        int num = input.nextInt();
        System.out.printf("You typed %d", num);
    }

    public void test() {
        ArrayList<String> myArr = new ArrayList<String>();
        myArr.add("Luis");
        myArr.add("Puentes");
        System.out.println(myArr.toString());

        Iterator i = myArr.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}