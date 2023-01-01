import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main m = new Main();
        m.test();
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